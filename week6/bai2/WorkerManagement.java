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
public class WorkerManagement {
    private List<Worker> workers = new ArrayList<>();
    
    public void addWorker(Worker w){
        workers.add(w);
    }
    public void getInformationSalary(){
        
        for(Worker w: workers){
            String temp = w.toString();
            for(Salary s : w.getSalaryHistory())
                System.out.println(temp + " " + s.toString());
        }
}
    public void changeUpSalary(String id, double money){
        for(Worker w:workers){
            if (w.getCode().equals(id)){
                w.addSalary(new Salary(money,"Up",java.time.LocalDate.now().toString()));
            }
        }
    }
}
