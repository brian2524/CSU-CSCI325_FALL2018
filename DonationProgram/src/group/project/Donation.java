  
/*
 * Student Name: Brian Hinkle
 * Program Name: Donation Program
 * Creation Date: 11/26/2018
 * Last Modified Date: 11/2/2020
 * CSCI Course: CSCI 325
 * Grade Received: A
 * Design Comments:
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

/**
 *
 * @author Jedidiah Bird
 */
public class Donation
{
    
    private String donorName;
    private String donationType;
    private double donationAmt;
    private String checkCash;

    public Donation(String name, String type, double amt, String cc)
    {
        donorName = name;
        donationType = type;
        donationAmt = amt;
        checkCash = cc;
    }

    public String getDonorName()
    {
        return donorName;
    }

    public String getDonationType()
    {
        return donationType;
    }

    public double getDonationAmt()
    {
        return donationAmt;
    }

    public String getCheckCash()
    {
        return checkCash;
    }
    
}
