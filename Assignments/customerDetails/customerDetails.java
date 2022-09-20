/* 
Exercise 2: Create a program in which user can enter customer data. The customer data should contain the following information:
Customer Id
Customer Name
Purchase date(dd/mm/yy)
Bill amount
Store this information in an array. The program should provide three different options for viewing information:
View all customer data in sorted order based on bill amount
View total purchase amount for a specific year
View details of a specific customer based on name
*/

import java.util.Arrays;
import java.util.Scanner;

class customerData {
    String customerId, customerName, billAmount;
    Double purchaseDate;

    customerData(String id, String name, Double date, String amount) {
        customerId = id;
        customerName = name;
        purchaseDate = date;
        billAmount = amount;
    }

    String getCustomerId() {
        return customerId;
    }

    String getCustomerName() {
        return customerName;
    }

    Double getPurchaseDate() {
        return purchaseDate;
    }

    String getBillAmount() {
        return billAmount;
    }

    void setCustomerId(String id) {
        this.customerId = id;
    }

    void setCustomerName(String name) {
        this.customerName = name;
    }

    void setPurchaseDate(Double date) {
        this.purchaseDate = date;
    }

    void setBillAmount(String amount) {
        this.billAmount = amount;
    }

    @Override
    public String toString() {
        return customerId + " " + customerName + " " + purchaseDate + " " + billAmount;
    }

}

public class customerDetails {
    public static void main(String[] args) {
        int idx = 0;
        char chr;

        customerData[] arrayOfCustomerData = new customerData[5];
        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Welcome");
            System.out.println("1. Add Details\n2. View Details");
            System.out.println();
            System.out.print("Enter your choice : ");
            int input = inp.nextInt();

            if (input == 1) {
                System.out.println("Enter the below details");
                System.out.print("CUSTOMER ID : ");
                String id = inp.next();
                System.out.println("CUSTOMER NAME : ");
                String name = inp.next();
                System.out.println("PURCHASED DATE : ");
                Double date = inp.nextDouble();
                System.out.println("BILL AMOUNT : ");
                String amount = inp.next();

                arrayOfCustomerData[idx] = new customerData(id, name, date, amount);
                idx++;
            } else if (input == 2) {
                System.out.println("1.View All\n2. View by Purchased Amount in a Year\n3.View by Name");
                int inpInView = inp.nextInt();
                if (inpInView == 1) {
                    for (customerData data : arrayOfCustomerData) {
                        System.out.println(data);
                    }
                } else if (inpInView == 2) {
                    for (customerData d : arrayOfCustomerData) {
                        System.out.print("Enter year : ");
                        int year = inp.nextInt();
                        if (year == d.purchaseDate) {
                            System.out.println(d);
                        }
                    }
                }else if(inpInView == 3){
                    System.out.print("Enter a name to get details : ");
                    String nm = inp.next();
                    for (customerData data : arrayOfCustomerData) {
                        if(data.customerName == nm){
                            System.out.println(data);
                        }
                    }
                }
            }

            System.out.println("Do you want to continue ? (y/n)");
            chr = inp.next().charAt(0);
        } while (chr == 'y' || chr == 'Y');
        inp.close();
    }
}
