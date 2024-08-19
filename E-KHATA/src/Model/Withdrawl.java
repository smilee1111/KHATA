/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dell
 */
public class Withdrawl {
    private int Id;
    private String Amount;
    private String Name;
    private String Method;
  
    public Withdrawl(int id, String amount, String name, String method){
        this.Id = id;
        this.Amount = amount;
        this.Name = name;
        this.Method = method;
        
       
    }
    public int getId() {
        return Id;
    }
public void setId(int Id) {
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
    }
}
