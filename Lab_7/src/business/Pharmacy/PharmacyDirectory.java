package business.Pharmacy;
import java.util.*;

/**
 *
 * @author shreya
 */
public class PharmacyDirectory {
    
    ArrayList<Pharmacist> pharmaArrayList;
    
    // Getter and Setter for java

    public ArrayList<Pharmacist> getPharmaArrayList() {
        return pharmaArrayList;
    }

    public void setPharmaArrayList(ArrayList<Pharmacist> pharmaArrayList) {
        this.pharmaArrayList = pharmaArrayList;
    }
    
    // Adding the items to the pharmaList
    public void addToPharma(Pharmacist pharmaPerson) {
        pharmaArrayList.add(pharmaPerson);
    }
    
    // Removing the items from the pharmaList
    public void removeFromPharma(Pharmacist pharmaPerson) {
        pharmaArrayList.remove(pharmaPerson);
    }
}
