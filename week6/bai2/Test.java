/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6.bai2;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args){
        WorkerManagement workerManagement = new WorkerManagement();
        
        ArrayList<Salary> sh1 = new ArrayList<>();
        sh1.add(new Salary(20000,"begin", java.time.LocalDate.now().toString()));
        Worker w1 = new Worker("w1","Ha",25,sh1);
        workerManagement.addWorker(w1);
        workerManagement.getInformationSalary();
    }
}
