/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Jedidiah Bird
 */
public class DonorScreen
{
    
    private Stage donorStage = new Stage();
    private DonorMain donorList = new DonorMain();
    
    public void addDonorScreen()
    {
        
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");  
        Date currentDate = new Date();
        
        Label lastNameLbl = new Label("Last (Family) Name:");
        lastNameLbl.setMinWidth(350);
        TextField lastNameField = new TextField(); 
        lastNameField.setMinWidth(350);
        HBox lastHBox = new HBox(20, lastNameLbl, lastNameField);
        lastHBox.setAlignment(Pos.CENTER);

        Label firstNameLbl = new Label("First Name and Initial:");
        firstNameLbl.setMinWidth(350);
        TextField firstNameField = new TextField();
        firstNameField.setMinWidth(350);
        HBox firstHBox = new HBox(20, firstNameLbl, firstNameField);
        firstHBox.setAlignment(Pos.CENTER);

        Label spouseNameLbl = new Label("Spouse Name and Initial (Optional):");
        spouseNameLbl.setMinWidth(350);
        TextField spouseNameField = new TextField();
        spouseNameField.setMinWidth(350);
        HBox spouseHBox = new HBox(20, spouseNameLbl, spouseNameField);
        spouseHBox.setAlignment(Pos.CENTER);

        Label donorNotesLbl = new Label("Additional Notes for Treasurer "
                + "(Use Commas to Separate Lines):");
        HBox labelHBox = new HBox(donorNotesLbl);
        TextField donorNotesField = new TextField();
        donorNotesField.setMinSize(720, 100);
        HBox fieldHBox = new HBox(donorNotesField);
        VBox notesVBox = new VBox(10, labelHBox, fieldHBox);
        HBox notesHBox = new HBox(10, notesVBox);
        notesHBox.setAlignment(Pos.CENTER);


        Button saveDonorBtn = new Button("Add Name and Return to "
            + "Contribution Entry");
        saveDonorBtn.setOnAction(e ->
        {
            File donations = new File("newdonors" + formatter.format(currentDate)
            + ".txt");
            PrintWriter printWriter = null;
            try
            {
                FileWriter fileWriter = new FileWriter(donations, true);
                printWriter = new PrintWriter(fileWriter);
                StringBuilder tempString = new StringBuilder();
                String fullName = new String();
                
                String[] donorNotes;
                donorNotes = donorNotesField.getText().split(",[ ]*");
                
                fullName = tempString.append(lastNameField.getText())
                    .append(", ").append(firstNameField.getText()).append(" & ")
                    .append(spouseNameField.getText()).toString().toUpperCase();
                tempString.append(";");
                for (String donorNote : donorNotes)
                {
                    tempString.append(donorNote).append(";");
                }
                printWriter.println(tempString);
                
                
                donorList.addDonor(new Donor(firstNameField.getText(),
                    spouseNameField.getText(), lastNameField.getText(),
                    donorNotes));
                donorList.getDonors();
            }
            catch (IOException error)
            {
                System.out.println("Error: " + error.getMessage());
            }
            finally
            {
                if (printWriter != null)
                {
                    printWriter.close();
                }
            }

            donorStage.close();
        });
        HBox btnHBox = new HBox(saveDonorBtn);
        btnHBox.setAlignment(Pos.CENTER);
        btnHBox.setMinWidth(400);

        VBox donorVBox = new VBox(20, lastHBox, firstHBox, spouseHBox,
            notesHBox, btnHBox);

        Scene donorScene = new Scene(donorVBox);

        donorStage.setScene(donorScene);
        donorStage.setTitle("Add New Donor");
        donorStage.setWidth(800);
        donorStage.setHeight(400);
        donorStage.show();
    }
    
}
