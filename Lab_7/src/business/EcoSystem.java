/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Organization.OrganizationDirectory;
import business.UserAccount.UserAccountDirectory;

/**
 *
 * @author Administrator
 */
public class EcoSystem {

    private static EcoSystem ecoSystem;
    private OrganizationDirectory organizationDirectory;
    private UserAccountDirectory accountDirectory;

    public static EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    private EcoSystem() {
        organizationDirectory = new OrganizationDirectory();
        accountDirectory = new UserAccountDirectory();
        
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public static EcoSystem getEcoSystem() {
        return ecoSystem;
    }

    public static void setEcoSystem(EcoSystem ecoSystem) {
        EcoSystem.ecoSystem = ecoSystem;
    }

    public UserAccountDirectory getAccountDirectory() {
        return accountDirectory;
    }

    public void setAccountDirectory(UserAccountDirectory accountDirectory) {
        this.accountDirectory = accountDirectory;
    }
    
    
}
