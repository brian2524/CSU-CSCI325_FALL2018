/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author timiadavis
 */
public class DonationReport {
    
    
    private TableView<Donation> table;
    StackPane root = new StackPane();
    Stage primaryStage = new Stage();
    Scene scene = new Scene(new Group());
    
    public DonationReport() {
        
        
        
    }
 
    
    public void setDonation(ArrayList<Donation> arrayLis) {
        
        table = new TableView<Donation>((ObservableList<Donation>) arrayLis);
        
        TableColumn<Donation, String> contributorName = new TableColumn("Name Of Contributor");
        contributorName.setMinWidth(190);
       contributorName.setCellValueFactory(
                new PropertyValueFactory<>(("name of contributor")));
                      
       TableColumn<Donation, String> offeringType = new TableColumn("Offering Type");
       offeringType.setMinWidth(190);
       offeringType.setCellValueFactory(
                new PropertyValueFactory<>(("offering type")));
       
       TableColumn<Donation, Double> contribamount = new TableColumn("Amount");
       contribamount.setMinWidth(190);
       contribamount.setCellValueFactory(
                new PropertyValueFactory<>(("amount")));
       
       TableColumn<Donation, String> totalDeposit = new TableColumn("CASH OR CHECK #");
       totalDeposit.setMinWidth(190);
       totalDeposit.setCellValueFactory(
                new PropertyValueFactory<>(("cash or check")));
       
       
       
        String nam, typ;
        double amount;
        String paymentmethod;
              
       
        Scene scene = new Scene(new Group());
        table.getColumns().setAll(contributorName, offeringType,
                contribamount, totalDeposit);

        
         VBox vb = new VBox();
        vb.setPadding(new Insets (100, 100, 100, 100));
        vb.setSpacing(5);
        vb.getChildren().addAll(table);  
       
    }
        

    }
    
    

    
    


           


       
       


