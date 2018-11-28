/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

/**
 *
 * @author Brian
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
    
    
    //
    

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
