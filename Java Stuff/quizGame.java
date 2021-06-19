package com.company;

import java.util.Scanner;


public class quizGame {
    public static void main(String args[]){
        int choice, total_num = 0;
        Scanner scan = new Scanner(System.in);
        int subjectName;
        System.out.println("Enter you domain. " +
                "\n 1. Science " +
                "\n 2. Geography " +
                "\n 3. History: ");
        subjectName = scan.nextInt();
        if (subjectName == 1 ) {
            System.out.println(":You Selected Science:");
            System.out.println("Question Number 1" +
                    "\nOil, natural gas and coal are examples of" +
                    "\n 1. Fossil Fuels" +
                    "\n 2. Bio Fuels" +
                    "\n 3. Renewable Resources" +
                    "\n 4. Geothermal resources");
            choice = scan.nextInt();
            if (choice == 1)
                total_num = total_num + 5;
            else
                total_num = total_num - 2;

            System.out.println("Question Number 2" +
                    "\nWhat is the main cause of seasons on the Earth?" +
                    "\n 1. The distance between the Earth and the sun" +
                    "\n 2. Changes in the amount of energy coming from the sun" +
                    "\n 3. The tilt of the Earth's axis in relation to the sun" +
                    "\n 4. The speed that the Earth rotates around the sun");
            choice = scan.nextInt();
            if (choice == 3)
                total_num = total_num + 5;
            else
                total_num = total_num - 2;
            System.out.println("Question Number 3" +
                    "\nWhen large areas of forest are removed so land can be converted for other uses, such as farming, which of the following occurs?" +
                    "\n 1. Decreased carbon dioxide" +
                    "\n 2. Increased erosion" +
                    "\n 3. Greater oxygen production" +
                    "\n 4. Colder temperature");
            choice = scan.nextInt();
            if (choice == 2)
                total_num = total_num + 5;
            else
                total_num = total_num - 2;
            System.out.println("Question Number 4" +
                    "\nA car travels at a constant speed of 40 miles per hour. How far does the car travel in 45 minutes?" +
                    "\n 1. 25 miles" +
                    "\n 2. 30 miles" +
                    "\n 3. 35 miles" +
                    "\n 4. 40 miles");
            choice = scan.nextInt();
            if (choice == 2)
                total_num = total_num + 5;
            else
                total_num = total_num - 2;
            System.out.println("Question Number 5" +
                    "\nA magnifying glass is what type of lens?" +
                    "\n 1. Convex lens" +
                    "\n 2. Concave lens" +
                    "\n 3. Microscopic lens" +
                    "\n 4. Simple glass");
            if (choice == 2)
                total_num = total_num + 5;
            else
                total_num = total_num - 2;
            System.out.println("You got " + total_num + " out of 25");

        }
        else if (subjectName == 2) {
            System.out.println(":You Selected Geography:");
            System.out.println("Question Number 1" +
                    "\nWhat is the capital of Pakistan?" +
                    "\n 1. Karachi" +
                    "\n 2. Islamabad" +
                    "\n 3. Lahore" +
                    "\n 4. Peshawer");
            choice = scan.nextInt();
            if (choice == 2)
                total_num = total_num + 5;
            else
                total_num = total_num - 2;
            System.out.println("Question Number 2" +
                    "\n Where is Pakistan located?" +
                    "\n 1. Northeast Asia" +
                    "\n 2. Southern Asia" +
                    "\n 3. Central Asia" +
                    "\n 4. Southeast Asia");
            choice = scan.nextInt();
            if (choice == 2)
                total_num = total_num + 5;
            else
                total_num = total_num - 2;
            System.out.println("Question Number 3" +
                    "\nWhat percentage of the population of Pakistan lives in towns or cities?" +
                    "\n 1. 88%" +
                    "\n 2. 52%" +
                    "\n 3. 36%" +
                    "\n 4. 21%");
            choice = scan.nextInt();
            if (choice == 3)
                total_num = total_num + 5;
            else
                total_num = total_num - 2;
            System.out.println("Question Number 4" +
                    "\nHow big is Pakistan?" +
                    "\n 1. Twice the size of Texas" +
                    "\n 2. A little bigger than Delaware" +
                    "\n 3. Slightly smaller than Nevada" +
                    "\n 4. Somewhat less than twice the size of California");
            choice = scan.nextInt();
            if (choice == 4)
                total_num = total_num + 5;
            else
                total_num = total_num - 2;
            System.out.println("Question Number 5" +
                    "\nWhat are the countries that border Pakistan?" +
                    "\n 1. Afghanistan, China, Turkmenistan, and India" +
                    "\n 2. China, India, Iran, and Afghanistan" +
                    "\n 3. India, Turkmenistan, Iran, and Afghanistan" +
                    "\n 4. Iran, Afghanistan, Turkmenistan, and China");
            choice = scan.nextInt();
            if (choice == 2)
                total_num = total_num + 5;
            else
                total_num = total_num - 2;
            System.out.println("You got " + total_num + " out of 25");
        }
        else if (subjectName == 3 ) {
                System.out.println(":You Selected History:");
                System.out.println("Question Number 1" +
                        "\nWorld War I began in which year?" +
                        "\n 1. 1923" +
                        "\n 2. 1938" +
                        "\n 3. 1917" +
                        "\n 4. 1914");
                choice = scan.nextInt();
                if (choice == 4)
                    total_num = total_num + 5;
                else
                    total_num = total_num - 2;

                System.out.println("Question Number 2" +
                        "\nAdolf Hitler was born in which country?" +
                        "\n 1. Germany" +
                        "\n 2. France" +
                        "\n 3. Austria" +
                        "\n 4. Poland");
                choice = scan.nextInt();
                if (choice == '3')
                    total_num = total_num + 5;
                else
                    total_num = total_num - 2;
                System.out.println("Question Number 3" +
                        "\nWho was the first Western explorer to reach China?" +
                        "\n 1. Magellan" +
                        "\n 2. Cook" +
                        "\n 3. Marco Polo" +
                        "\n 4. Sir Francis Drake");
                choice = scan.nextInt();
                if (choice == '3')
                    total_num = total_num + 5;
                else
                    total_num = total_num - 2;
                System.out.println("Question Number 4" +
                        "\nWhat is the date of independence of Pakistan" +
                        "\n 1. 14th aug 1945" +
                        "\n 2. 14th aug 1941" +
                        "\n 3. 14th aug 1947" +
                        "\n 4. 14th aug 1946");
                choice = scan.nextInt();
                if (choice == '3')
                    total_num = total_num + 5;
                else
                    total_num = total_num - 2;
                System.out.println("Question Number 5" +
                        "\nHow many republics made up the former Soviet Union?" +
                        "\n 1. 10" +
                        "\n 2. 20" +
                        "\n 3. 12" +
                        "\n 4. 15");
                choice = scan.nextInt();
                if (choice == '4')
                    total_num = total_num + 5;
                else
                    total_num = total_num - 2;
                System.out.println("You got " + total_num + " out of 25");





        }

    }
}