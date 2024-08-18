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
    private String Id;
    private String Amount;
    private String Name;
    private String Method;
  
    public Deposit(String Amount, String Date_of_withdrawal, String Date_of_Deposit, String method){
        this.Id = Amount;
        this.Amount = Date_of_withdrawal;
        this.Name = Date_of_Deposit;
        this.Method = method;
        
       
    }
    public String getId() {
        return Id;
    }
public void setId(String Id) {
        this.Id= Id;
    }

public String getAmount() {
        return Amount;
    }
public void setDAmount(String Amount) {
        this.Amount = Amount;
    }

public String getName() {
        return Name;
    }
public void setName(String Name) {
        this.Name = Name;
    }

public String getMethod() {
        return Method;
    }
public void setMethod(String Method) {
        this.Method = Method;
    }}