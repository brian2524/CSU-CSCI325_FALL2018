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
 * @author Brian Hinkle
 */
package group.project;

/**
 *
 * @author Brian Hinkle
 */
public class Subtotal 
{
    private String areaName;
    private double amt;
    
    
    public Subtotal(String area, double amount)
    {
        areaName = area;
        amt = amount;
    }
    
    
    

    public String getAreaName() {
        return areaName;
    }

    public double getAmt() {
        return amt;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }
    
    
    
    
    
    
    
    
    
    
}
