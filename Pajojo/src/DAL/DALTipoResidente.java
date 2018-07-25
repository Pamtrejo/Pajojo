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
public class DALTipoResidente extends DAL{
    
    public DALTipoResidente(){
    
        super();
    }
    
    //LISTA PARA OBTENER TIPO DE RESIDENTE DE LA BD
    public List<TipoResidente> getTipoResidentes() throws SQLException{
        
        
            List<TipoResidente> listaTipoResidente = new LinkedList<TipoResidente>();
            
            try {
                
                String sql = "SELECT * FROM vw_TipoResidentes";
                PreparedStatement cmd = cn.prepareStatement(sql);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    TipoResidente tiporesidente = 
                            new TipoResidente(rs.getInt("IdTipoResidente")
                                    ,rs.getString("TipoResidente"));
                                       
            
             listaTipoResidente.add(tiporesidente);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaTipoResidente;
     }
    
    //LISTA PARA OBTENER UN TIPO DE RESIDENTE EN ESPECIFICO
    public List<TipoResidente> getTipoResidentes(int Id) throws SQLException{
        
        
            List<TipoResidente> listaTipoResidente = new LinkedList<TipoResidente>();
            
            try {
                
                String sql = "SELECT * FROM vw_TipoResidentes";
                PreparedStatement cmd = cn.prepareStatement(sql);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    TipoResidente tiporesidente = 
                            new TipoResidente(rs.getInt("IdTipoResidente")
                                    ,rs.getString("TipoResidente"));
                                       
            
             listaTipoResidente.add(tiporesidente);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaTipoResidente;
     }
    
}
