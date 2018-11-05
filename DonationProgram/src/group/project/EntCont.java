/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Kevin G. Lancaster
 */
public class EntCont extends Main_Selection
{
    Font defFont = new Font("Times New Roman", 15.75);
    Font smlFont = new Font("Times New Roman", 12);
    File offType = new File("Offering Types.txt");
    FileWriter offTypeAdd;

    public EntCont() throws IOException
    {
        this.offTypeAdd = new FileWriter("Offering Types.txt");
    }
    
    @Override
    public void start(Stage primaryStage)
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
        Label lblNameBox = new Label("Name:");
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
    }
}
