package com.example.sharingapp;

public class ContactController {
    private Contact contact;

    public ContactController(Contact contact) {
        this.contact = contact;
    }
    public void setId(){
        this.contact.setId();
    }
    public String getId(){
        return this.contact.getId();
    }
    public void UpdateId(String id){
        this.contact.updateId(id);
    }
    public String getUsername(){
        return this.contact.getUsername();
    }
    public String getEmail(){
        return this.contact.getEmail();
    }

    public Contact getContact() {
        return contact;
    }
    public void addObserver(Observer observer){
        this.contact.addObserver(observer);
    }
    public void removeObserver(Observer observer){
        this.contact.removeObserver(observer);
    }
}
