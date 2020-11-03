  
/*
 * Student Name: Brian Hinkle
 * Program Name: Donation Program
 * Creation Date: 11/26/2018
 * Last Modified Date: 11/2/2020
 * CSCI Course: CSCI 325
 * Grade Received: A
 * Design Comments:
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

// Java and JavaFX Library items;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

// Other Libraries - Not my code!!

    // See http://fxexperience.controlsfx for links and/or javadoc
    import org.controlsfx.control.textfield.TextFields;


/**
 *
 * @author Kevin G. Lancaster
 */
public class EntCont
{
    List<String> offTypeList = null;
    List<String> namesList = null;
    ObservableList<String> offTypes;
    ObservableList<String> names;
    BufferedReader offTypeRead;
    String offTypeFileName = ("Offering Types.txt");
    BufferedReader namesRead;
    String namesFileName = ("Names.txt");
    FileWriter offTypeWrite;
    Stage stgEntCont = new Stage();
    Font defFont = new Font("Times New Roman", 15.75);
    Font smlFont = new Font("Times New Roman", 12);
    private AddNewDonor newDonor;
    private String name, offType, amtStr, chkNum;
    private ComboBox cboOffType1, cboOffType2, cboOffType3, cboOffType4, cboName; 

    public EntCont() throws IOException
    {
        this.offTypeList = new ArrayList<>();
        this.namesList = new ArrayList<>();
        offTypes = FXCollections.observableList(offTypeList);
        names = FXCollections.observableList(namesList);
        offTypeRead = Files.newBufferedReader(Paths.get(offTypeFileName));
        namesRead = Files.newBufferedReader(Paths.get(namesFileName));
        String line;
        while ((line = offTypeRead.readLine()) != null)
        {
            offTypeList.add(line);
        }
        offTypeRead.close();
        while ((line = namesRead.readLine()) != null)
        {
            namesList.add(line);
        }
        namesRead.close();
        this.newDonor = new AddNewDonor();
    }
    
