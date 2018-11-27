/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;
//add imports

import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import javafx.stage.Stage;

import java.util.ArrayList;
import javafx.scene.layout.GridPane;

/**
 * PROGRAM: NewDonorReport.java
 * PURPOSE: This class will print a report of all new donors entered
 * @author Dondra Crocker Richards
 */
public class NewDonorReport
{
    private Stage newDonRptStage = new Stage();
    //constructor
    public NewDonorReport(){     
            
            }
    public void displayNewDonRpt (ArrayList<Donor>newDon){
        //iterate the new donor to display the names, and notes of the new donor
        //per Kevin's test code in Reports
        
        //create a grid pane
        GridPane newDonGrid = new GridPane();
        //create an hbox node
        HBox newDonHbox = new HBox(400);        
        newDonHbox.setPadding(new Insets(15,15,15,15));
        newDonHbox.getChildren().add(new Label("Last Name: "));
        newDonHbox.getChildren().add(new Label("First Name1: "));
        newDonHbox.getChildren().add(new Label("First Name2: "));  
        newDonHbox.getChildren().add(new Label("Notes: "));
        
        
        for (int index = 0; index < newDon.size(); index++){
            HBox.setMargin(newDonHbox, new Insets(0,0,0,15));
            newDon.get(index).getName();
            newDon.get(index).getNotes();
            
        }
    Scene newDonRpt = new Scene(newDonGrid);

        newDonRptStage.setScene(newDonRpt);
        newDonRptStage.setTitle("New Donors Report");
        newDonRptStage.setWidth(800);
        newDonRptStage.setHeight(400);
        newDonRptStage.show();
}
            
  
   
    
}
