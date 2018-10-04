/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

/**
 *
 * @author Godmode
 */
public class DonorDriver {
    
    
    public static void main(String[] args) {
        
        DonorMain donorList = new DonorMain();
        
        donorList.addDonor(new Donor("Bob R", "Linda", "Donger", 37.00, "CASH",
                "Tithes"));
        donorList.addDonor(new Donor("Bill", "Ella", "Hickok", 25, "1788",
                "Tithes"));
        donorList.addDonor(new Donor("Biff G", "Sally E", "Tannen", 17, "CASH",
                "Tithes"));
        donorList.addDonor(new Donor("Bart", "Tannen", 17, "1234", "Tithes"));
        
        donorList.getDonors();
        
        donorList.getDonor("b");
        
    }
    
}
