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
public class Commission extends Employee implements Payroll {

    private double commissionRate;
    private double sales;

    public Commission(String id, String name, double rate) {
        super(id, name);
        setCommissionRate(rate);
    }

    @Override
    public void setPayPeriodDetails() {
        String message = "How much is your sales for the current period?";
        sales = Double.parseDouble(JOptionPane.showInputDialog(message));
    }

    @Override
    public double calculatePay() {
        return sales * (commissionRate / 100);
    }

    private void setCommissionRate(double rate) {
        commissionRate = rate;
    }

    @Override
    public String toString() {
        String employeeID = " | Employee ID: " + getId();
        String payment = " | Total Payment: $" + String.format("%.2f", calculatePay());
        return super.toString() + employeeID + payment;
    }
}
