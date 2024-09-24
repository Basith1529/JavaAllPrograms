package printhello;

class Student {
    // Attributes
    int studentId;
    String studentName;
    int english, tamil, maths, science, social;

    // Setter methods to assign values
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setTamil(int tamil) {
        this.tamil = tamil;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("English Marks: " + english);
        System.out.println("Tamil   Marks: " + tamil);
        System.out.println("Maths   Marks: " + maths);
        System.out.println("Science Marks: " + science);
        System.out.println("Social  Marks: " + social);
    }
}

class StudentPerformance {
    Student student;

    // Method to set the Student object
    public void setStudent(Student student) {
        this.student = student;
    }

    // Method to calculate the total marks
    public int calculateSum() {
        return student.english + student.tamil + student.maths + student.science + student.social;
    }

    // Method to calculate the average marks
    public double calculateAverage() {
        return calculateSum() / 5;
    }

    // Method to display the student's performance
    public void displayPerformance() {
        int total = calculateSum();
        double average = calculateAverage();
        System.out.println("\nPerformance:");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student();
        student1.setStudentId(290619);
        student1.setStudentName("Ahamed Basith");
        student1.setEnglish(88);
        student1.setTamil(89);
        student1.setMaths(69);
        student1.setScience(97);
        student1.setSocial(97);

        // Displaying student details
        student1.displayDetails();

        // Creating a StudentPerformance object and setting the Student object
        StudentPerformance performance1 = new StudentPerformance();
        performance1.setStudent(student1);
        
        // Displaying the student's performance
        performance1.displayPerformance();
    }
}
