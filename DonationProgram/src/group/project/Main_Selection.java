/*
 * Student Name: Brian Hinkle
 * Program Name: Donation Program
 * Creation Date: 11/26/2018
 * Last Modified Date: 11/2/2020
 * CSCI Course: CSCI 325
 * Grade Received: A
 * Design Comments:
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 * @author Kevin G. Lancaster
 */
package group.project;

import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Kevin G. Lancaster
 */
public class Main_Selection extends Application
{
    private ArrayList<Donation> weekDonors;
    private ArrayList<Donor> newDonors;
    private EntCont enterContributions;
    private EntMisc enterMiscellaneous;
    private CrossCheck crossCheck;
    private Reports rptVP;
    
    Font defFont = new Font("Times New Roman", 15.75);
    Font smlFont = new Font("Times New Roman", 12);

    public Main_Selection() throws IOException
    {
        this.enterContributions = new EntCont();
        this.enterMiscellaneous = new EntMisc();
        this.weekDonors = new ArrayList<>();
        this.newDonors = new ArrayList<>();
        this.rptVP = new Reports();
    }

    @Override
    public void start(Stage stgMainSelect)
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
                                        "editing\nof entries if the cross-" +
                                        "check fails.");
        Label lblRptVP = new Label("This will allow previewing, editing if " +
                                   "required,\nand printing of the various " +
                                   "reports, including a\nreport of any new " +
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
        btnQuit.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15.75));
        btnQuit.setMaxSize(140, 60);
        btnQuit.setMinSize(140, 60);
        btnQuit.setAlignment(Pos.CENTER);
        lblEntCont.setFont(defFont);
        lblEntMisc.setFont(defFont);
        lblCrossCheck.setFont(defFont);
        lblRptVP.setFont(defFont);
        
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
        
        
        
        // Create and Output Scene onto stage
        Scene scnMainSelect = new Scene(mainSelection);        
        stgMainSelect.setTitle("Weekly Counter Program");
        stgMainSelect.setScene(scnMainSelect);
        stgMainSelect.setMaximized(true);
        stgMainSelect.show();

        // Register Button Handlers and create them as Lambdas
        btnQuit.setOnAction(e -> {stgMainSelect.close();});
        btnEntCont.setOnAction(e -> {enterContributions.entCont(weekDonors,
                                                                newDonors);});            
        btnEntMisc.setOnAction(e -> {enterMiscellaneous.entMisc();});
        btnCrossCheck.setOnAction(e -> 
        {
            crossCheck = new CrossCheck(weekDonors, enterMiscellaneous);
            if (!crossCheck.RunCheck())
            {
                Alert badCrossCheck = new Alert(Alert.AlertType.ERROR,
                                                "Your data entry has errors," +
                                                " please fix them before\n" +
                                                "attempting to print " +
                                                "the reports.\n\tThank you!!");
                badCrossCheck.showAndWait();
            }
            Alert crossCheckDone = new Alert(AlertType.INFORMATION, "Cross Check Done!!");
            crossCheckDone.showAndWait();
        });
        btnRptVP.setOnAction(e ->
        {
            rptVP.selectReport(weekDonors, newDonors,
                               enterMiscellaneous, crossCheck);
        });
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