    public void entCont(ArrayList<Donation> wkDon, ArrayList<Donor> newDon)
    {
        // Combo Box Declaration and Sizing
        cboName = new ComboBox();
            cboName.setVisibleRowCount(8);
            cboName.setMaxSize(335, 31);
            cboName.setMinSize(335, 31);
            cboName.setEditable(true);
            cboName.setItems(names);
            TextFields.bindAutoCompletion(cboName.getEditor(),
                                          cboName.getItems());
        cboOffType1 = new ComboBox();
            cboOffType1.setVisibleRowCount(8);
            cboOffType1.setMaxSize(260, 31);
            cboOffType1.setMinSize(260, 31);
            cboOffType1.setEditable(true);
            cboOffType1.setItems(offTypes);
            TextFields.bindAutoCompletion(cboOffType1.getEditor(),
                                          cboOffType1.getItems());
        cboOffType2 = new ComboBox();
            cboOffType2.setVisibleRowCount(8);
            cboOffType2.setMaxSize(260, 31);
            cboOffType2.setMinSize(260, 31);
            cboOffType2.setEditable(true);
            cboOffType2.setItems(offTypes);
            TextFields.bindAutoCompletion(cboOffType2.getEditor(),
                                          cboOffType2.getItems());
        cboOffType3 = new ComboBox();
            cboOffType3.setVisibleRowCount(8);
            cboOffType3.setMaxSize(260, 31);
            cboOffType3.setMinSize(260, 31);
            cboOffType3.setEditable(true);
            cboOffType3.setItems(offTypes);
            TextFields.bindAutoCompletion(cboOffType3.getEditor(),
                                          cboOffType3.getItems());
        cboOffType4 = new ComboBox();
            cboOffType4.setVisibleRowCount(8);
            cboOffType4.setMaxSize(260, 31);
            cboOffType4.setMinSize(260, 31);
            cboOffType4.setEditable(true);
            cboOffType4.setItems(offTypes);
            TextFields.bindAutoCompletion(cboOffType4.getEditor(),
                                          cboOffType4.getItems());
        
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
        btnNewDonor.setOnAction(e ->
        {
            try
            {
                addNewDon(newDon);
            }
            catch (IOException ex)
            {
                Logger.getLogger(EntCont.class.getName()).log(Level.SEVERE,
                                                              null, ex);
            } 
        });
        btnNewOffType.setOnAction(e ->
        {
            try
            {
                addOffType();
            }
            catch (IOException ex)
            {
                Logger.getLogger(EntCont.class.getName()).log(Level.SEVERE,
                                                              null, ex);
            }
        });
        btnSaveCurrent.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent e)
            {
                Double amtDbl;
                name = cboName.getEditor().getText().toUpperCase();
                if (!"".equals(cboOffType1.getEditor().getText()))
                {
                    offType = cboOffType1.getEditor().getText().toUpperCase();
                    amtStr = txtAmt1.getText();
                    amtStr = amtStr.substring(1);
                    amtDbl = parseDouble(amtStr);
                    chkNum = txtCheckNum1.getText();
                    Donation temp = new Donation(name, offType, amtDbl, chkNum);
                    wkDon.add(temp);
                }
                if (!"".equals(cboOffType2.getEditor().getText()))
                {
                    offType = cboOffType2.getEditor().getText().toUpperCase();
                    amtStr = txtAmt2.getText();
                    amtStr = amtStr.substring(1);
                    amtDbl = parseDouble(amtStr);
                    chkNum = txtCheckNum2.getText();
                    Donation temp = new Donation(name, offType, amtDbl, chkNum);
                    wkDon.add(temp);
                }
                if (!"".equals(cboOffType3.getEditor().getText()))
                {
                    offType = cboOffType3.getEditor().getText().toUpperCase();
                    amtStr = txtAmt3.getText();
                    amtStr = amtStr.substring(1);
                    amtDbl = parseDouble(amtStr);
                    chkNum = txtCheckNum3.getText();
                    Donation temp = new Donation(name, offType, amtDbl, chkNum);
                    wkDon.add(temp);
                }
                if (!"".equals(cboOffType4.getEditor().getText()))
                {
                    offType = cboOffType4.getEditor().getText().toUpperCase();
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
            }
        });

        
        // Focus Change Registration - Used for $ and CASH
        txtAmt1.focusedProperty().addListener((obs, oldVal, newVal) ->
        {
            if (oldVal && !newVal)
            {
                Double amtDbl = parseDouble(txtAmt1.getText());
                txtAmt1.setText(String.format("$%.2f", amtDbl));
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
                Double amtDbl = parseDouble(txtAmt2.getText());
                txtAmt2.setText(String.format("$%.2f", amtDbl));
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
                Double amtDbl = parseDouble(txtAmt3.getText());
                txtAmt3.setText(String.format("$%.2f", amtDbl));
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
                Double amtDbl = parseDouble(txtAmt4.getText());
                txtAmt4.setText(String.format("$%.2f", amtDbl));
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
    
    private void addOffType() throws IOException
    {
        ChoiceDialog check = new ChoiceDialog("No", "Yes");
        check.setTitle("Already There?");
        check.setHeaderText("");        
        check.setContentText("Did you verify the Offering Type you are about " +
                             "to enter is not already on the list?");
        Optional<ButtonType> btnPress = check.showAndWait();

        if ((btnPress.isPresent()) && (btnPress.get() != ButtonType.CANCEL))
        {
            if (check.getSelectedItem() == "Yes")
            {
                String tempOffType;
                TextInputDialog addType = new TextInputDialog();
                addType.setTitle("New Offering Type");
                addType.setHeaderText("");
                addType.setContentText("Please Enter the name of the new " +
                                       "Offering Type:");
                addType.showAndWait();
                if (addType.getResult() != null)
                {
                    tempOffType = addType.getResult().toUpperCase();                
                    offTypeList.add(tempOffType);
                    offTypeList.sort(null);
                    offTypeWrite = new FileWriter(offTypeFileName);
                    int size = offTypeList.size();
                    for (int i = 0; i < size; i++)
                    {
                        String str = offTypeList.get(i);
                        offTypeWrite.write(str);
                        offTypeWrite.write('\n');
                    }
                    offTypeWrite.close();
                    offTypeList.clear();
                    offTypeRead =
                            Files.newBufferedReader(Paths.get(offTypeFileName));
                    String line;
                    while ((line = offTypeRead.readLine()) != null)
                    {
                        offTypeList.add(line);
                    }
                    offTypeRead.close();
                    cboOffType1.setItems(offTypes);
                    cboOffType2.setItems(offTypes);
                    cboOffType3.setItems(offTypes);
                    cboOffType4.setItems(offTypes);
                    TextFields.bindAutoCompletion(cboOffType1.getEditor(),
                                                  cboOffType1.getItems());
                    TextFields.bindAutoCompletion(cboOffType2.getEditor(),
                                                  cboOffType2.getItems());
                    TextFields.bindAutoCompletion(cboOffType3.getEditor(),
                                                  cboOffType3.getItems());
                    TextFields.bindAutoCompletion(cboOffType4.getEditor(),
                                                  cboOffType4.getItems());
                }                
            }
            else
            {
                Alert doCheck = new Alert(AlertType.WARNING, "Please check the" +
                                          " list of available Offering Types.");
                doCheck.setTitle("Check the list!!");
                doCheck.setHeaderText("");
                doCheck.showAndWait();
            }
        }
    }
    
    private void addNewDon(ArrayList<Donor> newDon) throws IOException
    {
        newDonor.addNewDonor(newDon);
        names.clear();
        namesRead = Files.newBufferedReader(Paths.get(namesFileName));
        String line;
        while ((line = namesRead.readLine()) != null)
        {
            namesList.add(line);
        }
        namesRead.close();
        cboName.setItems(names);
        TextFields.bindAutoCompletion(cboName.getEditor(), cboName.getItems());
    }
}
