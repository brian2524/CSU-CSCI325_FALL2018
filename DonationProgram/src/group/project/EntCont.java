/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import java.util.ArrayList;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Kevin G. Lancaster
 */
public class EntCont
{
    File offTypes = new File("Offering Types.txt");
    File names = new File("Names.txt");
    FileWriter offTypeAdd;
    FileReader offTypeRead;
    FileReader namesRead;
    Stage stgEntCont = new Stage();
    Font defFont = new Font("Times New Roman", 15.75);
    Font smlFont = new Font("Times New Roman", 12);
    private AddNewDonor newDonor;
    private String name, offType, amtStr, chkNum;
    //private ArrayList<Donor> newDonorList; 

    public EntCont() throws IOException
    {
//        this.offTypeAdd = new FileWriter(offType);
//        this.offTypeRead = new FileReader(offType);
//        this.namesRead = new FileReader(names);
        this.newDonor = new AddNewDonor();
    }
    
    public void entCont(ArrayList<Donation> wkDon, ArrayList<Donor> newDon)
    {
        // Combo Box Declaration and Sizing
        ComboBox cboName = new ComboBox();
        cboName.setVisibleRowCount(8);
        cboName.setMaxSize(335, 31);
        cboName.setMinSize(335, 31);
        cboName.setEditable(true);
        // cboName.setItems(Names.txt);
        ComboBox cboOffType1 = new ComboBox();
        cboOffType1.setVisibleRowCount(8);
        cboOffType1.setMaxSize(260, 31);
        cboOffType1.setMinSize(260, 31);
        cboOffType1.setEditable(true);
        ComboBox cboOffType2 = new ComboBox();
        cboOffType2.setVisibleRowCount(8);
        cboOffType2.setMaxSize(260, 31);
        cboOffType2.setMinSize(260, 31);
        cboOffType2.setEditable(true);
        ComboBox cboOffType3 = new ComboBox();
        cboOffType3.setVisibleRowCount(8);
        cboOffType3.setMaxSize(260, 31);
        cboOffType3.setMinSize(260, 31);
        cboOffType3.setEditable(true);
        ComboBox cboOffType4 = new ComboBox();
        cboOffType4.setVisibleRowCount(8);
        cboOffType4.setMaxSize(260, 31);
        cboOffType4.setMinSize(260, 31);
        cboOffType4.setEditable(true);
        
        // TextField Declaration and Sizing
        TextField txtAmt1 = new TextField();
        txtAmt1.setMaxSize(120, 32);
        txtAmt1.setMinSize(120, 32);
        txtAmt1.setAlignment(Pos.CENTER_LEFT);
        TextField txtCheckNum1 = new TextField();
        txtCheckNum1.setMaxSize(100, 32);
        txtCheckNum1.setMinSize(100, 32);
        txtCheckNum1.setAlignment(Pos.CENTER_LEFT);
        TextField txtAmt2 = new TextField();
        txtAmt2.setMaxSize(120, 32);
        txtAmt2.setMinSize(120, 32);
        txtAmt2.setAlignment(Pos.CENTER_LEFT);
        TextField txtCheckNum2 = new TextField();
        txtCheckNum2.setMaxSize(100, 32);
        txtCheckNum2.setMinSize(100, 32);
        txtCheckNum2.setAlignment(Pos.CENTER_LEFT);
        TextField txtAmt3 = new TextField();
        txtAmt3.setMaxSize(120, 32);
        txtAmt3.setMinSize(120, 32);
        txtAmt3.setAlignment(Pos.CENTER_LEFT);
        TextField txtCheckNum3 = new TextField();
        txtCheckNum3.setMaxSize(100, 32);
        txtCheckNum3.setMinSize(100, 32);
        txtCheckNum3.setAlignment(Pos.CENTER_LEFT);
        TextField txtAmt4 = new TextField();
        txtAmt4.setMaxSize(120, 32);
        txtAmt4.setMinSize(120, 32);
        txtAmt4.setAlignment(Pos.CENTER_LEFT);
        TextField txtCheckNum4 = new TextField();
        txtCheckNum4.setMaxSize(100, 32);
        txtCheckNum4.setMinSize(100, 32);
        txtCheckNum4.setAlignment(Pos.CENTER_LEFT);
        
        // Button Declaration, Sizing, Font, and Alignment
        Button btnNewDonor = new Button("New Donor Information");
        btnNewDonor.setMaxSize(200, 31);
        btnNewDonor.setMinSize(200, 31);
        btnNewDonor.setFont(defFont);
        btnNewDonor.setAlignment(Pos.CENTER);
        Button btnNewOffType = new Button("Add New\nOffering\nType");
        btnNewOffType.setMaxSize(120, 80);
        btnNewOffType.setMinSize(120, 80);
        btnNewOffType.setFont(defFont);
        btnNewOffType.setAlignment(Pos.CENTER);
        Button btnSaveCurrent = new Button("Save Current Contributor Information");
        btnSaveCurrent.setMaxSize(450, 60);
        btnSaveCurrent.setMinSize(450, 60);
        btnSaveCurrent.setFont(defFont);
        btnSaveCurrent.setAlignment(Pos.CENTER);
        Button btnExitEntCont = new Button("Finished Entering Contributions");
        btnExitEntCont.setMaxSize(450, 60);
        btnExitEntCont.setMinSize(450, 60);
        btnExitEntCont.setFont(defFont);
        btnExitEntCont.setAlignment(Pos.CENTER);
        
        // Label Declaration, Font, and Alignment
        Label lblNameBox = new Label("\tName:");
        lblNameBox.setFont(defFont);
        lblNameBox.setAlignment(Pos.CENTER);
        Label lblLoose = new Label("or \"Loose Offering\"");
        lblLoose.setFont(smlFont);
        lblLoose.setAlignment(Pos.CENTER);
        Label lblOffType = new Label("Offering Type");
        lblOffType.setFont(defFont);
        lblOffType.setAlignment(Pos.CENTER);
        Label lblAmt = new Label("Amount");
        lblAmt.setFont(defFont);
        lblAmt.setAlignment(Pos.CENTER);
        Label lblCheckNum = new Label("Check Num\nor \"Cash\"");
        lblCheckNum.setFont(defFont);
        lblCheckNum.setAlignment(Pos.CENTER);
        
        // Arrange elements and controls in Scene
        
        // Offering Entry section
        GridPane offEntry = new GridPane();
        offEntry.addRow(0, lblOffType, lblAmt, lblCheckNum);
        offEntry.addRow(1, cboOffType1, txtAmt1, txtCheckNum1);
        offEntry.addRow(2, cboOffType2, txtAmt2, txtCheckNum2);
        offEntry.addRow(3, cboOffType3, txtAmt3, txtCheckNum3);
        offEntry.addRow(4, cboOffType4, txtAmt4, txtCheckNum4);
        offEntry.add(btnNewOffType, 4, 1, 1, 2);
        offEntry.setHgap(30);
        offEntry.setVgap(20);
        offEntry.setAlignment(Pos.CENTER);
        
        // Name Entry section
        GridPane nameEntry = new GridPane();
        nameEntry.addRow(0, lblNameBox, cboName, btnNewDonor);
        nameEntry.add(lblLoose, 0, 1, 2, 1);
        nameEntry.setAlignment(Pos.CENTER);
        nameEntry.setHgap(30);
        
        // Combine Sections into Scene and output Scene onto Stage
        VBox allEntCont = new VBox();
        allEntCont.setAlignment(Pos.CENTER);
        allEntCont.setPadding(new Insets(25));
        allEntCont.setSpacing(50);
        allEntCont.getChildren().addAll(nameEntry, offEntry, btnSaveCurrent,
                                        btnExitEntCont);
        
        Scene scnEntCont = new Scene(allEntCont);        
        stgEntCont.setTitle("Contribution Entry");
        stgEntCont.setScene(scnEntCont);
        stgEntCont.setMaximized(true);
        stgEntCont.show();
        
        // Register Buttons
        btnExitEntCont.setOnAction(e -> {stgEntCont.close();});
        btnNewDonor.setOnAction(e -> {newDonor.addNewDonor(newDon);});
        btnSaveCurrent.setOnAction(e ->
        {
            Double amtDbl;
            name = cboName.getEditor().getText();
            if (!"".equals(cboOffType1.getEditor().getText()))
            {
                offType = cboOffType1.getEditor().getText();
                amtStr = txtAmt1.getText();
                amtStr = amtStr.substring(1);
                amtDbl = parseDouble(amtStr);
                chkNum = txtCheckNum1.getText();
                Donation temp = new Donation(name, offType, amtDbl, chkNum);
                wkDon.add(temp);
            }
            if (!"".equals(cboOffType2.getEditor().getText()))
            {
                offType = cboOffType2.getEditor().getText();
                amtStr = txtAmt2.getText();
                amtStr = amtStr.substring(1);
                amtDbl = parseDouble(amtStr);
                chkNum = txtCheckNum2.getText();
                Donation temp = new Donation(name, offType, amtDbl, chkNum);
                wkDon.add(temp);
            }
            if (!"".equals(cboOffType3.getEditor().getText()))
            {
                offType = cboOffType3.getEditor().getText();
                amtStr = txtAmt3.getText();
                amtStr = amtStr.substring(1);
                amtDbl = parseDouble(amtStr);
                chkNum = txtCheckNum3.getText();
                Donation temp = new Donation(name, offType, amtDbl, chkNum);
                wkDon.add(temp);
            }
            if (!"".equals(cboOffType4.getEditor().getText()))
            {
                offType = cboOffType4.getEditor().getText();
                amtStr = txtAmt4.getText();
                amtStr = amtStr.substring(1);
                amtDbl = parseDouble(amtStr);
                chkNum = txtCheckNum4.getText();
                Donation temp = new Donation(name, offType, amtDbl, chkNum);
                wkDon.add(temp);
            }
            cboName.getEditor().setText("");
            cboOffType1.getEditor().setText("");
            txtAmt1.setText("");
            txtCheckNum1.setText("");
            cboOffType2.getEditor().setText("");
            txtAmt2.setText("");
            txtCheckNum2.setText("");
            cboOffType3.getEditor().setText("");
            txtAmt3.setText("");
            txtCheckNum3.setText("");
            cboOffType4.getEditor().setText("");
            txtAmt4.setText("");
            txtCheckNum4.setText("");
            cboName.requestFocus();
        });

        
        // Focus Change Registration - Used for $ and CASH
        txtAmt1.focusedProperty().addListener((obs, oldVal, newVal) ->
        {
            if (oldVal && !newVal)
            {
                txtAmt1.setText("$" + txtAmt1.getText());
            }
        });
        txtCheckNum1.focusedProperty().addListener((obs, oldVal, newVal) ->
        {
            if (oldVal && !newVal)
            {
                if (txtCheckNum1.getText().equalsIgnoreCase("CASH"))
                {
                    txtCheckNum1.setText("CASH");
                }
            }
        });
        txtAmt2.focusedProperty().addListener((obs, oldVal, newVal) ->
        {
            if (oldVal && !newVal)
            {
                txtAmt2.setText("$" + txtAmt1.getText());
            }
        });
        txtCheckNum2.focusedProperty().addListener((obs, oldVal, newVal) ->
        {
            if (oldVal && !newVal)
            {
                if (txtCheckNum2.getText().equalsIgnoreCase("CASH"))
                {
                    txtCheckNum2.setText("CASH");
                }
            }
        });
        txtAmt3.focusedProperty().addListener((obs, oldVal, newVal) ->
        {
            if (oldVal && !newVal)
            {
                txtAmt3.setText("$" + txtAmt1.getText());
            }
        });
        txtCheckNum3.focusedProperty().addListener((obs, oldVal, newVal) ->
        {
            if (oldVal && !newVal)
            {
                if (txtCheckNum3.getText().equalsIgnoreCase("CASH"))
                {
                    txtCheckNum3.setText("CASH");
                }
            }
        });
        txtAmt4.focusedProperty().addListener((obs, oldVal, newVal) ->
        {
            if (oldVal && !newVal)
            {
                txtAmt4.setText("$" + txtAmt1.getText());
            }
        });
        txtCheckNum4.focusedProperty().addListener((obs, oldVal, newVal) ->
        {
            if (oldVal && !newVal)
            {
                if (txtCheckNum4.getText().equalsIgnoreCase("CASH"))
                {
                    txtCheckNum4.setText("CASH");
                }
            }
        });
    }
}
