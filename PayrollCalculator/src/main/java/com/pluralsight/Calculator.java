package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;


public class Calculator {
    public static void main(String[] args) {
        String fileName = "src/main/resources/employees.csv";


        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;


                String[] input = line.split("\\|");

                if (input.length < 4) {
                    System.out.println("Skipping invalid line: " + line);
                    continue;


                    int id = Integer.parseInt(input[0].trim());
                    String name = input[1].trim();
                    Double hoursWorked = Double.parseDouble(input[2].trim());
                    Double payRate = Double.parseDouble(input[3].trim());


                    Employee emp = new Employee(id, name, hoursWorked, payRate);
                    System.out.printf("ID: %d | Name: %s | Gross Pay: $%.2f%n", emp.getEmployeeID(), emp.getName(), emp.getGrossPay());


                }
            }


        reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       }



}