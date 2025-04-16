/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

/**
 *
 * @author francisca isabella
 */
public class PersonalInfo {
    public enum Gender {
        MALE, FEMALE
    }

    private String firstName;
    private String lastName;
    private boolean isForeigner;
    private Gender gender;

    public PersonalInfo(String firstName, String lastName, boolean isForeigner, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isForeigner = isForeigner;
        this.gender = gender;
    }

    public boolean isForeigner() {
        return isForeigner;
    }

    public Gender getGender() {
        return gender;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
