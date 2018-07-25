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
public class Membresia {

    /**
     * @return the IdMembresia
     */
    public int getIdMembresia() {
        return IdMembresia;
    }

    /**
     * @param IdMembresia the IdMembresia to set
     */
    public void setIdMembresia(int IdMembresia) {
        this.IdMembresia = IdMembresia;
    }

    /**
     * @return the TipoMembresia
     */
    public String getTipoMembresia() {
        return TipoMembresia;
    }

    /**
     * @param TipoMembresia the TipoMembresia to set
     */
    public void setTipoMembresia(String TipoMembresia) {
        this.TipoMembresia = TipoMembresia;
    }

    /**
     * @return the IdDetalle
     */
    public int getIdDetalle() {
        return IdDetalle;
    }

    /**
     * @param IdDetalle the IdDetalle to set
     */
    public void setIdDetalle(int IdDetalle) {
        this.IdDetalle = IdDetalle;
    }

    public Membresia(int IdMembresia, String TipoMembresia, int IdDetalle) {
        this.IdMembresia = IdMembresia;
        this.TipoMembresia = TipoMembresia;
        this.IdDetalle = IdDetalle;
    }
    
    private int IdMembresia;
    private String TipoMembresia;
    private int IdDetalle;
    
}
