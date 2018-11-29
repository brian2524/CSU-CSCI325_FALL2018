package group.project;

import java.util.ArrayList;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Timia Davis
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
        Button btnExit = new Button("Exit Report View");
            btnExit.setFont(Font.font("Times New Roman", 15.75));
            btnExit.setAlignment(Pos.CENTER);
            btnExit.setMinHeight(30);
            btnExit.setMaxHeight(30);
            btnExit.setMinWidth(300);
            btnExit.setMaxWidth(300);
        gridPane.addColumn(0, name);
        gridPane.addColumn(1, offType);
        gridPane.addColumn(2, amount);
        gridPane.addColumn(3, paymentType);
        gridPane.setHgap(20);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);
        //gridPane.setGridLinesVisible(true);
        ColumnConstraints rightAlign = new ColumnConstraints();
            rightAlign.setHalignment(HPos.RIGHT);
        ColumnConstraints leftAlign = new ColumnConstraints();
            leftAlign.setHalignment(HPos.LEFT);
        gridPane.getColumnConstraints().add(0, leftAlign);
        gridPane.getColumnConstraints().add(1, leftAlign);
        gridPane.getColumnConstraints().add(2, rightAlign);
        gridPane.getColumnConstraints().add(3, leftAlign);
        
        VBox vBoxAll = new VBox(gridPane, btnExit);
        vBoxAll.setSpacing(50);
        vBoxAll.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(vBoxAll);
    
        
        
        for (int i =0; i < wkDon.size(); i++)
        {
            Double temp = wkDon.get(i).getDonationAmt();
            String tStr = (String.format("$%.2f", temp));
            Label nam = new Label(wkDon.get(i).getDonorName());
            Label off = new Label(wkDon.get(i).getDonationType());
            Label amoun = new Label(tStr);
            Label pay = new Label(wkDon.get(i).getCheckCash());
            

            
            gridPane.addRow(i + 1, nam, off, amoun, pay);
        }
        btnExit.setOnAction(e -> {primaryStage.close();});       
        primaryStage.setScene(scene);
        primaryStage.setTitle("Weekly Donation Report");
        primaryStage.setMaximized(true);
        primaryStage.showAndWait();
        

    }
        

    }
    
    

    
    


           


       
       


