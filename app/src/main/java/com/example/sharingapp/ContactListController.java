package com.example.sharingapp;

import android.content.Context;

import java.util.ArrayList;

public class ContactListController {
    private ContactList contact_list;

    public ContactListController(ContactList contactList) {
        this.contact_list = contactList;
    }
    public ContactList getContactList(){
        return  contact_list;
    }
    public void addObserver(Observer observer){
        contact_list.addObserver(observer);
    }
    public void removeObserver(Observer observer){
        contact_list.removeObserver(observer);
    }
    public Contact getContactByUsername(String username) {
        return contact_list.getContactByUsername(username);
    }

    public void setContacts(ArrayList<Contact> contact_list){
        this.contact_list.setContacts(contact_list);
    }
    public ArrayList<Contact> getContacts(){
        return this.contact_list.getContacts();
    }
    public ArrayList<String> getAllUsernames(){
        return this.contact_list.getAllUsernames();
    }
    public void addContact(Contact contact){
        this.contact_list.addContact(contact);
    }
    public void deleteContact(Contact contact) {
        this.contact_list.deleteContact(contact);
    }
    public Contact getContact(int index){
        return this.contact_list.getContact(index);
    }
    public int getSize(){
        return this.contact_list.getSize();
    }
    public Contact getUserByUsername(String username){
        return this.contact_list.getUserByUsername(username);
    }
    public boolean hasContact(Contact contact){
        return this.contact_list.hasContact(contact);
    }
    public int getIndex(Contact contact){
        return this.contact_list.getIndex(contact);
    }
    public boolean isUsernameAvailable(String username){
        return this.isUsernameAvailable(username);
    }
    public void loadContacts(Context context){
        this.contact_list.loadContacts(context);
    }
    public boolean saveContacts(Context context){
        return this.contact_list.saveContacts(context);
    }
    public boolean addContact(Contact contact, Context context){
        AddContactCommand addContactCommand = new AddContactCommand(this.contact_list, contact, context);
        addContactCommand.execute();
        return addContactCommand.isExecuted();
    }
    public boolean deleteContact(Contact contact, Context context){
        DeleteContactCommand deleteContactCommand = new DeleteContactCommand(contact_list,contact, context);
        deleteContactCommand.execute();
        return  deleteContactCommand.isExecuted();
    }
    public boolean editContact(Contact old_contact,Contact new_contact, Context context){
        EditContactCommand editContactCommand = new EditContactCommand(contact_list, old_contact, new_contact, context);
        editContactCommand.execute();
        return  editContactCommand.isExecuted();
    }








}
