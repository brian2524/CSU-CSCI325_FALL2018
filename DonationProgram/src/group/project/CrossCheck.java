/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

import java.util.ArrayList;

/**
 *
 * @author Brian Hinkle
 */
public class CrossCheck {

    ArrayList<Donation> donation = new ArrayList<Donation>();
    EntMisc data;
    
    double totalDonationAmt;
    double totalAmtCounted;
    

    public CrossCheck(ArrayList<Donation> wkDon, EntMisc miscData)
    {
        donation = wkDon;
        data = miscData;
    }
    
    
    
    public boolean RunCheck()
    {
        return true;        //temp return val
    }
    
    public int CountChecks()
    {
        return 1;           //temp return val
    }
}
