package com.great.Sachin;

import java.util.ArrayList;

public class MobilePhone {

    ArrayList<Contacts> contacts = new ArrayList<>();


    public void store(Contacts contact){
        //int value = contacts.indexOf(contact);
        contacts.add(contact);
    }

    public int searchContacts(String name) {
        for(int i=0;i<contacts.size();i++){
            Contacts contact = contacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;

    }
    public int searchContacts2(Contacts contact){
        int value = contacts.indexOf(contact);
        if(findContacts(contact)>=0){
            System.out.println("The phone number of the contact is : " + contacts.get(value));
            return 1;
        }
        else return -1;
    }

    public void contactlist(){
        int size = contacts.size();
        for(int i = 0;i<size;i++){
            System.out.println("Name : "+ contacts.get(i).name + "\t" +
                    "Mobile Number : "+ contacts.get(i).mobileNumber);
        }
    }

    public void editContacts(Contacts oldContact,Contacts contact){
        //contacts.get(contacts.indexOf(oldContact)).mobileNumber;
        if(findContacts(oldContact)>=0){
            editContacts(findContacts(oldContact),contact);
        }
    }

    public void removeContacts(String contact){

        removeContacts(searchContacts(contact));

    }

    private void removeContacts(int position){
        contacts.remove(position);
    }

    private void editContacts(int position, Contacts number){
        contacts.set(position,number);

    }
    public int findContacts(Contacts contact){
        return contacts.indexOf(contact);
    }

    public Contacts findContacts(String name) {
        int position = searchContacts(name);
        if(position>=0){
            return contacts.get(position);
        }
        else return null;
    }

}
