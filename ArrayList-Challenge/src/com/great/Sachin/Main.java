package com.great.Sachin;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        MobilePhone phone= new MobilePhone();
        Contacts contact =new Contacts("Sam");
        boolean quit=false;
        instruction();
        while(!quit){
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 0:
                    instruction();
                case 1:
                    System.out.println("Enter the name and number to be added");
                    String name = sc.nextLine();
                    Long number = sc.nextLong();
                    Contacts contact1=contact.createContact(name,number);
                    phone.store(contact1);
                    break;

                case 2:
                    System.out.println("Enter the name of the contact to be modified");
                    String editName = sc.nextLine();
                    Contacts oldContact = phone.findContacts(editName);

                    System.out.println("Item found \n " +
                            "Enter the name and number to be modified");
                    String newName = sc.nextLine();
                    Long newNumber = sc.nextLong();
                    Contacts newContact=contact.createContact(newName,newNumber);
                    phone.editContacts(oldContact,newContact);
                    break;

                case 3:
                    System.out.println("Enter the name of the contact to be removed");
                    String remove = sc.nextLine();
                    phone.removeContacts(remove);
                    break;

                case 4:
                    System.out.println("Enter the contact to see availablity");
                    String available = sc.nextLine();
                    Contacts contactFound = phone.findContacts(available);
                     System.out.println("Mobile Number : "+contactFound.mobileNumber +
                             "Name of recipient : "+ contactFound.name);
                    break;

                case 5:
                    System.out.println("Contact list follows : ");
                    phone.contactlist();
                    break;

                case 6:
                    System.out.println("Exiting the application");
                    quit=true;
                    break;

                    default:
                        System.out.println("Enter a valid input");
            }
        }


    }
    public static void instruction(){
        System.out.println("Type the following : \n"+
                "0 : Enter to see instruction\n"+
                "1 : Enter to input new Contact\n"+
                "2 : Enter to modify contact\n"+
                "3 : Enter to delete contact\n" +
                "4 : Enter to see available contact\n"+
                "5 : Enter to see the contact list\n" +
                "6 : Enter to exit the application");
    }
}
