/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Organization.DoctorOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class DoctorRole extends Role {

    public DoctorRole() {
        this.type = RoleType.Doctor;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        this.type = RoleType.Doctor;
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization) organization, business);
    }

}
