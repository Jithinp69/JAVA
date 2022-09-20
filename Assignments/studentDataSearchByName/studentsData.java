// package studentDataSearchByName;

import java.util.Arrays;
import java.util.Scanner;

class Students{
    int studentId, subjectOne, subjectTwo, subjectThree, subjectFour, subjectFive;
    String studentName;

    Students(int id, String name, int s1, int s2, int s3, int s4, int s5){
        studentId = id;
        studentName = name;
        subjectOne = s1;
        subjectTwo = s2;
        subjectThree = s3;
        subjectFour = s4;
        subjectFive = s5;
    }
}

public class studentsData{
    public static void main(String[] args) {
        int index = 0;
        char next;

        Scanner inp = new Scanner(System.in);
        Students[] newStudentData = new Students[10];

        do{
            System.out.println("Students Data");
            System.out.println("=============");
            System.out.println("1. Add Students Data\n2. View By Name");
            System.out.print(" Enter your selection : ");
            int ui = inp.nextInt();
            if(ui == 1){
                System.out.print("Enter Student Id : ");
                int id = inp.nextInt();
                System.out.print("Enter Student Name : ");
                String name = inp.next();
                System.out.print("Enter marks in SubjectOne : ");
                int s1 = inp.nextInt();
                System.out.print("Enter marks in SubjectTwo : ");
                int s2 = inp.nextInt();
                System.out.print("Enter marks in SubjectThree : ");
                int s3 = inp.nextInt();
                System.out.print("Enter marks in SubjectFour : ");
                int s4 = inp.nextInt();
                System.out.print("Enter marks in SubjectFive : ");
                int s5 = inp.nextInt();
    
                newStudentData[index] = new Students(id, name, s1, s2, s3, s4, s5);
                index++;
            }else if(ui == 2){
                System.out.println("Enter Student Name : ");
                String nm = inp.next();
                for (Students stud : newStudentData) {
                    // if(stud.getStudentName() == nm){
                    //     System.out.println(stud);
                    // }
                    System.out.println(Arrays.toString(stud));
                }
            }
            System.out.println("Do you want to continue ? (y/n)");
            next = inp.next().charAt(0);
        }while(next == 'y');
        inp.close();
        }
}