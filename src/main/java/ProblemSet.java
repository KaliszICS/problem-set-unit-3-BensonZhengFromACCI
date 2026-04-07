		/**

        * File: Problem Set 3

        * Author: Benson

        * Date Created: April 2, 2026

        * Date Last Modified: April 2, 2026

        */

import java.util.Scanner;

public class ProblemSet {

    public static void main(String args[]) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an email address: ");
        String initialInput = input.nextLine();

        if (initialInput.contains("@")) {

            if (initialInput.indexOf("@") == initialInput.lastIndexOf("@")) {
                int splitIndex = initialInput.indexOf("@");
                String local = initialInput.substring(0, splitIndex);
                if (!local.startsWith(".") && !local.endsWith(".") &&
                    !local.startsWith("_") && !local.endsWith("_") &&
                    !local.startsWith("+") && !local.endsWith("+")) {

                    if (!initialInput.contains(" ")) {

                     

                        if ((local.length() > 0 && local.length() < 65)) {

                            String mailAndDomain = initialInput.substring(splitIndex + 1);
                            int dotFinder = mailAndDomain.lastIndexOf(".");

                            if (dotFinder != -1 && dotFinder != 0 && dotFinder != (mailAndDomain.length() - 1)) {

                                if (!mailAndDomain.contains("+") && !mailAndDomain.contains("_")) {

                                    String domain = mailAndDomain.substring(dotFinder + 1);

                                    if (domain.length() > 1 && domain.length() < 7) {
                                        if (initialInput.substring(splitIndex).toLowerCase().equals("@gmail.com") && local.contains(".")) {
                                            System.out.println("Valid (Gmail normalized)");
                                        } 
                                        else {
                                            System.out.println("Valid");
                                        }
                                    }
                                    else {
                                        System.out.println("Invalid: [Invalid domain extension length]");
                                    }

                                }
                                else {
                                    System.out.println("Invalid: [+ or _ not allowed in domain]");
                                }

                            }
                            else {
                                System.out.println("Invalid: [No dot in domain or invalid dot position]");
                            }

                        }
                        else {
                            System.out.println("Invalid: [Local part too short or too long]");
                        }

                    }
                    else {
                        System.out.println("Invalid: [Contains spaces]");
                    }

                }
                else {
                    System.out.println("Invalid: [Starts or ends with dot, plus, or underscore.]");
                }

            }
            else {
                System.out.println("Invalid: [Multiple @]");
            }

        }
        else {
            System.out.println("Invalid: [Missing @]");
        }
    }
}