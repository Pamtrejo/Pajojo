/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Modelos.*;
import java.sql.CallableStatement;
import java.sql.Date;
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
    
    public int SPInsertarRecibos(int IdVivienda,String Descripcion,Double Monto,Date FechaPago ) throws SQLException{
        
        CallableStatement callStatement = null;
        callStatement = this.cn.prepareCall("{call sp_InsertarRecibo(?,?,?,?)}");
        callStatement.setInt(1, IdVivienda);
        callStatement.setString(2, Descripcion);
        callStatement.setDouble(3, Monto);
        callStatement.setDate(4, FechaPago);

        //callStatement.executeQuery();
        
        ResultSet rs = callStatement.executeQuery();
        int id = 0;
        if(rs.next()) {
    
            id = rs.getInt("Id");
    //System.out.println("Equipment ID: " + rs.getString("equipmentID"));
    }
    
        return id;
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
                                    ,rs.getString("Descripcion")
                                    ,rs.getDouble("Monto"));
                                       
            
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
                
                String sql = "SELECT * FROM vw_Recibos WHERE IdRecibo = ?";
                PreparedStatement cmd = cn.prepareStatement(sql);
                cmd.setInt(1, Id);
                
        ResultSet rs = cmd.executeQuery();
       
        while(rs.next()) {
                    Recibos recibos = 
                            new Recibos(rs.getInt("IdRecibos")
                                    ,rs.getInt("IdPago")
                                    ,rs.getString("Descripcion")
                                    ,rs.getDouble("Monto"));
                                       
            
             listaRecibos.add(recibos);
            } 
        }
        catch (Exception e) {
        System.out.println(e.toString());
        }
            
            
            return listaRecibos;
     }
    
}
