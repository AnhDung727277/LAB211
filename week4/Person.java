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
public class Person {
    private String id;
    private String name;
    private String phonenumber;
    private int yob;
    private String major;

    public Person() {
        this.id = "";
        this.name = "";
        this.phonenumber = "";
        this.yob = 0;
        this.major = "";
    }
    public void inputAll(Scanner sc){
        while(true){
            System.out.println("Enter ID: ");
            this.id = sc.nextLine();
            if(id.matches("\\d{6}")) break;
            System.out.println("Invalid value");
        }
        while(true){
            System.out.println("Enter name: ");
            this.name = sc.nextLine();
            if(name.matches("[a-zA-Z+]")) break;
            System.out.println("Invalid value");
        }
        while(true){
            System.out.println("Enter PhoneNumber: ");
            this.phonenumber = sc.nextLine();
            if(this.phonenumber.matches("\\d{12}")) break;
        }
      
        while (true) {
            System.out.print("Enter Year of Birth (before current year): ");
            try {
                this.yob =sc.nextInt();
                if (this.yob < java.time.Year.now().getValue()) break;
                System.out.println("Invalid year. Must be before the current year.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a valid year.");
            }
        }
        while(true){
            System.out.println("Enter Major");
            this.major = sc.nextLine();
            if(this.major.length() <= 30) break;
            System.out.println("Invalid value");
        }
    }
}


