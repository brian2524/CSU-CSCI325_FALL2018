/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;
//add imports

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.ArrayList;



/**
 * PROGRAM: NewDonorReport.java
 * PURPOSE: This class will print a report of all new donors entered
 * @author Dondra Crocker Richards
 */
public class NewDonorReport  extends AddNewDonor{
    private final TableView<Donor>  newDonorTable = new TableView<>();    
  
    Stage newDonorRptStage = new Stage();
    Scene donRptScene = new Scene(new Group());    
    
    public NewDonorReport(ArrayList<Donor>newDon)
    {
        newDonorRptStage.setTitle("New Donors");
        newDonorRptStage.setWidth(300);
        newDonorRptStage.setHeight(500);
        final Label nDnrRptLabel = new Label("New Donor Report");
        nDnrRptLabel.setFont(new Font("Arial", 20));       
        
       
        
        TableColumn lstName = new TableColumn("Last(Family) Name");
        lstName.setMinWidth(100);
        lstName.setCellValueFactory(new PropertyValueFactory<>(super.getLastName()));
        TableColumn frstName1 = new TableColumn("First Name1");
        frstName1.setMinWidth(100);
         frstName1.setCellValueFactory(new PropertyValueFactory<>(super.getFirstName1()));
        TableColumn frstName2 = new TableColumn("First Name2");
         frstName2.setCellValueFactory(new PropertyValueFactory<>(super.getFirstName2()));
        TableColumn nDnrNote = new TableColumn("Notes: ");
         nDnrNote.setCellValueFactory(new PropertyValueFactory<>(super.getNotes()));
        newDonorTable.getColumns().addAll(lstName, frstName1, frstName2, nDnrNote);
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10,0,0,10));
        vbox.getChildren().addAll(nDnrRptLabel, newDonorTable);
        ((Group) donRptScene.getRoot()).getChildren().addAll(vbox);
        newDonorRptStage.setScene(donRptScene);
        newDonorRptStage.show();        
    }  
    
    
}
