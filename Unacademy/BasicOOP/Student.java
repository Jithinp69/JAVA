// package OOP.BasicOOP;

public class Student {
    String name;
    private int enrollmentNumber;

    // parameterized constructor
    public Student(String name, int enrollmentNumber){
        this.name = name;
        this.enrollmentNumber = enrollmentNumber;
    }
    // non-parameterized constructor
    public Student(){

    }
    // setter method 
    public void setEnrollmentNumber(int num) {
        if (num < 0) {
            return;
        }
        enrollmentNumber = num;
    }
    // getter method
    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }

}
