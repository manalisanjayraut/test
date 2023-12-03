/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Person.Person;
import business.Employee.Employee;
import business.Role.Role;
import business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {

    private String username;
    private String password;
    private Person person;
    private Role role;
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return username;
    }

}
