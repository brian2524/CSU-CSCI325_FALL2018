/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

import java.util.ArrayList;

/**
 *
 * @author Godmode
 */
public class DonorDriver {
    
    public static void main(String[] args) {
        
        DonorMain donorList = new DonorMain();
        
        donorList.addDonor(new Donor("Bob", "L", "Donger", 37.00, "Tithes"));
        donorList.addDonor(new Donor("Bill", "E", "Hickok", 25, "Tithes"));
        donorList.addDonor(new Donor("Biff", "N", "Tannen", 17, "Tithes"));
        donorList.addDonor(new Donor("Bart", "Tannen", 17, "Tithes"));
        
        donorList.getDonors();
        
        donorList.getDonor("bill");
        
    }
    
}
