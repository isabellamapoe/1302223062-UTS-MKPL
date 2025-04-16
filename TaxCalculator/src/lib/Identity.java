/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

/**
 *
 * @author francisca isabella
 */
public class Identity {
    private String idNumber;
    private String address;

    public Identity(String idNumber, String address) {
        this.idNumber = idNumber;
        this.address = address;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getAddress() {
        return address;
    }
}
