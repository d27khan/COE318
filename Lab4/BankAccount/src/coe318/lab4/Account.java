/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author Daniel Khan (500898010)
 */
public class Account {
    //Instance Variables
    
    int num;
    double inBal;
    String name1;
    
           
    public Account (String name, int number, double initialBalance){
        name1 =name;
        num = number;
        inBal = initialBalance;
        
    }
    
    public Account(Account account){
        name1 = account.getName();
        inBal = account.getBalance();
        num = account.getNumber();
        
    }
    
    public String getName(){
       
        
        return name1;
        
    }
    
    public double getBalance(){
       
        return inBal;
        
    }
    
    public int getNumber(){
         
        return num;
        
    }
    
    public boolean deposit(double amount){
        if(amount > 0){
            inBal += amount;
            return true;
        }
        
        return false;
           
    }
    
    public boolean withdraw( double amount){
        if(amount > 0 && amount < inBal){
            inBal -= amount;
            return true;
            
        }
        return false;
    }
    
    
    
    @Override
    public String toString() {//DO NOT MODIFY
            return "(" + getName() + ", " + getNumber() + ", " +
                    String.format("$%.2f", getBalance()) + ")";
    }
    
    
    
    
    
}
