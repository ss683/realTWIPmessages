package com.company;
import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        int totalCount = 0;
        while (true) {
            String message = "";
            Scanner input = new Scanner(System.in);
            String printedPhoneNumber = "";
            String otherPrintedPhoneNumber = "";
            String Third = "";
            String end = "";
            int size = 0;
            String FINALMESSAGELIST = "";
            StringBuilder list = new StringBuilder();
            System.out.println("What is your phone number? (e.g. 6106872345)");
            String phoneNumber = input.nextLine();
            if (phoneNumber.length() != 10) {
                System.out.println("Invalid phone number. (Invalid length.)");
                System.exit(1);
            } else {
                try {
                    int areaCode = Integer.parseInt(phoneNumber.substring(0, 3));
                    int midNumber = Integer.parseInt(phoneNumber.substring(3, 6));
                    int lastNumber = Integer.parseInt(phoneNumber.substring(6, 10));
                    printedPhoneNumber = "(" + areaCode + ")-" + midNumber + "-" + lastNumber;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid phone number. (Did not use only numbers)");
                    throw e;
                }

            }
            System.out.println("What is the phone number of the receiver? (e.g. 2159993092)");
            String otherPhoneNumber = input.nextLine();
            if (otherPhoneNumber.length() != 10) {
                System.out.println("Invalid phone number. (Invalid length.)");
                System.exit(1);
            } else {
                try {
                    int areaCode = Integer.parseInt(otherPhoneNumber.substring(0, 3));
                    int midNumber = Integer.parseInt(otherPhoneNumber.substring(3, 6));
                    int lastNumber = Integer.parseInt(otherPhoneNumber.substring(6, 10));
                    otherPrintedPhoneNumber = "(" + areaCode + ")-" + midNumber + "-" + lastNumber;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid phone number. (Did not use only numbers)");
                    throw e;
                }

            }
            System.out.println("Start Messaging...to indicate it's the other person's turn, type \"DONE\", to see the message list type \"LIST\" and to terminate type \"END\".");
            while (!message.equals("END")) {
                message = input.nextLine();
                Date d = new Date();
                if (message.equals("END")) {
                    System.out.println("Ending Conversation...");
                    MessageList STORED = new MessageList(message, size);
                    String[] StoredArray = STORED.getMessageList();
                    System.out.println("This conversation was stored.");
                    if (totalCount > 0) {
                        System.out.println("Do you want to move around conversations?");
                        String maybe2 = input.nextLine();
                        if (maybe2.equalsIgnoreCase("yes")) {
                            System.out.println("These are the current convos: " + StoredArray);

                        } else if (maybe2.equalsIgnoreCase("no")) {
                            System.out.println("Another conversation?");
                            String maybe = input.nextLine();
                            if (maybe.equalsIgnoreCase("yes")) {
                                totalCount++;
                                break;
                            } else if (maybe.equalsIgnoreCase("no"))
                                System.exit(0);
                            else {
                                System.out.println("Shutting down.");
                                System.exit(0);
                            }
                        }
                    }
                    else {
                        System.out.println("Another conversation?");
                        String maybe = input.nextLine();
                        if (maybe.equalsIgnoreCase("yes")) {
                            totalCount++;
                            break;
                        } else if (maybe.equalsIgnoreCase("no"))
                            System.exit(0);
                        else {
                            System.out.println("Shutting down.");
                            System.exit(0);
                        }
                    }
                }
                else if (message.equals("DONE")) {
                        System.out.println("Other person's turn to speak...");
                        Third = printedPhoneNumber;
                        printedPhoneNumber = otherPrintedPhoneNumber;
                        otherPrintedPhoneNumber = Third;

                    } else if (message.equals("LIST")) {
                        System.out.println("Messages between " + printedPhoneNumber + " and " + otherPrintedPhoneNumber);
                        System.out.println(FINALMESSAGELIST);

                    } else {
                        System.out.println(printedPhoneNumber + " says: " + message);
                        size++;
                        Messages newMessage = new Messages(printedPhoneNumber, otherPrintedPhoneNumber, message, d);
                        String[] FINALMESSAGELISTARRAY = newMessage.MessageMaker();
                        for (int i = 0; i < FINALMESSAGELISTARRAY.length; i++) {
                            list.append("\n" + FINALMESSAGELISTARRAY[i]);
                        }
                        FINALMESSAGELIST = list.toString();
                    }

                }
            }
        }
}
