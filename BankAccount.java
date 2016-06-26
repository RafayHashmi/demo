package com.company;

import java.util.Scanner;

/**
 * Created by 192.168.3.22 on 6/26/2016.
 */
public class BankAccount {
    public String Name = "None";
    public String Pin = "0000";
    public boolean Login = false;
    //use Array List to save Accounts
    public double Balance = 0.0;
    Scanner inp = new Scanner(System.in);


    BankAccount()
    {
        System.out.println("Welcome to ATM");
        showmenu();
    }

    public void login() {
        if(Login != true) {
            System.out.println("Enter Name : ");
            Name = inp.nextLine();
            System.out.println("Enter PIN : ");
            Pin = inp.nextLine();

            if (Name == "None" && Pin == "0000") {
                System.out.println("Login Successful");
                Login = true;
                showmenu();
            } else {
                System.out.println("Login Failed");
                showmenu();
            }
        }else{
            System.out.println("Already Logged In");
            showmenu();
        }
    }


    public void display(){
        if(Login != false) {
            System.out.println("User Name = " + Name);
            System.out.println("User Balance = " + Balance);
            showmenu();
        }else{
        System.out.println("Kindly Login First");
        showmenu();
        }

    }

    public void withdraw(){
        if(Login != false) {
            System.out.println("Enter Withdraw Amount : ");
            double wamount = inp.nextFloat();
            Balance = Balance  - wamount;
            display();
            showmenu();
        }else{
            System.out.println("Kindly Login First");
            showmenu();
        }

    }

    public void deposit(){
        if(Login != false) {
            System.out.println("Enter Deposit Amount : ");
            double damount = inp.nextFloat();
            Balance = Balance +  damount;
            display();
            showmenu();
        }else{
            System.out.println("Kindly Login First");
            showmenu();
        }

    }

    public void showmenu(){

        System.out.println("Enter \n 0) LOGIN \n 1) DISPLAY \n 2) WITHDRAW \n 3) DEPOSIT \n E) EXIT");

        switch(inp.nextLine())
        {
            case "0":
            {
                login();
            }

            case "1":
            {
                display();
            }
            case "2":
            {
                withdraw();
            }
            case "3":
            {
                deposit();
            }
            case "E" :
            {
                System.out.println("Thank You");
            }
            default:
            {
                System.out.println("Invalid Entry");
                showmenu();
            }

        }
    }



}
