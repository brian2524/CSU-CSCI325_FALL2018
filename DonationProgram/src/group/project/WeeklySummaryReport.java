/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;
//imports
import java.time.Instant;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Date;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
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
    public void weeklySumRpt(ArrayList<Donation>weeklyDon, EntMisc miscData, 
            CrossCheck crossCheckData){
        
        //create grid
        GridPane wkSumPane = new GridPane();
        
        //create exit button & set properties
        Button btnExit = new Button("Exit Report View");
            btnExit.setFont(Font.font("Times New Roman", 15.75));
            btnExit.setAlignment(Pos.CENTER);
            btnExit.setMinHeight(30);
            btnExit.setMaxHeight(30);
            btnExit.setMinWidth(300);
            btnExit.setMaxWidth(300);
            
        //set grid properties
        String dateLabel = ("Date: " + Date.from(Instant.now()));
        wkSumPane.setAlignment(Pos.CENTER);
        wkSumPane.setPadding(new Insets(15,15,15,15));
        wkSumPane.setHgap(20);
        wkSumPane.setVgap(5);
        wkSumPane.addRow(0, new Label("Breakdown of Contributions"),
                new Label(dateLabel));
     //Text dateText = new Text(java.time.LocalDate.now());--need to make a string
       // wkSumPane.add(dateText, 0, 2);
//       wkSumPane.add(new Label("Donor Name:"), 0,2);
//       wkSumPane.add(new Label("Donation Type: "),0, 3);
//       wkSumPane.add(new Label("Donation Amount:"),0, 4);
//       wkSumPane.add(new Label("Check Num/CASH"), 0, 5);
//       wkSumPane.add(new Label("Counter 1"), 0, 6);
//       wkSumPane.add(new Label("Counter 2"), 0, 7);
//       wkSumPane.add(new Label("Bag ID: "), 0, 8);
        for (int index = 0; index < crossCheckData.getSubtotals().size();
                index++)
        {
//            weeklyDon.get(index).getDonorName() ;
//             weeklyDon.get(index).getDonationType();
//              weeklyDon.get(index).getDonationAmt();
//              weeklyDon.get(index).getCheckCash();
//              miscData.getCtr1(); 
//                miscData.getCtr2() ;
//                miscData.getBagNum();
            Label area = new Label(crossCheckData.getSubtotals().get(index).getAreaName());
            Double amtDbl = crossCheckData.getSubtotals().get(index).getAmt();
            String amtStr = (String.format("$%.2f", amtDbl));
            Label amt = new Label(amtStr);
            wkSumPane.addRow(index + 1, area, amt);
        }
        ColumnConstraints rightAlign = new ColumnConstraints();
            rightAlign.setHalignment(HPos.RIGHT);
        ColumnConstraints leftAlign = new ColumnConstraints();
            leftAlign.setHalignment(HPos.LEFT);
        wkSumPane.getColumnConstraints().add(0, leftAlign);
        wkSumPane.getColumnConstraints().add(1, rightAlign);
        
        VBox vBoxAll = new VBox(wkSumPane, btnExit);
        vBoxAll.setAlignment(Pos.CENTER);
        
        Scene wkSumRpt = new Scene(vBoxAll);
        btnExit.setOnAction(e -> {weeklySumReportStage.close();});
        weeklySumReportStage.setScene(wkSumRpt);
        weeklySumReportStage.setTitle("Weekly Summary Report");
        weeklySumReportStage.setMaximized(true);
//        weeklySumReportStage.setWidth(800);
//        weeklySumReportStage.setHeight(400);
        weeklySumReportStage.showAndWait();
        
        
    }
    
}
