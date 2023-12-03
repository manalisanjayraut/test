/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Doctor.DoctorDirectorty;
import business.Role.DoctorRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class DoctorOrganization extends Organization{
    
    private DoctorDirectorty doctorDirectory;

    public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
        this.doctorDirectory = new DoctorDirectorty();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }

    public DoctorDirectorty getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectorty doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    
     
}