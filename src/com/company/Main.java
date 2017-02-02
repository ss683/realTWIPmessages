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
            MessageList STORED = new MessageList(message, size);
            String [] StoredArray1 = new String[1000];
            String [] StoredArray2 = new String[1000];
            String [] StoredArray3 = new String[1000];
            String [] StoredArray4 = new String[1000];
            String [] StoredArray5 = new String[1000];
            String [] ReplicaArray1 = new String[1000];
            String [] ReplicaArray2 = new String[1000];
            String [] ReplicaArray3 = new String[1000];
            String [] ReplicaArray4 = new String[1000];
            String [] ReplicaArray5 = new String[1000];



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
                    System.out.println("This conversation was stored.");
                    if (totalCount == 1) {
                        StoredArray1 = STORED.getMessageList();
                        System.out.println("Do you want to move around conversations?");
                        String maybe2 = input.nextLine();
                        if (maybe2.equalsIgnoreCase("yes")) {
                            System.out.println("These are the current convos: " + "\n" + "Convo 1: " + StoredArray1);
                            System.out.println("What do you want to move...specify the Array (Convo1 or Convo2 or Convo3 etc.) and the message (furthest back would be 1 and the most recent would be it's number in the convo...so if there are 3 messages, furthest back would be 0 and most recent is 3)");

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
                    else if (totalCount == 2) {
                        ReplicaArray1 = StoredArray1;
                        StoredArray2 = STORED.getMessageList();
                        System.out.println("Do you want to move around conversations?");
                        String maybe2 = input.nextLine();
                        if (maybe2.equalsIgnoreCase("yes")) {
                            System.out.println("These are the current convos: " + "\n" + "Convo 1: " + ReplicaArray1 + "\n" + "Convo 2: " + StoredArray2);
                            System.out.println("What do you want to move...specify the Array (Convo1 or Convo2 or Convo3 etc.) and the message (furthest back would be 1 and the most recent would be it's number in the convo...so if there are 3 messages, furthest back would be 0 and most recent is 3)");

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
                    else if (totalCount == 3) {
                        ReplicaArray1 = StoredArray1;
                        ReplicaArray2 = StoredArray2;
                        StoredArray3 = STORED.getMessageList();
                        System.out.println("Do you want to move around conversations?");
                        String maybe2 = input.nextLine();
                        if (maybe2.equalsIgnoreCase("yes")) {
                            System.out.println("These are the current convos: " + "\n" + "Convo 1: " + ReplicaArray1 + "\n" + "Convo 2: " + ReplicaArray2 + "\n" + "Convo 3: " + StoredArray3);
                            System.out.println("What do you want to move...specify the Array (Convo1 or Convo2 or Convo3 etc.) and the message (furthest back would be 1 and the most recent would be it's number in the convo...so if there are 3 messages, furthest back would be 0 and most recent is 3)");

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
                    else if (totalCount == 4) {
                        ReplicaArray1 = StoredArray1;
                        ReplicaArray2 = StoredArray2;
                        ReplicaArray3 = StoredArray3;
                        StoredArray4 = STORED.getMessageList();
                        System.out.println("Do you want to move around conversations?");
                        String maybe2 = input.nextLine();
                        if (maybe2.equalsIgnoreCase("yes")) {
                            System.out.println("These are the current convos: " + "\n" + "Convo 1: " + ReplicaArray1 + "\n" + "Convo 2: " + ReplicaArray2 + "\n" + "Convo 3: " + ReplicaArray3 + "\n" + "Convo 4: " + StoredArray4);
                            System.out.println("What do you want to move...specify the Array (Convo1 or Convo2 or Convo3 etc.) and the message (furthest back would be 1 and the most recent would be it's number in the convo...so if there are 3 messages, furthest back would be 0 and most recent is 3)");

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
                    else if (totalCount == 5) {
                        ReplicaArray1 = StoredArray1;
                        ReplicaArray2 = StoredArray2;
                        ReplicaArray3 = StoredArray3;
                        ReplicaArray4 = StoredArray4;
                        StoredArray5 = STORED.getMessageList();
                        System.out.println("Do you want to move around conversations?");
                        String maybe2 = input.nextLine();
                        if (maybe2.equalsIgnoreCase("yes")) {
                            System.out.println("These are the current convos: " + "\n" + "Convo 1: " + ReplicaArray1 + "\n" + "Convo 2: " + ReplicaArray2 + "\n" + "Convo 3: " + ReplicaArray3 + "\n" + "Convo 4: " + ReplicaArray4 + "Convo 5: " + StoredArray5);
                            System.out.println("What do you want to move...specify the Array (Convo1 or Convo2 or Convo3 etc.) and the message (furthest back would be 1 and the most recent would be it's number in the convo...so if there are 3 messages, furthest back would be 0 and most recent is 3)");

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
                        System.out.println("You have too many stored conversations!");
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
                    System.out.println("Type anything else to continue this conversation");

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
