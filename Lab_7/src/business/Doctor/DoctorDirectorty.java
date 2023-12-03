/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Doctor;


import business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author manali
 */
public class DoctorDirectorty {

    private ArrayList<Doctor> doctorList;

    public DoctorDirectorty() {
        doctorList = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public Doctor createDoctor(Employee e) {
        Doctor doctor = new Doctor(e);
        doctorList.add(doctor);
        return doctor;
    }

   
    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

  
   
    
   

   

}
