package group.project;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author timiadavis
 */
public class DonationReport {
    
    
    StackPane root = new StackPane();
    Stage primaryStage = new Stage();
    
    public DonationReport()
    {
        
    }
 
    
    public void setDonation(ArrayList<Donation> wkDon)
    {
        
        
        Label name = new Label("Name Of Contributor");
        Label offType = new Label ("Offering Type");
        Label amount = new Label("Amount");
        Label paymentType = new Label("Cash Or Check Num");
        
        GridPane gridPane = new GridPane();
        
        gridPane.addColumn(0, name);
        gridPane.addColumn(1, offType);
        gridPane.addColumn(2, amount);
        gridPane.addColumn(3, paymentType);
        gridPane.setHgap(20);
        gridPane.setAlignment(Pos.CENTER);
        
        
        Scene scene = new Scene(gridPane);
    
        
        
        for (int i =0; i < wkDon.size(); i++)
        {
            Double temp = wkDon.get(i).getDonationAmt();
            Label nam = new Label(wkDon.get(i).getDonorName());
            Label off = new Label(wkDon.get(i).getDonationType());
            Label amoun = new Label(temp.toString());
            Label pay = new Label(wkDon.get(i).getCheckCash());
            
            name.setText(wkDon.get(i).getDonorName());

            
            offType.setText(wkDon.get(i).getDonationType());
            amount.setText(temp.toString());
            paymentType.setText(wkDon.get(i).getCheckCash());
            
            gridPane.addRow(i + 1, nam, off, amoun, pay);
        }
       
    }
        

    }
    
    

    
    


           


       
       


