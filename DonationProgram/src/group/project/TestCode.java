/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author Godmode
 */
public class TestCode extends Application {
    private final Stage donationStage = new Stage();
    private final Stage donorStage = new Stage();
    private final Stage newTypeStage = new Stage();
    private final Stage miscStage = new Stage();
    private final Stage reportStage = new Stage();
    
    @Override
    public void start(Stage primaryStage) {
        
        Button dBtn = new Button("Enter Contributions");
        dBtn.setOnAction(new DonationButton());
        dBtn.setMinWidth(400);
        Button mBtn = new Button("Enter Miscellaneous Data");
        mBtn.setOnAction(new MiscButton());
        mBtn.setMinWidth(400);
        Button cBtn = new Button("Cross-Check Data");
        cBtn.setOnAction(new CheckButton());
        cBtn.setMinWidth(400);
        Button rBtn = new Button("View and Print Report");
        rBtn.setOnAction(new ReportButton());
        rBtn.setMinWidth(400);
        Button qBtn = new Button("Quit");
        qBtn.setMinWidth(400);
        qBtn.setOnAction(e ->
        {
            primaryStage.close();
        });
        
        HBox quitBox = new HBox(qBtn);
        quitBox.setAlignment(Pos.CENTER);
        
        VBox navBox = new VBox(20, dBtn, mBtn, cBtn, rBtn);
        navBox.setAlignment(Pos.CENTER);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(navBox);
        borderPane.setBottom(quitBox);
        borderPane.setPadding(new Insets(20));
        
        Scene scene = new Scene(borderPane, 800, 400);

        
        primaryStage.setTitle("Church Donations");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    class DonationButton implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            
            System.out.println("Donation Button");
            
            Label nameLbl = new Label("Name");
            TextField nameField = new TextField();
            nameField.setMinWidth(500);
            Button donorBtn = new Button("New Donor");
            donorBtn.setOnAction(new DonorButton());
            HBox nameHBox = new HBox(20, nameLbl, nameField, donorBtn);
            nameHBox.setAlignment(Pos.CENTER);
            
            Label typeLbl = new Label("Offering Type: ");
            TextField typeField1 = new TextField();
            TextField typeField2 = new TextField();
            TextField typeField3 = new TextField();
            TextField typeField4 = new TextField();
            VBox typeVBox = new VBox(20, typeLbl, typeField1, typeField2, typeField3,
                    typeField4);
            typeVBox.setMinWidth(300);
            
            Label amtLbl = new Label("Amount: ");
            TextField amtField1 = new TextField();
            TextField amtField2 = new TextField();
            TextField amtField3 = new TextField();
            TextField amtField4 = new TextField();
            VBox amtVBox = new VBox(20, amtLbl, amtField1, amtField2, amtField3,
                    amtField4);
            amtVBox.setMinWidth(150);
            
            Label checkLbl = new Label("Check # or 'Cash': ");
            TextField checkField1 = new TextField();
            TextField checkField2 = new TextField();
            TextField checkField3 = new TextField();
            TextField checkField4 = new TextField();
            VBox checkVBox = new VBox(20, checkLbl, checkField1, checkField2, checkField3,
                    checkField4);
            checkVBox.setMinWidth(150);
            
            Button typeBtn = new Button("Add new Offering Type");
            typeBtn.setTextAlignment(TextAlignment.CENTER);
            typeBtn.setMinWidth(70);
            typeBtn.setMaxSize(70, 70);
            typeBtn.setWrapText(true);
            
            HBox dHBox = new HBox(20, typeVBox, amtVBox, checkVBox, typeBtn);
            dHBox.setAlignment(Pos.CENTER);
            
            Button sBtn = new Button("Save Current Contributor Information");
            sBtn.setMinWidth(400);
            
            Button qBtn = new Button("Finished Entering Contributions");
            qBtn.setMinWidth(400);
            qBtn.setOnAction(e ->
            {
                donationStage.close();
            });
            
            VBox btnVBox = new VBox(20, sBtn, qBtn);
            btnVBox.setAlignment(Pos.CENTER);
            
            VBox mainVBox = new VBox(20, nameHBox, dHBox, btnVBox);  
            mainVBox.setAlignment(Pos.CENTER);

            Scene donationScene = new Scene(mainVBox);
            
            donationStage.setScene(donationScene);
            donationStage.setTitle("Contribution Entry");
            donationStage.setWidth(800);
            donationStage.setHeight(400);
            donationStage.show();

        }
    }
    class MiscButton implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            System.out.println("Misc Button");
        }
    }
    class CheckButton implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            System.out.println("Check Button");
        }
    }
    class ReportButton implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            System.out.println("Report Button");
        }
    }
    class DonorButton implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            System.out.println("New Donor Button");
            
            Label lastNameLbl = new Label("Last (Family) Name:");
            lastNameLbl.setMinWidth(350);
            TextField lastNameField = new TextField(); 
            lastNameField.setMinWidth(350);
            HBox lastHBox = new HBox(20, lastNameLbl, lastNameField);
            lastHBox.setAlignment(Pos.CENTER);
            
            Label firstNameLbl = new Label("First Name and Initial:");
            firstNameLbl.setMinWidth(350);
            TextField firstNameField = new TextField();
            firstNameField.setMinWidth(350);
            HBox firstHBox = new HBox(20, firstNameLbl, firstNameField);
            firstHBox.setAlignment(Pos.CENTER);
            
            Label spouseNameLbl = new Label("Spouse Name and Initial (Optional):");
            spouseNameLbl.setMinWidth(350);
            TextField spouseNameField = new TextField();
            spouseNameField.setMinWidth(350);
            HBox spouseHBox = new HBox(20, spouseNameLbl, spouseNameField);
            spouseHBox.setAlignment(Pos.CENTER);
            
            Label donorNotesLbl = new Label("Additional Notes for Treasurer:");
            HBox labelHBox = new HBox(donorNotesLbl);
            TextField donorNotesField = new TextField();
            donorNotesField.setMinSize(720, 100);
            HBox fieldHBox = new HBox(donorNotesField);
            VBox notesVBox = new VBox(10, labelHBox, fieldHBox);
            HBox notesHBox = new HBox(10, notesVBox);
            notesHBox.setAlignment(Pos.CENTER);
            
            
            Button saveDonorBtn = new Button("Add Name and Return to "
                + "Contribution Entry");
            saveDonorBtn.setOnAction(e ->
            {
                firstNameField.setText(firstNameField.getText().toUpperCase());
                lastNameField.setText(lastNameField.getText().toUpperCase());
                spouseNameField.setText(spouseNameField.getText().toUpperCase());
                System.out.println(lastNameField.getText() + ", "
                    + firstNameField.getText() + " & "
                    + spouseNameField.getText());
                donorStage.close();
            });
            HBox btnHBox = new HBox(saveDonorBtn);
            btnHBox.setAlignment(Pos.CENTER);
            btnHBox.setMinWidth(400);
            
            VBox donorVBox = new VBox(20, lastHBox, firstHBox, spouseHBox,
                notesHBox, btnHBox);
            
            Scene donorScene = new Scene(donorVBox);
            
            donorStage.setScene(donorScene);
            donorStage.setTitle("Add New Donor");
            donorStage.setWidth(800);
            donorStage.setHeight(400);
            donorStage.show();
              
        }
    }
    class TypeButton implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            System.out.println("NewType Button");
        }
    }
    class SaveDonationButton implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            System.out.println("Save Donation Button");
        }
    }
    class SaveDonorButton implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            System.out.println("Save Donor Button");
            donorStage.close();
        }
    }
    class SaveMiscButton implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            System.out.println("Save Misc Button");
            donationStage.close();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
