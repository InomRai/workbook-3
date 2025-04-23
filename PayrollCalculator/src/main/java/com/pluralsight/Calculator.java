package com.pluralsight;

import java.io.*;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        String fileName = "src/main/resources/employees.csv";
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the name of your employee file: ");
        String payrollFile = scanner.nextLine();
        System.out.print("Enter the name of the file you want to create: ");
        String saveFileName = scanner.nextLine();



        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/" + payrollFile));
            String line;
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/" + saveFileName));
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;


                String[] input = line.split("\\|");

                if (input.length < 4) {
                    System.out.println("Skipping invalid line: " + line);
                    continue;
                }

                int id = Integer.parseInt(input[0].trim());
                    String name = input[1].trim();
                    Double hoursWorked = Double.parseDouble(input[2].trim());
                    Double payRate = Double.parseDouble(input[3].trim());


                    Employee emp = new Employee(id, name, hoursWorked, payRate);
                    double grossPay = emp.getGrossPay();
                    System.out.printf("ID: %d | Name: %s | Gross Pay: $%.2f%n", emp.getEmployeeID(), emp.getName(), emp.getGrossPay());



                writer.write(String.format("%d|%s|%.2f", id, name, grossPay));
                writer.newLine();



                }



        reader.close();
        writer.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       }



}