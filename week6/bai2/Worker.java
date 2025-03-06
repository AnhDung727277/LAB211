/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6.bai2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Worker {
    private String code;
    private String name;
    private int age;
    ArrayList<Salary> salaryHistory;

    public String getCode() {
        return code;
    }

    public Worker(String code, String name, int age,ArrayList<Salary> salaryHistory) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.salaryHistory =  salaryHistory;
    }

    public ArrayList<Salary> getSalaryHistory() {
        return salaryHistory;
    }

    @Override
    public String toString() {
        return "Worker{" + "code=" + code + ", name=" + name + ", age=" + age + ", salaryHistory=" + salaryHistory + '}';
    }
    
    public void addSalary(Salary s){
        salaryHistory.add(s);
    }
}

