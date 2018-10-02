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
    private String name = new String();
    private double amountDonated;
    private String areaDonated;
    
    public Donor (String n, double amt, String area){
        name = n;
        amountDonated = amt;
        areaDonated = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return ("Donor: " + name + "\nAmount given: " + amountDonated
                + "\nArea Donated: " + areaDonated);
    }
    
}
