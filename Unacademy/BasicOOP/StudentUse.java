public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student("jithin" ,200);
        System.out.println(s1.name+" "+s1.getEnrollmentNumber());
        s1.setEnrollmentNumber(201);
        System.out.println(s1.getEnrollmentNumber());
        // s1.name = "jithin";
        // s1.enrollmentNumber = 101;
        // System.out.println(s1.name + " "+s1.enrollmentNumber);
        Student s2 = new Student();
        // s2.name = "Prajwal";
        // s2.enrollmentNumber = 102;
        // System.out.println(s2.name + " " + s2.enrollmentNumber);
    }
}
