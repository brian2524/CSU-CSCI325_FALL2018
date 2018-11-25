/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contribute;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author timiadavis
 */
public class Contribute extends Application {

    public Contribute(String name, String offeringType, String amount, String deposit,
   String time, String date) {
        
    }
    
    private TableView<Contribute> tabl = new TableView<>();
    private ObservableList<Contribute> results = FXCollections.observableArrayList(
     new Contribute("John II Allen", "Benevolence(Local)", "$250.00", "$300.00", 
     "AM", "November 25, 2018"),
    new Contribute("Jefferey Alewine", "Building Fund 2016", "$20.00", "$50.00", 
     "PM", "November 16, 2018"),
    new Contribute("Kristen Cooper", "Faith Promise 10%", "$100.00", "$100.00", 
     "AM", "November 20, 2018"),
    new Contribute("Beverly Eisenhut", "Men's ministry", "$10.00", "$10.00", 
     "AM", "November 6, 2018")
    );
    
    
    
     HBox hb = new HBox();
     
    public static void main(String[] args) {
        launch(args);
    }
    
    private TableView table = new TableView();
    
    @Override
    public void start(Stage primaryStage) {
       // Button btn = new Button();
       // btn.setText("Say 'Hello World'");
       // btn.setOnAction(new EventHandler<ActionEvent>() {
            
          //  @Override
          //  public void handle(ActionEvent event) {
             //   System.out.println("Hello World!");
          //  }
       // });
        
        StackPane root = new StackPane();
       // root.getChildren().add(btn);
       
       TableColumn contributorName = new TableColumn("Name");
       // TableColumn counterName = new TableColumn("Counter Name");
      // TableColumn contributorType = new TableColumn("Contributor Type");
       TableColumn offeringType = new TableColumn("Offering");
       TableColumn contribamount = new TableColumn("Amount");
       
      // TableColumn subTotal = new TableColumn("Subtotal");
       // TableColumn looseOffering = new TableColumn("Loose Offering");
       // TableColumn calculateTotal = new TableColumn("Total Amount");
       TableColumn totalDeposit = new TableColumn("Deposit");
       TableColumn time = new TableColumn("Time");
       TableColumn date = new TableColumn("Date");
       
       
        
      //  Scene scene = new Scene(root, 300, 250);
           Scene scene = new Scene(new Group());
        table.getColumns().addAll(contributorName, offeringType,
                contribamount, totalDeposit,
                time, date);
        
         VBox vb = new VBox();
        vb.setPadding(new Insets (100, 100, 100, 100));
        vb.setSpacing(5);
        vb.getChildren().addAll(table, hb);  
        
        table.setEditable(true);
        
        primaryStage.setTitle("Donation Program");
        ((Group) scene.getRoot()).getChildren().addAll(vb);
        primaryStage.setWidth(2000);
        primaryStage.setHeight(2000);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        TextField entercontrolName = new TextField();
        entercontrolName.setPromptText("Name");
        entercontrolName.setMaxWidth(entercontrolName.getPrefWidth());
        
       // TextField contribType = new TextField();
       // contribType.setPromptText("Contributor Type");
       // contribType.setMaxWidth(entercontrolName.getPrefWidth());
        
        TextField offType = new TextField();
        offType.setPromptText("Offering");
        offType.setMaxWidth(entercontrolName.getPrefWidth());
        
        TextField getAmoun = new TextField();
        getAmoun.setPromptText("Amount");
        getAmoun.setMaxWidth(entercontrolName.getPrefWidth());
        
       // TextField subTot = new TextField();
        //subTot.setPromptText("Subtotal");
        //subTot.setMaxWidth(entercontrolName.getPrefWidth());
        
        //TextField caltot = new TextField();
        //caltot.setPromptText("Calculate Total");
        //caltot.setMaxWidth(entercontrolName.getPrefWidth());
        
        TextField depo = new TextField();
        depo.setPromptText("Deposit");
        depo.setMaxWidth(entercontrolName.getPrefWidth());
        
        TextField items = new TextField();
        items.setPromptText("Items");
        items.setMaxWidth(entercontrolName.getPrefWidth());
        
        TextField tim = new TextField();
        tim.setPromptText("Time");
        tim.setMaxWidth(entercontrolName.getPrefWidth());
        
        TextField dat = new TextField();
        dat.setPromptText("Date");
        dat.setMaxWidth(entercontrolName.getPrefWidth());
        
        Button add = new Button("Add");
        add.setOnAction((ActionEvent e) -> {
        results.add(new Contribute(
                entercontrolName.getText(),offType.getText(),
                getAmoun.getText(), depo.getText(),
                tim.getText(), dat.getText()));
               entercontrolName.clear();
               offType.clear();
               getAmoun.clear();
               depo.clear();
               tim.clear();
               dat.clear();
               
        
    });
        
        
        hb.getChildren().addAll(entercontrolName, offType,getAmoun, 
                depo, items, tim, dat, add);
        hb.setSpacing(6);
        //hb.getChildren().addAll(caltot, depo, items, tim, dat, add);
        
 
        
        
        
   // class addButtonHandler implements EventHandler<ActionEvent> {
     //   @Override
         //   public void handle(ActionEvent event){
            //    root.getChildren().add(add);
     //   }
            
      //  }
    }

    /**
     * @param args the command line arguments
     */

    
    public static class Contributor {
        private double amount, subtotal, total, deposit;
        private String offering;
        private String name;
        private String contribT;
        private String time, payment;
        private int items;
    
    public Contributor(){
        
    }
    
    public String getControlName() {
        return name;
    }
    
    public String getTypeFromContributor() {
        return contribT;
    }
    
    public void printResults() {
        
    }
    
    public String offeringType() {
        return offering;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public double getsubTotal() {
        return subtotal;
    }
    
    public double calculateTotal() {
        return total;
    }
    
    public double deposit() {
        return deposit;
    }
    
    public void disDeposit() {
        
    }
    
    public int numbOfItems() {
     return items;   
    }
    
    
    public String getTime () {
       return time;
    }
    
    public void date() {
        
    }
}

    }
    
