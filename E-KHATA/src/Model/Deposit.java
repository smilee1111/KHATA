/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Aayush Subedi
 */
public class Deposit {
    private String Amount;
    private String Date_of_withdrawal;
    private String Date_of_Deposit;
    private String method;
  
    public Deposit(String Amount, String Date_of_withdrawal, String Date_of_Deposit, String method){
        this.Amount = Amount;
        this.Date_of_withdrawal = Date_of_withdrawal;
        this.Date_of_Deposit = Date_of_Deposit;
        this.method = method;
        
       
    }
    public String getAmount() {
        return Amount;
    }
public void setAmount(String Amount) {
        this.Amount = Amount;
    }

public String getDate_of_withdrawl() {
        return Date_of_withdrawal;
    }
public void setDate_of_withdrawal(String Date_of_withdrawal) {
        this.Date_of_withdrawal = Date_of_withdrawal;
    }

public String getDate_of_Deposit() {
        return Date_of_Deposit;
    }
public void setDate_of_Deposit(String Date_of_Deposit) {
        this.Date_of_Deposit = Date_of_Deposit;
    }

public String getmethod() {
        return method;
    }
public void setmethod(String method) {
        this.method = method;
    }

    public Object getDate_of_withdrawal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
