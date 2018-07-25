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
public class DALResidentes extends DAL{
    
    public DALResidentes(){
    
        super();
    }
    
    //LISTA PARA OBTENER RESIDENTES DE LA BD
    public List<Residentes> getResidentes() throws SQLException{
        
        
            List<Residentes> listaResidentes = new LinkedList<Residentes>();
            
            try {
                
                String sql = "SELECT * FROM vw_Residentes";
                PreparedStatement cmd = cn.prepareStatement(sql);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    Residentes residentes= 
                            new Residentes(rs.getInt("IdResidente")
                                    ,rs.getString("Nombre")
                                    ,rs.getString("Descripcion")
                                    ,rs.getInt("IdMembresia")
                                    ,rs.getInt("IdTipoResidente"));
                                       
            
             listaResidentes.add(residentes);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaResidentes;
     }
    
    //LISTA PARA OBTENER UN RESIDENTE EN ESPECIFICO
    public List<Residentes> getResidentes(int Id) throws SQLException{
        
        
            List<Residentes> listaResidentes = new LinkedList<Residentes>();
            
            try {
                
                String sql = "SELECT * FROM vw_Residentes";
                PreparedStatement cmd = cn.prepareStatement(sql);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    Residentes residentes= 
                            new Residentes(rs.getInt("IdResidente")
                                    ,rs.getString("Nombre")
                                    ,rs.getString("Descripcion")
                                    ,rs.getInt("IdMembresia")
                                    ,rs.getInt("IdTipoResidente"));
                                       
            
             listaResidentes.add(residentes);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaResidentes;
     }
}
