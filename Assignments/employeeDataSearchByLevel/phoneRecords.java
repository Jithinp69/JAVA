/*
 Exercise 3: Create a program in which user can insert phone records of employees working in an organisation. Each phone record should have the following information:
Employee id
Employee name
Department
Employee Level
L1: Intern
L2: Associate
L3: senior
Store this information in an array.
User should be able to search employee data on the basis of employee level.
 */

import java.util.Arrays;
import java.util.Scanner;

class employeeDetails {
    int employeeId;
    String employeeName, department, employeeLevel;

    employeeDetails(int id, String name, String dept, String pos) {
        employeeId = id;
        employeeName = name;
        department = dept;
        employeeLevel = pos;
    }

    int getEmployeeID() {
        return employeeId;
    }

    String getEmployeeName() {
        return employeeName;
    }

    String getDepartment() {
        return department;
    }

    String getEmployeeLevel() {
        return employeeLevel;
    }

    void setEmployeeId() {
        this.employeeId = id;
    }

    void setEmployeeName() {
        this.employeeName = name;
    }

    void setDepartment() {
        this.department = dept;
    }

    void setEmployeeLevel() {
        this.employeeLevel = pos;
    }
}

public class phoneRecords {
    public static void main(String[] args) {

        int index = 0;
        String c = "y";
        employeeDetails[] det = new employeeDetails[10];
        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("============================");
            System.out.println("1. Add Details\n2. View by Employee Level");
            System.out.print("Enter your choice : ");
            int userInput = inp.nextInt();
            if (userInput == 1) {
                System.out.print("Enter Employee Id : ");
                int id = inp.nextInt();
                System.out.print("Enter Employee Name : ");
                String name = inp.next();
                System.out.print("Enter Department : ");
                String dept = inp.next();
                System.out.print("Enter Employee Level (L1,L2,L3) : ");
                String pos = inp.next();

                det[index] = new employeeDetails(id, name, dept, pos);
                index++;
            } else if (userInput == 2) {
                System.out.print("Please enter Employee Level (L1,L2,L3) ");
                String levelInput = inp.next();
                for (employeeDetails e : det) {
                    if (e.employeeLevel == levelInput) {
                        System.out.println(e);
                    } else if (e.employeeLevel == "L2") {
                        System.out.println(e);
                    } else if (e.employeeLevel == "L3") {
                        System.out.println(e);
                    }
                }
            }
            System.out.println("Do you want to continue ? (y/n)");
        } while (c == "y");
        inp.close();
    }

}
