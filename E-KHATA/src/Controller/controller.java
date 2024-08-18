/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Dao.Userdao;
import Model.Deposit;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author Aayush Subedi
 */
public class controller {
    void makeUserTable() {
        System.out.println("Making table");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Amount");
        model.addColumn("Name");
        model.addColumn("Method");
        ArrayList<Deposit> data = new Userdao().getAllUserData();
        for (Deposit user : data) {
            model.addRow(new Object[]{user.getId(), user.getAmount(), user.getName(), user.getMethod()});
        }
    }
}
