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
public class DALMembresia extends DAL{
    
    public DALMembresia(){
    
        super();
    }
    
    //LISTA PARA OBTENER MEMBRESIAS DE LA BD
    public List<Membresia> getMembresias() throws SQLException{
        
        
            List<Membresia> listaMembresias = new LinkedList<Membresia>();
            
            try {
                
                String sql = "SELECT * FROM vw_Membresias";
                PreparedStatement cmd = cn.prepareStatement(sql);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    Membresia membresias = 
                            new Membresia(rs.getInt("IdMembresia")
                                    ,rs.getString("TipoMembresia")
                                    ,rs.getInt("IdDetalle"));
                                       
            
             listaMembresias.add(membresias);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaMembresias;
     }
    
    
    //LISTA PARA OBTENER UNA MEMBRESIA EN ESPECIFICO
    public List<Membresia> getMembresias(int Id) throws SQLException{
        
        
            List<Membresia> listaMembresias = new LinkedList<Membresia>();
            
            try {
                
                String sql = "SELECT * FROM vw_Membresias";
                PreparedStatement cmd = cn.prepareStatement(sql);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    Membresia membresias = 
                            new Membresia(rs.getInt("IdMembresia")
                                    ,rs.getString("TipoMembresia")
                                    ,rs.getInt("IdDetalle"));
                                       
            
             listaMembresias.add(membresias);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaMembresias;
     }
    
}
