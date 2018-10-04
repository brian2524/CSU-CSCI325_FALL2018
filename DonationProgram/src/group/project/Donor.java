/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

/**
 *
 * @author Brian, Dondra, Jedidiah, Kevin, Timia
 */
public class Donor {
    private String firstName = new String();
    private String lastName = new String();
    private String middleInitial = new String();
    private double amountDonated;
    private String areaDonated;
    
    public Donor (String f, String m, String l, double amt, String area){
        firstName = f;
        lastName = l;
        middleInitial = m;
        amountDonated = amt;
        areaDonated = area;
    }
    
    public Donor (String f, String l, double amt, String area){
        firstName = f;
        lastName = l;
        middleInitial = "\b";
        amountDonated = amt;
        areaDonated = area;
    }

    public String getName() {
        return (firstName + " " + middleInitial + " " + lastName);
    }

    public void setName(String f, String m, String l) {
        this.firstName = f;
        this.middleInitial = m;
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
        return ("Donor: " + firstName + " " + middleInitial + " " + lastName
                + "\nAmount given: " + amountDonated
                + "\nArea Donated: " + areaDonated);
    }
    
}
