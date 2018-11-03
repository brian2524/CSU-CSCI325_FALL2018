/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.project;

import java.util.ArrayList;

/**
 *
 * @author Jedidiah Bird
 */
public class DonationMain
{
    
    private ArrayList<Donation> Donations;

    public DonationMain()
    {
        Donations = new ArrayList<>();
    }
    
    public void addDonations(Donation e)
    {
        Donations.add(e);
    }
    
    public void getDonations()
    {
        for (int i = 0; i < Donations.size(); i++)
        {
            Donation currentDonation = Donations.get(i);
            System.out.println(currentDonation.getDonorName());
            System.out.println(currentDonation.getDonationType());
            System.out.println(currentDonation.getDonationAmt());
            System.out.println(currentDonation.getCheckCash());
        }
    }
    
    public void getDonation(String n)
    {
        String donorName = new String();
        String name = new String();
        boolean validate = false;
        name = ".*" + n + name.concat(".*");
        name = name.toUpperCase();
        for (int i = 0; i < Donations.size(); i++)
        {
            Donation currentDonation = Donations.get(i);
            donorName = currentDonation.getDonorName();
            if (donorName.matches(name))
            {
                System.out.println(currentDonation.getDonorName());
                validate = true;
            }
        }
        if (validate == false)
        {
            System.out.println("No donor found.  Please check the name.");
        }
    }
    
    public void removeDonation(String name)
    {
        
        for (int i = 0; i < Donations.size(); i++)
        {
            Donation currentDonation = Donations.get(i);
            if (currentDonation.getDonorName().equals(name))
            {
                Donations.remove(i);
            }
        }
    }   
}
