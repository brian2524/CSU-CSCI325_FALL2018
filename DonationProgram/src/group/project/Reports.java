/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

import java.util.ArrayList;
import java.util.Optional;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;

/**
 *
 * @author Kevin G. Lancaster - GUI elements
 * @author Dondra... all other methods
 */
public class Reports
{
    public Reports()
    {
        
    }
    
    public void selectReport(ArrayList<Donation> wkDon, ArrayList<Donor> newDon,
                             EntMisc miscData)
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
            }
            if (rptSelect.getSelectedItem() == "Weekly Summary Report")
            {
                // Method call, passing ArrayList<>wkDon and miscData
            }
            if (rptSelect.getSelectedItem() == "New Donor Report")
            {
                // Method call, passing ArrayList<> newDon
            }
            btnPress = rptSelect.showAndWait();
        }
    }
    
}
