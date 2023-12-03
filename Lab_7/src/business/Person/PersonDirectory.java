/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class PersonDirectory {
    
      ArrayList<Person> personlist ;
    
      public PersonDirectory (){
          
       personlist = new ArrayList();

    }

    public Person newPerson() {

        Person p = new Person();
        personlist.add(p);
       // System.out.println("p from java class"+p);
        return p;
    }
    
    public Person newPerson(String id) {

        Person p = new Person(id);
        personlist.add(p);
        return p;
    }
    
     public Person newPerson(String email, String firstName, String lastName, String phoneNumber, String location) {
        
            Person p = new Person(firstName, lastName, phoneNumber,email, location);

            personlist.add(p);
            return p;
        }

    public Person findPerson(String id) {

        for (Person p : personlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
         }
    
    public ArrayList<Person> getPersonList() {
        return personlist;
    }

    
}
