/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kal bugrara
 */
public class Person {

    private String id;
    private String email;
    public String firstName;
    private String lastName;
    private String phoneNumber;
    private String type;
    private String lastActivity;
    private String lastUpdated;
    private boolean isLoggedIn;
    public String LoggedInUserID;
    private String location;
  

    public Person(String id, String lastActivity, String lastUpdated,  String email, String firstName, String lastName, String phoneNumber,String type) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.lastActivity = lastActivity;
        this.lastUpdated = lastUpdated;
        this.isLoggedIn = false; // Initially set to not logged in
    }
    
     public Person(String firstName, String lastName, String email,String phoneNumber,String location) {
       // this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
  private static Map<String, List<Integer>> facultyRatings;

    public Person() {
      facultyRatings = new HashMap<>();
    }

    public Person(String id) {
        this.id = id;
    }
    
    

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    

    public String getPersonId() {
        return id;
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public String getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(String lastActivity) {
        this.lastActivity = lastActivity;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    
    @Override
    public String toString() {
        return getPersonId();
    }
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
    
    public void logIn(String id) {
        isLoggedIn = true;
        LoggedInUserID = id;
    }

    public void logOut() {
        isLoggedIn = false;
    }

   
    public static void addRating(String facultyName, int rating) {
        // Check if the faculty member exists in the map
        if (!facultyRatings.containsKey(facultyName)) {
            facultyRatings.put(facultyName, new ArrayList<>());
        }
        // Add the rating to the faculty's list of ratings
        facultyRatings.get(facultyName).add(rating);
       // System.out.println("facultyRatings"+facultyRatings);
    }

    public List<Integer> getRatings(String facultyName) {
        return facultyRatings.get(facultyName);
    }

    
   public static double calculateAverageRating(String facultyName) {
    List<Integer> ratings = facultyRatings.get(facultyName);
    if (ratings == null || ratings.isEmpty()) {
        return 0.0; // Avoid division by zero
    } else {
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return (double) sum / ratings.size();
    }
    }
    
}
