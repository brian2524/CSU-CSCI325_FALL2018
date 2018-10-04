/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

/**
 *
 * @author Jedidiah Bird
 */
public class Donor {
    private String firstName = new String();
    private String lastName = new String();
    private String spouseName = new String();
    private double amountDonated;
    private String cashCheck = new String();
    private String areaDonated = new String();
    
    public Donor (String f, String s, String l, double amt, String cc,
            String area){
        firstName = f;
        lastName = l;
        spouseName = s;
        amountDonated = amt;
        cashCheck = cc;
        areaDonated = area;
    }
    
    public Donor (String f, String l, double amt, String cc, String area){
        firstName = f;
        lastName = l;
        spouseName = "\b";
        amountDonated = amt;
        cashCheck = cc;
        areaDonated = area;
    }

    public String getName() {
        return (firstName + " " + spouseName + " " + lastName);
    }

    public void setName(String f, String s, String l) {
        this.firstName = f;
        this.spouseName = s;
        this.lastName = l;
    }

    public double getAmountDonated() {
        return amountDonated;
    }

    public void setAmountDonated(double amountDonated) {
        this.amountDonated = amountDonated;
    }

    public String getAreaDonated() {
        return areaDonated;
    }

    public void setAreaDonated(String areaDonated) {
        this.areaDonated = areaDonated;
    }
    
    @Override
    public String toString(){
        String output = new String();
        
        if (this.spouseName.equals("\b")){
            output = ("Donor: " + firstName + " " + lastName
                + "\nAmount given: " + amountDonated + " (" + cashCheck + ")"
                + "\nArea Donated: " + areaDonated);
        }
        else{
            output = ("Donor: " + firstName + " & " + spouseName + " " + lastName
                + "\nAmount given: " + amountDonated + " (" + cashCheck + ")"
                + "\nArea Donated: " + areaDonated);
        }
        
        
        return output;
    }
    
}
