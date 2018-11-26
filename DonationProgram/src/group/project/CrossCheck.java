/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred
 */
package group.project;

import java.util.ArrayList;

/**
 *
 * @author sonicthe
 * @author Brian2524
 */
public class CrossCheck 
{
    ArrayList<Donation> donation = new ArrayList<Donation>();
    EntMisc data;
    
    private double totalDonationAmt;    //all donations added up as a total
    private double totalAmtCounted; //coin and currency counted as a total
    

    public CrossCheck(ArrayList<Donation> wkDon, EntMisc miscData)
    {
        donation = wkDon;
        data = miscData;
    }
    
    public boolean RunCheck()
    {
        //Assign the floats totalDonationAmt and totalAmtCounted so that this method can compare them
        CalculateTotalDonationAmt();
        CalculateTotalAmtCounted();
        
        
        //compare the calculated values
        if (totalDonationAmt == totalAmtCounted)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    void CalculateTotalDonationAmt()
    {
        double val = 0;
        
        for (int i = 0; i < donation.size(); i++)
        {
            val = val + donation.get(i).getDonationAmt();
            
            if (i == donation.size())
            {
                totalDonationAmt = val;
            }
        }
    }
    
    void CalculateTotalAmtCounted()
    {
        double val = 0;
        val = val + data.getCurr100() * 100.00;
        val = val + data.getCurr50() * 50.00;
        val = val + data.getCurr20() * 20.00;
        val = val + data.getCurr10() * 10.00;
        val = val + data.getCurr5() * 5.00;
        val = val + data.getCurr2() * 2.00;
        val = val + data.getCurr1() * 1.00;
        
        val = val + data.getCoin100() * 1.00;
        val = val + data.getCoin50() * 0.50;
        val = val + data.getCoin25() * 0.25;
        val = val + data.getCoin10() * 0.10;
        val = val + data.getCoin5() * 0.05;
        val = val + data.getCoin1() * 0.01;
        
        totalAmtCounted = val;
    }
    
}