/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.util.ArrayList;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Deposit;
import database.mysqlconnector;
/**
 *
 * @author Aayush Subedi
 */
public class Userdao {
     mysqlconnector mysql = new mysqlconnector();

       public ArrayList<Deposit> getAllUserData(){
        Connection conn = mysql.openConnection();
        ArrayList<Deposit> data = new ArrayList();
        String sqlQuery = "SELECT * FROM details";
        try (PreparedStatement pstmt = conn.prepareStatement(sqlQuery))  {
            ResultSet result = pstmt.executeQuery();
            while(result.next()){
                Deposit user  = new Deposit(
                    result.getString("Amount"),
                    result.getString("Date_of_withdrawl"),
                    result.getString("Date_of_Deposit"),
                    result.getString("method")
                );
                user.setAmount(result.getString("Amount"));

                data.add(user);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
//            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            mysql.closeConnection(conn);
        }
        return data;
    }

    private static class mysql {

        private static void closeConnection(Connection conn) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static Connection openConnection() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public mysql() {
        }
    }
    
    
}
