/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Modelos.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Toshiba
 */
public class DALRoles extends DAL{
    
    public DALRoles(){
    
        super();
    }
    
    //LISTA PARA OBTENER ROLES DE LA BD
    public List<Roles> getRoles() throws SQLException{
        
        
            List<Roles> listaRoles = new LinkedList<Roles>();
            
            try {
                
                String sql = "SELECT * FROM vw_Roles";
                PreparedStatement cmd = cn.prepareStatement(sql);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    Roles roles= 
                            new Roles(rs.getInt("IdRol")
                                    ,rs.getString("TipoRol"));
                                       
            
             listaRoles.add(roles);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaRoles;
     }
    
    
    //LISTA PARA OBTENER UN ROL EN ESPECIFICO
    public List<Roles> getRoles(int Id) throws SQLException{
        
        
            List<Roles> listaRoles = new LinkedList<Roles>();
            
            try {
                
                String sql = "SELECT * FROM vw_Roles WHERE IdRol = ?";
                PreparedStatement cmd = cn.prepareStatement(sql);
                cmd.setInt(1, Id);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    Roles roles= 
                            new Roles(rs.getInt("IdRol")
                                    ,rs.getString("TipoRol"));
                                       
            
             listaRoles.add(roles);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaRoles;
     }
    
}
