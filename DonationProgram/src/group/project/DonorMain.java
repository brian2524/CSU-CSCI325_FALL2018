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
public class DonorMain {
    
    ArrayList<Donor> Donors;

    public DonorMain() {
        Donors = new ArrayList<>();
    }
    
    public void addDonor(Donor d){
        Donors.add(d);
    }
    
//    public ArrayList<Donor> getDonors(){
//        return Donors;
//    }
    public void getDonors(){
        for (int i = 0; i < Donors.size(); i++){
            Donor currentDonor = Donors.get(i);
            System.out.println(currentDonor);
        }
    }

    public void getDonor(String name){
        
        for (int i = 0; i < Donors.size(); i++){
            Donor currentDonor = Donors.get(i);
            if (currentDonor.getName().equals(name)){
                System.out.println(currentDonor);
            }
        }
        
    }
    
    public void removeDonor(String name){
        
        for (int i = 0; i < Donors.size(); i++){
            Donor currentDonor = Donors.get(i);
            if (currentDonor.getName().equals(name)){
                Donors.remove(i);
            }
        }
        
    }
    
}
