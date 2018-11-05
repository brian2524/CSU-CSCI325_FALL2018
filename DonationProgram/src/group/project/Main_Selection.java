/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Kevin G. Lancaster
 */
public class Main_Selection extends Application
{
    private ArrayList<Donor> weekDonors;
    Font defFont = new Font("Times New Roman", 15.75);    
    
    @Override
    public void start(Stage primaryStage)
    {
        // Button and Informational Label Declarations and Initialization
        // (Text, Font, Size, Alignment)
        Button btnEntCont = new Button("Enter Contribution(s)");
        Button btnEntMisc = new Button("Enter Miscellaneous Information");
        Button btnCrossCheck = new Button("Perform Cross-Checks");
        Button btnRptVP = new Button("View & Print Reports");
        Button btnQuit = new Button("Quit");
        Label lblEntCont = new Label("This will allow entry of all " +
                                     "contributions.\nIt will also allow " +
                                     "adding new giving units\nor Offering " +
                                     "Types.");
        Label lblEntMisc = new Label("This will allow entering of various " +
                                     "information,\nsuch as Deposit Bag " +
                                     "Number, the Names\nof the Counters, " +
                                     "and the cash denomination\nbreakdown.");
        Label lblCrossCheck = new Label("This will cross-check the cash " +
                                        "denomination\nentries and the total " +
                                        "given vs. total given for\neach " +
                                        "Offering Type. It will also allow " +
                                        "editing of entries if the cross-" +
                                        "check fails.");
        Label lblRptVP = new Label("This will allow previewing, editing if " +
                                   "required, and printing of\nthe various " +
                                   "reports, including a report of\nany new " +
                                   "giving units entered this week.");
        btnEntCont.setFont(defFont);
        btnEntCont.setMaxSize(300, 40);
        btnEntCont.setMinSize(300, 40);
        btnEntCont.setAlignment(Pos.CENTER);
        btnEntMisc.setFont(defFont);
        btnEntMisc.setMaxSize(300, 40);
        btnEntMisc.setMinSize(300, 40);
        btnEntMisc.setAlignment(Pos.CENTER);
        btnCrossCheck.setFont(defFont);
        btnCrossCheck.setMaxSize(300, 40);
        btnCrossCheck.setMinSize(300, 40);
        btnCrossCheck.setAlignment(Pos.CENTER);
        btnRptVP.setFont(defFont);
        btnRptVP.setMaxSize(300, 40);
        btnRptVP.setMinSize(300, 40);
        btnRptVP.setAlignment(Pos.CENTER);
        btnQuit.setFont(defFont);
        btnQuit.setMaxSize(140, 60);
        btnQuit.setMinSize(140, 60);
        btnQuit.setAlignment(Pos.CENTER);
        lblEntCont.setFont(defFont);
        lblEntCont.setAlignment(Pos.CENTER_LEFT);
        lblEntMisc.setFont(defFont);
        lblEntMisc.setAlignment(Pos.CENTER_LEFT);
        lblCrossCheck.setFont(defFont);
        lblCrossCheck.setAlignment(Pos.CENTER_LEFT);
        lblRptVP.setFont(defFont);
        lblRptVP.setAlignment(Pos.CENTER_LEFT);
        
        // Place the buttons and information labels into a Grid Pane
        GridPane mainSelection = new GridPane();
        
        mainSelection.addColumn(0, btnEntCont, btnEntMisc, btnCrossCheck,
                                btnRptVP, btnQuit);
        mainSelection.addColumn(2, lblEntCont, lblEntMisc, lblCrossCheck,
                                lblRptVP);
        mainSelection.setVgap(50);
        mainSelection.setHgap(50);
        mainSelection.setAlignment(Pos.CENTER);
        mainSelection.setPadding(new Insets(50));
        
        // Register Button Handlers and create them as Lambdas
        btnQuit.setOnAction(e -> {primaryStage.close();});
        btnEntCont.setOnAction(e -> new EntCont());
        btnEntMisc.setOnAction(e -> new EntMisc());
        btnCrossCheck.setOnAction(e -> new CrossCheck());
        btnRptVP.setOnAction(e -> new Reports());
        
        
        Scene scene = new Scene(mainSelection, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
