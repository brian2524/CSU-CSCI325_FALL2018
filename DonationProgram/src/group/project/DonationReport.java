/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

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
public class DonationReport extends Donation {
    
   String nam, typ;
   double amount;
   String paymentmethod;
    
    private TableView table = new TableView();
    StackPane root = new StackPane();
    Stage primaryStage = new Stage();
    Scene scene = new Scene(new Group());
    
    public DonationReport(String name, String type, double amt, String cc) {
        super(name, type, amt, cc);
        paymentmethod = cc;
        nam = name;
        typ = type;
        amount = amt;
 
            TableColumn contributorName = new TableColumn("Name Of Contributor");
        contributorName.setMinWidth(190);
       contributorName.setCellValueFactory(
                new PropertyValueFactory<>(super.getDonorName()));
    
    
              
       TableColumn offeringType = new TableColumn("Offering Type");
       offeringType.setMinWidth(190);
       offeringType.setCellValueFactory(
                new PropertyValueFactory<>(super.getDonationType()));
       
       TableColumn contribamount = new TableColumn("Amount");
       contribamount.setMinWidth(190);
       contribamount.setCellValueFactory(
                new PropertyValueFactory<>(Double.toString(amt)));
       
       TableColumn totalDeposit = new TableColumn("CASH OR CHECK #");
       totalDeposit.setMinWidth(190);
       totalDeposit.setCellValueFactory(
                new PropertyValueFactory<>(super.getCheckCash()));
       
       
              
       
        Scene scene = new Scene(new Group());
        table.getColumns().addAll(contributorName, offeringType,
                contribamount, totalDeposit);
        
         VBox vb = new VBox();
        vb.setPadding(new Insets (100, 100, 100, 100));
        vb.setSpacing(5);
        vb.getChildren().addAll(table);  
       
    }

           


       
       

}
