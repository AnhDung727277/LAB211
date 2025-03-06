/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6.bai2;

/**
 *
 * @author DELL
 */
public class Salary {
    public Salary(double salary, String status, String date){
        this.salary = salary;
        this.status = status;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Salary{" + "salary=" + salary + ", status=" + status + ", date=" + date + '}';
    }
    private double salary;
    private String status;
    private String date;
}
