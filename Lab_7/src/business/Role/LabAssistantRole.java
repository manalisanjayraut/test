/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class LabAssistantRole extends Role {

    public LabAssistantRole() {
        this.type = RoleType.LabAssistant;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        this.type = RoleType.LabAssistant;
        return new LabAssistantWorkAreaJPanel(userProcessContainer, account, organization, business);
    }

}
