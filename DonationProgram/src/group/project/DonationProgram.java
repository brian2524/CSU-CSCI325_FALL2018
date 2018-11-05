/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.project;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Jedidiah Bird
 */
public class DonationProgram extends Application
{
    private DonationScreen loadDonationScreen = new DonationScreen();
//    private final Stage newTypeStage = new Stage();
//    private final Stage miscStage = new Stage();
//    private final Stage reportStage = new Stage();
    
    @Override
    public void start(Stage primaryStage) throws IOException
    {
        
        
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
        public void handle(ActionEvent event)
        {
            
            loadDonationScreen.addDonationScreen();

        }
    }
    class MiscButton implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            System.out.println("Misc Button");
        }
    }
    class CheckButton implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            System.out.println("Check Button");
        }
    }
    class ReportButton implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            System.out.println("Report Button");
        }
    }

    class TypeButton implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            System.out.println("NewType Button");
        }
    }
    class SaveDonationButton implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            System.out.println("Save Donation Button");
        }
    }

    class SaveMiscButton implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            System.out.println("Save Misc Button");
//            donationStage.close();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
