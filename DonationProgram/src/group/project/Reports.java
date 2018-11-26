/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

import java.util.ArrayList;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;

/**
 *
 * @author Kevin G. Lancaster - GUI elements
 * @author Dondra... all other methods
 */
public class Reports
{
    DonationReport donRpt;
    
    public Reports()
    {
        
    }
    
    public void selectReport(ArrayList<Donation> wkDon, ArrayList<Donor> newDon,
                             EntMisc miscData, CrossCheck crossCheckData)
    {
        boolean newDonors = newDon.isEmpty();
        ChoiceDialog rptSelect = new ChoiceDialog("Weekly Donation Report",
                                                  "Weekly Summary Report",
                                                  "Finished");
        if (!newDonors)
        {
            rptSelect.getItems().add(1, "New Donor Report");
        }
        String rptSelectText = ("Select Report to View and Print.\nSelect " +
                                "\"Finished\" when finished.");
        rptSelect.setContentText(rptSelectText);
        rptSelect.setTitle("Report Selection");
        rptSelect.setHeaderText("");
        Optional<ButtonType> btnPress = rptSelect.showAndWait();
        while ((rptSelect.getSelectedItem() != "Finished") &&
               (btnPress.isPresent() && btnPress.get() != ButtonType.CANCEL))
        {            
            if (rptSelect.getSelectedItem() == "Weekly Donation Report")
            {
                // Method call, passing ArrayList<>wkDon
                //testWkDonRpt(wkDon);
                this.donRpt = new DonationReport();
                donRpt.setDonation(wkDon);
            }
            if (rptSelect.getSelectedItem() == "Weekly Summary Report")
            {
                // Method call, passing ArrayList<>wkDon and miscData
                testSumRpt(wkDon, miscData, crossCheckData);
            }
            if (rptSelect.getSelectedItem() == "New Donor Report")
            {
                // Method call, passing ArrayList<> newDon
                testNewDonRpt(newDon);
            }
            btnPress = rptSelect.showAndWait();
        }
    }
    
    private void testWkDonRpt(ArrayList<Donation> wkDon)
    {
        Alert wkDonRpt = new Alert(Alert.AlertType.INFORMATION, "Weekly Donor Report");
        for (int i =0; i < wkDon.size(); i++)
        {
            System.out.println(wkDon.get(i).getDonorName() + "  " +
                               wkDon.get(i).getDonationType() + "  " +
                               wkDon.get(i).getDonationAmt() + "  " +
                               wkDon.get(i).getCheckCash());
        }
        wkDonRpt.showAndWait();
    }

    private void testSumRpt(ArrayList<Donation> wkDon, EntMisc miscData,
                            CrossCheck crossCheckData)
    {
        Alert wkDonRpt = new Alert(Alert.AlertType.INFORMATION, "Weekly Summary Report");
        for (int i =0; i < wkDon.size(); i++)
        {
            System.out.println(wkDon.get(i).getDonorName() + "  " +
                               wkDon.get(i).getDonationType() + "  " +
                               wkDon.get(i).getDonationAmt() + "  " +
                               wkDon.get(i).getCheckCash());
            System.out.println(miscData.getCtr1() + "  " +
                               miscData.getCtr2() + "  " +
                               miscData.getBagNum());
        }
        wkDonRpt.showAndWait();
    }

    private void testNewDonRpt(ArrayList<Donor> newDon)
    {
        Alert newDonRpt = new Alert(Alert.AlertType.INFORMATION, "New Donor Report");
        for (int i = 0; i < newDon.size(); i++)
        {
            System.out.println(newDon.get(i).getName() + "  " +
                               newDon.get(i).getNotes() + "\n\n");
        }
        newDonRpt.showAndWait();
    }

}
