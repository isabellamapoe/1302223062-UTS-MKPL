/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;
import java.time.LocalDate;

/**
 *
 * @author francisca isabella
 */
public class JoinDate {
    private LocalDate joinDate;

    public JoinDate(int year, int month, int day) {
        this.joinDate = LocalDate.of(year, month, day);
    }

    public int getMonthWorkingInYear() {
        LocalDate now = LocalDate.now();
        if (now.getYear() == joinDate.getYear()) {
            return now.getMonthValue() - joinDate.getMonthValue();
        } else {
            return 12;
        }
    }
}
