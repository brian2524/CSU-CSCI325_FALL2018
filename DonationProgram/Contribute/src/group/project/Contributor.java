/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.project;


/**
 *
 * @author timiadavis
 */
public class Contributor {
    private double amount, subtotal, total, deposit;
    private String offering;
    private String name;
    private String contribT;
    private String time, payment;
    private int items;
    
    public Contributor() {
        
    }
    
    public String getControlName() {
        return name;
    }
    
    public String getTypeFromContributor() {
        return contribT;
    }
    
    public void printResults() {
        
    }
    
    public String offeringType() {
        return offering;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public double getsubTotal() {
        return subtotal;
    }
    
    public double calculateTotal() {
        return total;
    }
    
    public double deposit() {
        return deposit;
    }
    
    public void disDeposit() {
        
    }
    
    public int numbOfItems() {
     return items;   
    }
    
    
    public String getTime () {
        return time;
    }
    
    public void date() {
        
    }
}
    

   
