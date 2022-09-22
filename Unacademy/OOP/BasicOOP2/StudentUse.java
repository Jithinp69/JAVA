package BasicOOP2;

import BasicsOOP.Student;

public class StudentUse {
    public static void main(String[] args) {

        Student s1 = new Student("John", 22);
        System.out.println(s1.name+" "+s1.getEnrollmentNumber);
        
    }
}
