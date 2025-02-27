/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[]args){
 CourseManagement courseManagerment = new CourseManagement();
        OnlineCourse onlineCoure1 = new OnlineCourse();
        OnlineCourse onlineCoure2 = new OnlineCourse();
        onlineCoure1.InputAll("PRF302", "java web", 3, "Windown", "Ve cong Vo", "note");
        onlineCoure2.InputAll("LAB211", "java web", 3, "Windown", "Hoang TV", "note");
        courseManagerment.addOnlineCourse(onlineCoure1);
        courseManagerment.addOnlineCourse(onlineCoure2);
        OnlineCourse onlineCourse1 = new OnlineCourse();
        OnlineCourse onlineCourse2 = new OnlineCourse();
        onlineCourse1.InputAll(); 
        courseManagerment.addOnlineCourse(onlineCourse1);

        courseManagerment.showOnlineCourse();
        onlineCourse2.InputAll(); 
        courseManagerment.addOnlineCourse(onlineCourse2);

//        courseManagerment.deleteOnlineCourse("01");
        courseManagerment.showOnlineCourse();
    }
}
        
