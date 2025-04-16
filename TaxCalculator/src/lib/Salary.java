/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

/**
 *
 * @author francisca isabella
 */
public enum Salary {
    JUNIOR(3000000),
    MID(5000000),
    SENIOR(7000000);

    private final int initialSalary;

    Salary(int initialSalary) {
        this.initialSalary = initialSalary;
    }

    public int getInitialSalary() {
        return initialSalary;
    }
}
