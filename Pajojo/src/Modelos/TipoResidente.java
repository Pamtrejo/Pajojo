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
public class TipoResidente {

    /**
     * @return the IdTipoResidente
     */
    public int getIdTipoResidente() {
        return IdTipoResidente;
    }

    /**
     * @param IdTipoResidente the IdTipoResidente to set
     */
    public void setIdTipoResidente(int IdTipoResidente) {
        this.IdTipoResidente = IdTipoResidente;
    }

    /**
     * @return the TipoResidente
     */
    public String getTipoResidente() {
        return TipoResidente;
    }

    /**
     * @param TipoResidente the TipoResidente to set
     */
    public void setTipoResidente(String TipoResidente) {
        this.TipoResidente = TipoResidente;
    }

    public TipoResidente(int IdTipoResidente, String TipoResidente) {
        this.IdTipoResidente = IdTipoResidente;
        this.TipoResidente = TipoResidente;
    }
    
    private int IdTipoResidente;
    private String TipoResidente;
    
}
