/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import Modelos.Recibos;
import java.sql.*;

/**
 *
 * @author Toshiba
 */
public class DAL {
    
    Connection cn;
    
    public DAL(){
    this.conectar();
    }
        
    protected Connection conectar(){
    
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            cn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP;"
                    + "databaseName=ProjectResidencial;integratedSecurity=true;");
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
        return cn;
    }   
    
    
   /* public int InsertarRecibos(String Nombre) throws SQLException{
        
        CallableStatement callStatement = null;
        callStatement = this.cn.prepareCall("{call sp_InsertarPago(?)}");
        callStatement.setString(1, Nombre);

        //callStatement.executeQuery();
        
        ResultSet rs = callStatement.executeQuery();
        int id = 0;
        if(rs.next()) {
    
            id = rs.getInt("Id");
    //System.out.println("Equipment ID: " + rs.getString("equipmentID"));
    }
    
        return id;
    }*/
    
}
