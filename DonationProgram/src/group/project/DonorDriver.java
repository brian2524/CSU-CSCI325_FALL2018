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
        
        donorList.addDonor(new Donor("Bob", 37.00, "Tithes"));
        donorList.addDonor(new Donor("Bill", 25, "Tithes"));
        donorList.addDonor(new Donor("Biff", 17, "Tithes"));
        
        donorList.getDonors();
        
        donorList.getDonor("Biff");
        
    }
    
}
