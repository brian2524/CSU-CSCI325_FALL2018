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
    
    private double totalCurrency;
    private double totalCoin;
    

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
            if (donation.get(i).getCheckCash().equals("CASH"))
            {
                val = val + donation.get(i).getDonationAmt();
            }
        }
        totalDonationAmt = val;
    }
    
    void CalculateTotalAmtCounted()
    {
        totalCurrency = totalCurrency + data.getCurr100() * 100.00;
        totalCurrency = totalCurrency + data.getCurr50() * 50.00;
        totalCurrency = totalCurrency + data.getCurr20() * 20.00;
        totalCurrency = totalCurrency + data.getCurr10() * 10.00;
        totalCurrency = totalCurrency + data.getCurr5() * 5.00;
        totalCurrency = totalCurrency + data.getCurr2() * 2.00;
        totalCurrency = totalCurrency + data.getCurr1() * 1.00;
        
        totalCoin = totalCoin + data.getCoin100() * 1.00;
        totalCoin = totalCoin + data.getCoin50() * 0.50;
        totalCoin = totalCoin + data.getCoin25() * 0.25;
        totalCoin = totalCoin + data.getCoin10() * 0.10;
        totalCoin = totalCoin + data.getCoin5() * 0.05;
        totalCoin = totalCoin + data.getCoin1() * 0.01;
        
        totalAmtCounted = totalCurrency + totalCoin;
    }
}