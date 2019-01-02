package com.great.Sachin;

public class Contacts extends MobilePhone{
    public String name;
    public Long mobileNumber;

    public Contacts(String name, Long mobileNumber) {

        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public Contacts(String name){
        this.name= name;
    }

    public Contacts(Long mobileNumber)
    {
        this.mobileNumber=mobileNumber;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Contacts createContact(String name,Long mobileNumber){
        return new Contacts(name,mobileNumber);
    }
}
