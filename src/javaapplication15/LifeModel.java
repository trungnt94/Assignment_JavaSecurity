/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class LifeModel {
    
    public static void main(String[] args) throws SQLException {
        insertInfo();
        Delete();
    }
    
    public static void insertInfo() throws SQLException {        
            String insert = "INSERT INTO life VALUES (1,'hung','feeling good'),(2,'ngoc','feeling bad')";            
            Connection connect = DAO.getConnection();
            Statement stt = connect.createStatement();
            stt.execute(insert);
        }
    
    public static void Delete() throws SQLException{        
                String delete = "DELETE FROM life WHERE Status = 'feeling bad'";
                String insert = "INSERT INTO life VALUE (2,'ngoc','everything is good')";
                Connection connect = DAO.getConnection();
                Statement stt = connect.createStatement();
                stt.execute(delete); 
                stt.execute(insert);
    }
}

