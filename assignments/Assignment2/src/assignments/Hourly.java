/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments;

import javax.swing.JOptionPane;

/**
 *
 * @author Ralph
 */
public class Hourly extends Employee implements Payroll {

    private double hourlyRate;
    private final double[] WorkWeekHours;

    public Hourly(String id, String name, double rate) {
        super(id, name);
        WorkWeekHours = new double[2];
        setHourlyRate(rate);
    }

    @Override
    public void setPayPeriodDetails() {
        String message = "How many hours did you work in the first week?";
        WorkWeekHours[0] = Double.parseDouble(JOptionPane.showInputDialog(message));
        message = "How many hours did you work in the second week?";
        WorkWeekHours[1] = Double.parseDouble(JOptionPane.showInputDialog(message));
    }

    @Override
    public double calculatePay() {
        double pay = 0;
        // loop twice for week 1 and week 2
        for (int count = 0; count < 2; count++) {
            if (WorkWeekHours[count] > 40.0) {
                pay += 40.0 * hourlyRate;
                pay += (WorkWeekHours[count] - 40.0) * hourlyRate * 1.5;
            } else {
                pay += WorkWeekHours[count] * hourlyRate;
            }
        }
        return pay;
    }

    private void setHourlyRate(double rate) {
        hourlyRate = rate;
    }

    @Override
    public String toString() {
        String employeeID = " | Employee ID: " + getId();
        String payment = " | Total Payment: $" + String.format("%.2f", calculatePay());
        return super.toString() + employeeID + payment;
    }
}
