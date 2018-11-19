/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

import java.util.ArrayList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    
    public void addNewDonor(ArrayList<Donor> newDonorList)
    {
        // Miscellaneous Strings (Compile-time not empty)
        String strBtnAddExit = ("Add Name and Return to Contribution " +
                                "Entry");

        // Text Box Declaration, etc.
        TextField txtFirstName1 = new TextField();
        TextField txtFirstName2 = new TextField();
        TextField txtLastName = new TextField();
        txtFirstName1.setFont(defFont);
        txtFirstName1.setMinSize(200, 32);
        txtFirstName1.setMaxSize(200, 32);
        txtFirstName2.setFont(defFont);
        txtFirstName2.setMinSize(200, 32);
        txtFirstName2.setMaxSize(200, 32);
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
        Label lblFirstName2 = new Label("First Name 2 (Spouse): ");
        Label lblLastName = new Label("Last Name (Family): ");
        Label lblNote = new Label("Notes: ");
        lblFirstName1.setFont(defFont);
        lblFirstName2.setFont(defFont);
        lblLastName.setFont(defFont);
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
            firstName1 = txtFirstName1.getText();
            firstName2 = txtFirstName2.getText();
            lastName = txtLastName.getText();
            notes = txtNote.getText();
            Donor tempDonor = new Donor(firstName1, firstName2, lastName, notes);
            newDonorList.add(tempDonor);
            stgNewDonor.close();
        });
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
