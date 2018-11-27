/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;
//imports
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import java.time.LocalDate;  
import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
/**
 *
 * @author Dondra Crocker Richards
 */

//to display the weekly totals of donations
public class WeeklySummaryReport {
    private final Stage weeklySumReportStage = new Stage();
    //constructor
    public WeeklySummaryReport(){
        
    }
       
    //method to display the summary totals for the week
    //per code written in test report from Kevin
    private void weeklySumRpt(ArrayList<Donation>weeklyDon,EntMisc miscData, 
            CrossCheck crossCheckData){
        
        //create grid
        GridPane wkSumPane = new GridPane();
        
        //set grid properties
        wkSumPane.setAlignment(Pos.CENTER);
        wkSumPane.setPadding(new Insets(15,15,15,15));
        wkSumPane.setHgap(5);
        wkSumPane.setVgap(5);
        
     wkSumPane.add(new Label ("Breakdown of Contributions"),0,0);
     wkSumPane.add(new Label("Date: "), 0, 1);
     //Text dateText = new Text(java.time.LocalDate.now());--need to make a string
       // wkSumPane.add(dateText, 0, 2);
       wkSumPane.add(new Label("Donor Name:"), 0,2);
       wkSumPane.add(new Label("Donation Type: "),0, 3);
       wkSumPane.add(new Label("Donation Amount:"),0, 4);
       wkSumPane.add(new Label("Check Num/CASH"), 0, 5);
       wkSumPane.add(new Label("Counter 1"), 0, 6);
       wkSumPane.add(new Label("Counter 2"), 0, 7);
       wkSumPane.add(new Label("Bag ID: "), 0, 8);
        for (int index = 0; index < weeklyDon.size(); index++){
            weeklyDon.get(index).getDonorName() ;
             weeklyDon.get(index).getDonationType();
              weeklyDon.get(index).getDonationAmt();
              weeklyDon.get(index).getCheckCash();
              miscData.getCtr1(); 
                miscData.getCtr2() ;
                miscData.getBagNum();            
        }
        Scene wkSumRpt = new Scene(wkSumPane);

        weeklySumReportStage.setScene(wkSumRpt);
        weeklySumReportStage.setTitle("New Donors Report");
        weeklySumReportStage.setWidth(800);
        weeklySumReportStage.setHeight(400);
        weeklySumReportStage.show();
        
        
    }
    
}
