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
import static java.lang.Double.parseDouble;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author Jedidiah Bird
 */
public class DonationScreen {
    
    private Stage donationStage = new Stage();
    private DonationMain donationList = new DonationMain();
    private DonorScreen addDonor = new DonorScreen();
    
    public void addDonationScreen(){
        
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");  
        Date currentDate = new Date();
        
        Label nameLbl = new Label("Name");
        TextField nameField = new TextField();
        nameField.setMinWidth(500);
        Button donorBtn = new Button("New Donor");
        donorBtn.setOnAction(e ->
        {
            addDonor.addDonorScreen();
        });
        HBox nameHBox = new HBox(20, nameLbl, nameField, donorBtn);
        nameHBox.setAlignment(Pos.CENTER);

        Label typeLbl = new Label("Offering Type: ");
        TextField typeField1 = new TextField();
        TextField typeField2 = new TextField();
        TextField typeField3 = new TextField();
        TextField typeField4 = new TextField();
        VBox typeVBox = new VBox(20, typeLbl, typeField1, typeField2,
            typeField3, typeField4);
        typeVBox.setMinWidth(300);

        Label amtLbl = new Label("Amount: ");
        TextField amtField1 = new TextField();
        TextField amtField2 = new TextField();
        TextField amtField3 = new TextField();
        TextField amtField4 = new TextField();
        VBox amtVBox = new VBox(20, amtLbl, amtField1, amtField2, amtField3,
            amtField4);
        amtVBox.setMinWidth(150);

        Label checkLbl = new Label("Check # or 'Cash': ");
        TextField checkField1 = new TextField();
        TextField checkField2 = new TextField();
        TextField checkField3 = new TextField();
        TextField checkField4 = new TextField();
        VBox checkVBox = new VBox(20, checkLbl, checkField1, checkField2,
            checkField3, checkField4);
        checkVBox.setMinWidth(150);

        Button typeBtn = new Button("Add new Offering Type");
        typeBtn.setTextAlignment(TextAlignment.CENTER);
        typeBtn.setMinWidth(70);
        typeBtn.setMaxSize(70, 70);
        typeBtn.setWrapText(true);

        HBox dHBox = new HBox(20, typeVBox, amtVBox, checkVBox, typeBtn);
        dHBox.setAlignment(Pos.CENTER);

        Button sBtn = new Button("Save Current Contributor Information");
        sBtn.setMinWidth(400);
        sBtn.setOnAction(e ->
        {
            
            File donations = new File("donations" + formatter.format(currentDate)
            + ".txt");
            PrintWriter printWriter = null;
            try
            {
                FileWriter fileWriter = new FileWriter(donations, true);
                printWriter = new PrintWriter(fileWriter);
                StringBuilder tempString = new StringBuilder();
                
                if (typeField1.getText().isEmpty())
                {
                    
                }
                else
                {
                    tempString.append(nameField.getText()).append(";")
                        .append(typeField1.getText()).append(";")
                        .append(String.format("%,.2f",
                            parseDouble(amtField1.getText())))
                        .append(";").append(checkField1.getText());
                    printWriter.println(tempString);
                    donationList.addDonations(new Donation(nameField.getText(),
                    typeField1.getText(), parseDouble(amtField1.getText()),
                    checkField1.getText()));
                    typeField1.setText("");
                    amtField1.setText("");
                    checkField1.setText("");
                    tempString.delete(0, tempString.length());
                }
                if (typeField2.getText().isEmpty())
                {
                    
                }
                else
                {
                    tempString.append(nameField.getText()).append(";")
                        .append(typeField2.getText()).append(";")
                        .append(String.format("%,.2f",
                            parseDouble(amtField2.getText())))
                        .append(";").append(checkField2.getText());
                    printWriter.println(tempString);
                    donationList.addDonations(new Donation(nameField.getText(),
                    typeField2.getText(), parseDouble(amtField2.getText()),
                    checkField2.getText()));
                    typeField2.setText("");
                    amtField2.setText("");
                    checkField2.setText("");
                    tempString.delete(0, tempString.length());
                }
                if (typeField3.getText().isEmpty())
                {
                    
                }
                else
                {
                    tempString.append(nameField.getText()).append(";")
                        .append(typeField3.getText()).append(";")
                        .append(String.format("%,.2f",
                            parseDouble(amtField3.getText())))
                        .append(";").append(checkField3.getText());
                    printWriter.println(tempString);
                    donationList.addDonations(new Donation(nameField.getText(),
                    typeField3.getText(), parseDouble(amtField3.getText()),
                    checkField3.getText()));
                    typeField3.setText("");
                    amtField3.setText("");
                    checkField3.setText("");
                    tempString.delete(0, tempString.length());
                }
                if (typeField4.getText().isEmpty())
                {
                    
                }
                else
                {
                    tempString.append(nameField.getText()).append(";")
                        .append(typeField4.getText()).append(";")
                        .append(String.format("%,.2f",
                            parseDouble(amtField4.getText())))
                        .append(";").append(checkField4.getText());
                    printWriter.println(tempString);
                    donationList.addDonations(new Donation(nameField.getText(),
                    typeField4.getText(), parseDouble(amtField4.getText()),
                    checkField4.getText()));
                    typeField4.setText("");
                    amtField4.setText("");
                    checkField4.setText("");
                    tempString.delete(0, tempString.length());
                }
                nameField.setText("");
                donationList.getDonations();

            }
            catch(IOException error)
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

        });

        Button qBtn = new Button("Finished Entering Contributions");
        qBtn.setMinWidth(400);
        qBtn.setOnAction(e ->
        {
            donationStage.close();
        });

        VBox btnVBox = new VBox(20, sBtn, qBtn);
        btnVBox.setAlignment(Pos.CENTER);

        VBox mainVBox = new VBox(20, nameHBox, dHBox, btnVBox);  
        mainVBox.setAlignment(Pos.CENTER);

        Scene donationScene = new Scene(mainVBox);

        donationStage.setScene(donationScene);
        donationStage.setTitle("Contribution Entry");
        donationStage.setWidth(800);
        donationStage.setHeight(400);
        donationStage.show();
    }
    
}
