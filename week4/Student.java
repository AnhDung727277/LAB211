package week4;

public class Student {

    private String id;
    private String name;
    private String semester;
    private String course;
    
    public Student(String id, String name, String semester, String course) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.course = course;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSemester() {
        return semester;
    }
    
    public String getCourse() {
        return course;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name  + ", Semester: " + semester + ", Course: " + course;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

