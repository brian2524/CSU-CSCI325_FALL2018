/*
 * Student Name: Brian Hinkle
 * Program Name: Donation Program
 * Creation Date: 11/28/2018
 * Last Modified Date: 11/2/2020
 * CSCI Course: CSCI 325
 * Grade Received: A
 * Design Comments:
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

import java.util.ArrayList;
import java.util.Optional;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Kevin G. Lancaster
 */
public class AddNewDonor
{
    Stage stgNewDonor = new Stage();
    Font defFont = new Font("Times New Roman", 15.75);
    Font smlFont = new Font("Times New Roman", 12);
    String firstName1, firstName2, lastName, notes;
    
    public String addNewDonor(ArrayList<Donor> newDonorList)
    {
        String retVal = "";

        // Miscellaneous Strings (Compile-time not empty)
        String strBtnAddExit = ("Add Name and Return to Contribution " +
                                "Entry");

        // Text Box Declaration, etc.
        TextField txtFirstName1 = new TextField();
            txtFirstName1.setFont(defFont);
            txtFirstName1.setMinSize(200, 32);
            txtFirstName1.setMaxSize(200, 32);
        TextField txtFirstName2 = new TextField();
            txtFirstName2.setFont(defFont);
            txtFirstName2.setMinSize(200, 32);
            txtFirstName2.setMaxSize(200, 32);
        TextField txtLastName = new TextField();
            txtLastName.setFont(defFont);
            txtLastName.setMinSize(200, 32);
            txtLastName.setMaxSize(200, 32);
        TextArea txtNote = new TextArea();
            txtNote.setWrapText(true);
            txtNote.setFont(smlFont);
            txtNote.setMinSize(480, 96);
            txtNote.setMaxSize(480, 96);
        
        // Label Declaration, etc.
        Label lblFirstName1 = new Label("First Name 1 (Head): ");
            lblFirstName1.setFont(defFont);
        Label lblFirstName2 = new Label("First Name 2 (Spouse): ");
            lblFirstName2.setFont(defFont);
        Label lblLastName = new Label("Last Name (Family): ");
            lblLastName.setFont(defFont);
        Label lblNote = new Label("Notes: ");
            lblNote.setFont(defFont);
        
        // Button Declarations, etc.
        Button btnAddExit = new Button(strBtnAddExit);
            btnAddExit.setFont(defFont);
            btnAddExit.setAlignment(Pos.CENTER);
            btnAddExit.setMinSize(430, 60);
            btnAddExit.setMaxSize(430, 60);
        
        // Place the buttons and information labels into a Grid Pane
        GridPane addDonor = new GridPane();
        ColumnConstraints addDonorLeft = new ColumnConstraints();
        addDonorLeft.setHalignment(HPos.RIGHT);
        addDonor.addColumn(0, lblFirstName1, lblFirstName2, lblLastName, lblNote);
        addDonor.addColumn(1, txtFirstName1, txtFirstName2, txtLastName,
                           txtNote);
        addDonor.add(btnAddExit, 0, 4, 2, 1);
        addDonor.setVgap(20);
        addDonor.setHgap(20);
        addDonor.getColumnConstraints().add(0, addDonorLeft);
        addDonor.setAlignment(Pos.CENTER);
        addDonor.setPadding(new Insets(50));
        
        // Create and Output Scene onto stage
        Scene scnMainSelect = new Scene(addDonor);        
        stgNewDonor.setTitle("Add New Donor");
        stgNewDonor.setScene(scnMainSelect);
        stgNewDonor.setMaximized(true);
        stgNewDonor.show();

        // Button Registration
        btnAddExit.setOnAction(e ->
        {
            Optional<ButtonType> btnPress;
            Alert noName;
            boolean validInput;
            String noNameText = ("You did not enter a name.\nPress CANCEL to " +
                                 "go back and enter a name.\n\tPress OK to " +
                                 "continue without adding a new donor.");
            firstName1 = txtFirstName1.getText();
            firstName2 = txtFirstName2.getText();
            lastName = txtLastName.getText();
            notes = txtNote.getText();
            if ("".equals(firstName1) && "".equals(firstName2) &&
                "".equals(lastName))
            {
                noName = new Alert(AlertType.CONFIRMATION, noNameText);
                btnPress = noName.showAndWait();
                validInput = ((btnPress.isPresent()) &&
                              (btnPress.get() == ButtonType.OK));
            }
            else
            {
                Donor tempDonor = new Donor(firstName1, firstName2, lastName,
                                            notes);
                newDonorList.add(tempDonor);
                newDonorList.sort(null);
                tempDonor.getName();
                validInput = true;
            }
            if (validInput) stgNewDonor.close();
        });
        return retVal;
    }
    
    public String getFirstName1()
    {
        return firstName1;
    }

    public String getFirstName2()
    {
        return firstName2;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getNotes()
    {
        return notes;
    }
}
