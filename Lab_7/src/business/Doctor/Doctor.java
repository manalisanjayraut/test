package business.Doctor;

import business.Employee.Employee;
import business.Person.Person;

/**
 *
 * @author manali
 */
public class Doctor  {

    String specialization;
    String hospital;
    public Employee e;
   
    public Doctor(Employee e)
    {
        this.e = e;
    }
    

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getHospital() {
        return hospital;
    }
    
    
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

   

}
