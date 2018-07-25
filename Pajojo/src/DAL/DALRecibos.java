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
public class DALRecibos extends DAL{
    
    public DALRecibos(){
    
        super();
    }
    
    
    //LISTA PARA OBTENER RECIBOS DE LA BD
    public List<Recibos> getRecibos() throws SQLException{
        
        
            List<Recibos> listaRecibos = new LinkedList<Recibos>();
            
            try {
                
                String sql = "SELECT * FROM vw_Recibos";
                PreparedStatement cmd = cn.prepareStatement(sql);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    Recibos recibos = 
                            new Recibos(rs.getInt("IdRecibos")
                                    ,rs.getInt("IdPago")
                                    ,rs.getString("Descripcion"));
                                       
            
             listaRecibos.add(recibos);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaRecibos;
     }
    
    
    //LISTA PARA OBTENER UN RECIBO EN ESPECIFICO
    public List<Recibos> getRecibos(int Id) throws SQLException{
        
        
            List<Recibos> listaRecibos = new LinkedList<Recibos>();
            
            try {
                
                String sql = "SELECT * FROM vw_Recibos";
                PreparedStatement cmd = cn.prepareStatement(sql);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    Recibos recibos = 
                            new Recibos(rs.getInt("IdRecibos")
                                    ,rs.getInt("IdPago")
                                    ,rs.getString("Descripcion"));
                                       
            
             listaRecibos.add(recibos);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaRecibos;
     }
    
}
