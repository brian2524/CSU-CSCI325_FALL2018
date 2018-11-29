    

/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred
 */
package group.project;

import java.util.ArrayList;

/**
 *
 * @author Brian Hinkle
 */
public class CrossCheck 
{
    EntMisc data;
    ArrayList<Donation> donation = new ArrayList<Donation>();
    
    
    ArrayList<Subtotal> subtotals = new ArrayList<Subtotal>();  //arraylist of area totals
    private double totalDonationAmt;    //all donations added up as a total
    private double totalAmtCounted; //coin and currency counted as a total
    private double totalCurrency;
    private double totalCoin;
    private double totalAmountOfChecks;
    

    public CrossCheck(ArrayList<Donation> wkDon, EntMisc miscData)
    {
        donation = wkDon;
        data = miscData;
        
        
        CreateSubtotals();
        CalculateAmountOfChecks();
        
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
    
    void CreateSubtotals()
    {
        subtotals.add(new Subtotal("TITHES & OFFERINGS", 0));
        subtotals.add(new Subtotal("SUNDAY SCHOOL", 0));
        subtotals.add(new Subtotal("FAITH PROMISE 10%", 0));
        
        for (int i = 0; i < donation.size(); i++)
        {
            boolean needsNew = true;
            for (int o = 0; o < subtotals.size(); o++)
            {
                if (donation.get(i).getDonationType().equals(subtotals.get(o).getAreaName()))
                {
                    subtotals.get(o).setAmt(subtotals.get(o).getAmt() + donation.get(i).getDonationAmt());
                    needsNew = false;
                }
            }
            
            
            
            
            if (needsNew == true)
            {
                subtotals.add(new Subtotal(donation.get(i).getDonationType(), donation.get(i).getDonationAmt()));
                needsNew = false;
            }
        }
    }
            
    
    
    void CalculateAmountOfChecks()
    {
        for (int i = 0; i < donation.size(); i++)
        {
            try 
            { 
                Integer.parseInt(donation.get(i).getCheckCash()); 
                totalAmountOfChecks++;
            }  
            catch (NumberFormatException e)  
            { 
                
            }  
        }
    }
    
    
    
    
    // GETTERS

    public ArrayList<Subtotal> getSubtotals() {
        return subtotals;
    }

    public double getTotalDonationAmt() {
        return totalDonationAmt;
    }

    public double getTotalAmtCounted() {
        return totalAmtCounted;
    }

    public double getTotalCurrency() {
        return totalCurrency;
    }

    public double getTotalCoin() {
        return totalCoin;
    }

    public double getTotalAmountOfChecks() {
        return totalAmountOfChecks;
    }
    
}