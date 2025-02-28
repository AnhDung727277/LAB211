/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ManagerStudentsAndTeacher {
    private ArrayList<Student> studentsList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    
private boolean checkStudent(Student st) {
        // kiểm tra sinh viên đã có trong list chưa và kiểm tra, nếu chưa có thì trả về true, còn nếu có thì trả về false.
        for (Student student : studentsList) {
            if (student.getId().equals(st.getId())) {
                if (student.getSemester().equals(st.getSemester())) {
                    if (student.getCourse().equals(st.getCourse())) {
                        return false;
                    }
                }

            }

        }
        return true;
    }

public boolean addStudent(Student st) {
        Scanner sc = new Scanner(System.in);
        if(studentsList.size() >= 3){
            System.out.println("Do you want to add ? (yes/no)");
            String answer = sc.nextLine().trim().toLowerCase();
            if(!answer.equals("yes")){
                System.out.println("Back to main Screen");
                return false;
            }
        }
        if (checkStudent(st)) {
            studentsList.add(st);
            return true;
        }
        System.out.println("Students already exist in list");
        return false;
    }
    public void showStudent(){
        for(Student st:studentsList){
            System.out.println(st.toString());
        }
    }
    public List<Student> findStudents(String keyword) {
        List<Student> result = new ArrayList<>();
        for (Student s : studentsList) {
            if (s.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(s);
            }
        }
        result.sort(Comparator.comparing(Student::getName));
        return result;
    }
 public int deleteStudent(String id) {
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getId().equals(id)) {
                studentsList.remove(i);
                return 1;
            }
        }

        return 0;
    }
      public boolean updateStudent(String id, String name, String semester, String course) {
        for (Student student : studentsList) {
            if (student.getId().equals(id)) {
                studentsList.add(new Student(id, name, semester, course));
                break;
            }
        }
        return false;
      }
       public void sortStudent(){
        
        Collections.sort(studentsList, new Comparator<Student>(){
            @Override
            public int compare (Student st1, Student st2){
                return st1.getName().compareTo(st2.getName());
            }
        
    });
    }
   public void report() {
        Map<String, Integer> reportData = new HashMap<>();
        for (Student s : studentsList) {
            String key = s.getId() + "|" + s.getName() + "|" + s.getCourse() + s.getSemester();
            reportData.put(key, reportData.getOrDefault(key, 0) + 1);
        }
        reportData.forEach((k, v) -> System.out.println(k + ", Total Courses: " + v));
    }
        
    }


