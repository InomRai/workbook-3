package com.pluralsight;

import java.util.Scanner;

public class Quotes {
    public static void main(String[] args) {

        boolean run = true;
        while(run) {
            try {

                Scanner scanner = new Scanner(System.in);

                String[] quotes = {"The best preparation for tomorrow is doing your best today.", "Perfection is not attainable, but if we chase perfection we can catch excellence.", "Believe you can and you're halfway there.", "Find joy in everything you choose to do.", "Find joy in everything you choose to do.", "A good laugh is sunshine in the house.", "Every moment is a fresh beginning.", "People aren’t against you; they are for themselves.", "Climb mountains not so the world can see you, but so you can see the world.", "Everything you’ve ever wanted is on the other side of fear."};

                System.out.print("Please select number 0-9: ");
                int index = scanner.nextInt();

                System.out.println(quotes[index]);
                run = false;


            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        }



    }


}
