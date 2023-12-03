/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Doctor.DoctorDirectorty;
import business.Pharmacy.PharmacyDirectory;
import business.Role.DoctorRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author manal
 */
public class PharmacyOrganization extends Organization{
    
    private PharmacyDirectory pharmacyDirectory;

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