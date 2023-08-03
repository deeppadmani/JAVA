package com.example;

import java.util.ArrayList;

public class Client
{
    private int Id;
    private String Name;
    private String PhoneNo;
    private ArrayList<Account> Accounts;

    public Client(int Id,String Name,String PhoneNo){
        this.Id = Id;
        this.Name = Name;
        this.PhoneNo = PhoneNo;

        Accounts = new ArrayList<>();
    }

    public boolean addAccount(Account account)
    {
        Accounts.add(account);
        return true;
    }
    public boolean removeAccount(int accountId)
    {
        for(Account account : Accounts)
            if (account.getId() == accountId){
                Accounts.remove(account);
                        return true;
            }
        return false;
    }

    public String toString()
    {
        String str = this.Id +" " + this.Name + " " +this.PhoneNo + "\n";

        for(Account account: Accounts)
            str += account.toString() + "\n" ;

        return str;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }
}
