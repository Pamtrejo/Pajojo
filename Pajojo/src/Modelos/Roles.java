/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Toshiba
 */
public class Roles {

    /**
     * @return the IdRol
     */
    public int getIdRol() {
        return IdRol;
    }

    /**
     * @param IdRol the IdRol to set
     */
    public void setIdRol(int IdRol) {
        this.IdRol = IdRol;
    }

    /**
     * @return the TipoRol
     */
    public String getTipoRol() {
        return TipoRol;
    }

    /**
     * @param TipoRol the TipoRol to set
     */
    public void setTipoRol(String TipoRol) {
        this.TipoRol = TipoRol;
    }

    public Roles(int IdRol, String TipoRol) {
        this.IdRol = IdRol;
        this.TipoRol = TipoRol;
    }
    
    
    private int IdRol;
    private String TipoRol;
    
    
    
}
