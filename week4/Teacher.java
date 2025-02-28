/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Teacher extends Person{
    private int yearInProfession;
    private String contractType;
    private double salaryCoefficient;
    private int yearPro;
    private String contactType;
    private double salary;

    public Teacher() {
        super();
        this.yearInProfession = 0;
        this.contractType = "";
        this.salaryCoefficient = 0.0;
        this.yearPro = 0;
        this.contactType = "";
        this.salary = 0.0;
    }
    
    public void inputAll(){
        Scanner sc = new Scanner(System.in);
        //nhap lieu cho 3 thuoc tinh cua rieng teacher 
        super.inputAll();
        while(true){
            System.out.println("Enter year in profession: ");
            this.yearInProfession = sc.nextInt();
    @Override
    public void inputAll(Scanner sc){
        super.inputAll(sc);
                while (true) {
            System.out.print("Year in the profession: ");
            yearPro = sc.nextInt();
            sc.nextLine();
            int age = java.time.Year.now().getValue() - getYearOfBirth();
            if(yearInProfession >=0 && yearInProfession < age) break;
            System.out.println("invalid year");
            if (Utils.isValidYearInProfession(yearPro, yearOB)) break;
            System.out.println("Data input is invalid");
        }

        while (true) {
            System.out.print("Contract type (Long/Short): ");
            contactType = sc.nextLine();
            if (Utils.isValidContractType(contactType)) break;
            System.out.println("Data input is invalid");
        }
        
        while(true){
            System.out.println("Enter contract type: ");
            this.contractType = sc.nextLine();

        while (true) {
            System.out.print("Salary coefficient: ");
            salary = sc.nextDouble();
            sc.nextLine();
            if(contractType.equals("long")|| contractType.equals("Short")) break;
            System.out.println("error...");
            if (Utils.isValidSalaryCoefficient(salary)) break;
            System.out.println("Data input is invalid");
        }
        
        while(true){
            System.out.println("Enter salary coefficient: ");
            this.salaryCoefficient = sc.nextDouble();
            if(salaryCoefficient >= 0) break;
            System.out.println(" error....");
         }
    }


    @Override
    public String toString() {
        return super.toString() + "Teacher{" + "yearInProfession=" + yearInProfession + ", contractType=" + contractType + ", salaryCoefficient=" + salaryCoefficient + '}';
        return super.toString()+String.format(" - %d - %s - %.1f\n", yearPro, contactType, salary);
    }

    
}
