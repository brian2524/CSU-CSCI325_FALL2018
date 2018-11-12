/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

import static java.lang.Integer.parseInt;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Kevin G. Lancaster
 */
public class EntMisc
{
    private final Stage stgEntMisc = new Stage();
    private final Font defFont = new Font("Times New Roman", 15.75);
    private final Font midFont = new Font("Times New Roman", 14.25);
    private final Font smlFont = new Font("Times New Roman", 12);
    private String ctr1, ctr2, bagNum;
    private int curr100, curr50, curr20, curr10, curr5, curr2, curr1;
    private int coin100, coin50, coin25, coin10, coin5, coin1;
    
    public void entMisc()
    {
        // Button Declaration
        String strBtnSaveExit = ("Save Information and Return to Main Menu");
        Button btnSaveExit = new Button(strBtnSaveExit);
        btnSaveExit.setFont(defFont);
        btnSaveExit.setAlignment(Pos.CENTER);

        // Special Text Declaration
        Label lblInfo = new Label();
        String strLblInfo = ("REMEMBER!!\n\nThe breakdown for cash is\n" +
                             "reported in how MANY of\neach Denomination, " +
                             "NOT\nhow MUCH those bills/coins\nare worth. " +
                             "That is, if you\nhave $100 in 20-dollar" +
                             "bills,\nenter 5 in the $20s box.");
        lblInfo.setText(strLblInfo);
        lblInfo.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

        // Label Declarations, etc.
        Label lblCtr1 = new Label("First Counter:");
        lblCtr1.setFont(defFont);
        Label lblCtr2 = new Label("Second Counter:");
        lblCtr2.setFont(defFont);
        Label lblBagNum = new Label("Deposit Bag Number:");
        lblBagNum.setFont(defFont);
        Label lblCash = new Label("Cash Breakdown");
        lblCash.setFont(defFont);
        Label lblCurr = new Label("Currency");
        lblCurr.setFont(midFont);
        Label lblCurr100 = new Label("$100s:");
        lblCurr100.setFont(smlFont);
        Label lblCurr50 = new Label("$50s:");
        lblCurr50.setFont(smlFont);
        Label lblCurr20 = new Label("$20s:");
        lblCurr20.setFont(smlFont);
        Label lblCurr10 = new Label("$10s:");
        lblCurr10.setFont(smlFont);
        Label lblCurr5 = new Label("$5s:");
        lblCurr5.setFont(smlFont);
        Label lblCurr2 = new Label("$2s:");
        lblCurr2.setFont(smlFont);
        Label lblCurr1 = new Label("$1s:");
        lblCurr1.setFont(smlFont);
        Label lblCoin = new Label("Coins");
        lblCoin.setFont(midFont);
        Label lblCoin100 = new Label("Dollars:");
        lblCoin100.setFont(smlFont);
        Label lblCoin50 = new Label("Half-Dollars:");
        lblCoin50.setFont(smlFont);
        Label lblCoin25 = new Label("Quarters:");
        lblCoin25.setFont(smlFont);
        Label lblCoin10 = new Label("Dimes:");
        lblCoin10.setFont(smlFont);
        Label lblCoin5 = new Label("Nickels:");
        lblCoin5.setFont(smlFont);
        Label lblCoin1 = new Label("Pennies:");
        lblCoin1.setFont(smlFont);
        
        // Text Box Declarations, etc.
        TextField txtCtr1 = new TextField();
        txtCtr1.setFont(defFont);
        txtCtr1.setMaxSize(273, 32);
        txtCtr1.setMinSize(273, 32);
        TextField txtCtr2 = new TextField();
        txtCtr2.setFont(defFont);
        txtCtr2.setMaxSize(273, 32);
        txtCtr2.setMinSize(273, 32);
        TextField txtBagNum = new TextField();
        txtBagNum.setFont(defFont);
        txtBagNum.setMaxSize(273, 32);
        txtBagNum.setMinSize(273, 32);
        TextField txtCurr100 = new TextField();
        txtCurr100.setFont(smlFont);
        txtCurr100.setMaxSize(60, 26);
        txtCurr100.setMinSize(60, 26);
        TextField txtCurr50 = new TextField();
        txtCurr50.setFont(smlFont);
        txtCurr50.setMaxSize(60, 26);
        txtCurr50.setMinSize(60, 26);
        TextField txtCurr20 = new TextField();
        txtCurr20.setFont(smlFont);
        txtCurr20.setMaxSize(60, 26);
        txtCurr20.setMinSize(60, 26);
        TextField txtCurr10 = new TextField();
        txtCurr10.setFont(smlFont);
        txtCurr10.setMaxSize(60, 26);
        txtCurr10.setMinSize(60, 26);
        TextField txtCurr5 = new TextField();
        txtCurr5.setFont(smlFont);
        txtCurr5.setMaxSize(60, 26);
        txtCurr5.setMinSize(60, 26);
        TextField txtCurr2 = new TextField();
        txtCurr2.setFont(smlFont);
        txtCurr2.setMaxSize(60, 26);
        txtCurr2.setMinSize(60, 26);
        TextField txtCurr1 = new TextField();
        txtCurr1.setFont(smlFont);
        txtCurr1.setMaxSize(60, 26);
        txtCurr1.setMinSize(60, 26);
        TextField txtCoin100 = new TextField();
        txtCoin100.setFont(smlFont);
        txtCoin100.setMaxSize(60, 26);
        txtCoin100.setMinSize(60, 26);
        TextField txtCoin50 = new TextField();
        txtCoin50.setFont(smlFont);
        txtCoin50.setMaxSize(60, 26);
        txtCoin50.setMinSize(60, 26);
        TextField txtCoin25 = new TextField();
        txtCoin25.setFont(smlFont);
        txtCoin25.setMaxSize(60, 26);
        txtCoin25.setMinSize(60, 26);
        TextField txtCoin10 = new TextField();
        txtCoin10.setFont(smlFont);
        txtCoin10.setMaxSize(60, 26);
        txtCoin10.setMinSize(60, 26);
        TextField txtCoin5 = new TextField();
        txtCoin5.setFont(smlFont);
        txtCoin5.setMaxSize(60, 26);
        txtCoin5.setMinSize(60, 26);
        TextField txtCoin1 = new TextField();
        txtCoin1.setFont(smlFont);
        txtCoin1.setMaxSize(60, 26);
        txtCoin1.setMinSize(60, 26);
        
        // Boxes/Groups Declarations
        // Constraints for alignment
        ColumnConstraints leftAlign = new ColumnConstraints();
        leftAlign.setHalignment(HPos.LEFT);
        ColumnConstraints rightAlign = new ColumnConstraints();
        rightAlign.setHalignment(HPos.RIGHT);
        ColumnConstraints centered = new ColumnConstraints();
        centered.setHalignment(HPos.CENTER);
        ColumnConstraints notVisible = new ColumnConstraints();
        notVisible.setMinWidth(160);
        // Top Information - Counters and Bag Number
        GridPane grdMisc = new GridPane();
        grdMisc.addColumn(0, lblCtr1, lblCtr2, lblBagNum);
        grdMisc.addColumn(1, txtCtr1, txtCtr2, txtBagNum);
        grdMisc.getColumnConstraints().add(0, rightAlign);
        grdMisc.getColumnConstraints().add(1, leftAlign);
        grdMisc.setVgap(10);
        grdMisc.setHgap(20);
        grdMisc.setAlignment(Pos.CENTER);
        // Cash Section Labels
        GridPane grdCashLbl = new GridPane();
        grdCashLbl.add(lblCash, 0, 0, 2, 1);
        grdCashLbl.add(lblCurr, 0, 1);
        grdCashLbl.add(lblCoin, 1, 1);
        grdCashLbl.add(lblInfo, 2, 0);
        grdCashLbl.setAlignment(Pos.CENTER);
        grdCashLbl.setVgap(5);
        grdCashLbl.setHgap(30);
        grdCashLbl.getColumnConstraints().add(0, notVisible);
        grdCashLbl.getColumnConstraints().add(1, notVisible);
        grdCashLbl.getColumnConstraints().add(2, notVisible);
        grdCashLbl.setPadding(new Insets(0, 0, 0, 90));
        // Cash Section Entry Boxes
        GridPane grdCurr = new GridPane();
        grdCurr.addColumn(0, lblCurr100, lblCurr50, lblCurr20, lblCurr10,
                          lblCurr5, lblCurr2, lblCurr1);
        grdCurr.addColumn(1, txtCurr100, txtCurr50, txtCurr20, txtCurr10,
                          txtCurr5, txtCurr2, txtCurr1);
        GridPane grdCoin = new GridPane();
        grdCoin.addColumn(0, lblCoin100, lblCoin50, lblCoin25, lblCoin10,
                          lblCoin5, lblCoin1);
        grdCoin.addColumn(1, txtCoin100, txtCoin50, txtCoin25, txtCoin10,
                          txtCoin5, txtCoin1);
        grdCurr.getColumnConstraints().add(0, rightAlign);
        grdCurr.getColumnConstraints().add(1, leftAlign);
        grdCoin.getColumnConstraints().add(0, rightAlign);
        grdCoin.getColumnConstraints().add(1, leftAlign);
        grdCurr.setVgap(10);
        grdCurr.setHgap(10);
        grdCoin.setVgap(10);
        grdCoin.setHgap(10);
        // Cash Section Together
        HBox hBoxCash = new HBox(grdCurr, grdCoin, lblInfo);
        hBoxCash.setAlignment(Pos.TOP_CENTER);
        hBoxCash.setSpacing(50);
        hBoxCash.setPadding(new Insets(0, 0, 0, 50));
        // Add the Cash Section Labels
        VBox vBoxCash = new VBox(grdCashLbl, hBoxCash);
        vBoxCash.setAlignment(Pos.CENTER);
        vBoxCash.setSpacing(10);
        // Put it all together
        VBox vBoxAll = new VBox(grdMisc, vBoxCash, btnSaveExit);
        vBoxAll.setAlignment(Pos.CENTER);
        vBoxAll.setSpacing(50);
        // Set the scene and display it
        Scene scnEntCont = new Scene(vBoxAll);        
        stgEntMisc.setTitle("Miscellaneous Information Entry");
        stgEntMisc.setScene(scnEntCont);
        stgEntMisc.setMaximized(true);
        stgEntMisc.show();
        
        // Register Button and set all the values
        btnSaveExit.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent e)
            {
                ctr1 = txtCtr1.getText();
                ctr2 = txtCtr2.getText();
                bagNum = txtBagNum.getText();
                if ("".equals(txtCurr100.getText()))
                    curr100 = 0;
                else
                    curr100 = parseInt(txtCurr100.getText());
                if ("".equals(txtCurr50.getText()))
                    curr50 = 0;
                else
                    curr50 = parseInt(txtCurr50.getText());
                if ("".equals(txtCurr20.getText()))
                    curr20 = 0;
                else
                    curr20 = parseInt(txtCurr20.getText());
                if ("".equals(txtCurr10.getText()))
                    curr10 = 0;
                else
                    curr10 = parseInt(txtCurr10.getText());
                if ("".equals(txtCurr5.getText()))
                    curr5 = 0;
                else
                    curr5 = parseInt(txtCurr5.getText());
                if ("".equals(txtCurr2.getText()))
                    curr2 = 0;
                else
                    curr2 = parseInt(txtCurr2.getText());
                if ("".equals(txtCurr1.getText()))
                    curr1 = 0;
                else
                    curr1 = parseInt(txtCurr1.getText());
                if ("".equals(txtCoin100.getText()))
                    coin100 = 0;
                else
                    coin100 = parseInt(txtCoin100.getText());
                if ("".equals(txtCoin50.getText()))
                    coin50 = 0;
                else
                    coin50 = parseInt(txtCoin50.getText());
                if ("".equals(txtCoin25.getText()))
                    coin25 = 0;
                else
                    coin25 = parseInt(txtCoin25.getText());
                if ("".equals(txtCoin10.getText()))
                    coin10 = 0;
                else
                    coin10 = parseInt(txtCoin10.getText());
                if ("".equals(txtCoin5.getText()))
                    coin5 = 0;
                else
                    coin5 = parseInt(txtCoin5.getText());
                if ("".equals(txtCoin1.getText()))
                    coin1 = 0;
                else
                    coin1 = parseInt(txtCoin1.getText());
                stgEntMisc.close();
            }
        });
    }

    public String getCtr1()
    {
        return ctr1;
    }

    public String getCtr2()
    {
        return ctr2;
    }

    public String getBagNum()
    {
        return bagNum;
    }

    public int getCurr100()
    {
        return curr100;
    }

    public int getCurr50()
    {
        return curr50;
    }

    public int getCurr20()
    {
        return curr20;
    }

    public int getCurr10()
    {
        return curr10;
    }

    public int getCurr5()
    {
        return curr5;
    }

    public int getCurr2()
    {
        return curr2;
    }

    public int getCurr1()
    {
        return curr1;
    }

    public int getCoin100()
    {
        return coin100;
    }

    public int getCoin50()
    {
        return coin50;
    }

    public int getCoin25()
    {
        return coin25;
    }

    public int getCoin10()
    {
        return coin10;
    }

    public int getCoin5()
    {
        return coin5;
    }

    public int getCoin1()
    {
        return coin1;
    }

    
}
