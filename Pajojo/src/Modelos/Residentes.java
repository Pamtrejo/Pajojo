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
public class Residentes {

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

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
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the IdResidente
     */
    public int getIdResidente() {
        return IdResidente;
    }

    /**
     * @param IdResidente the IdResidente to set
     */
    public void setIdResidente(int IdResidente) {
        this.IdResidente = IdResidente;
    }

    public Residentes(int IdResidente, String Nombre, String Descripcion, int IdMembresia, int IdTipoResidente) {
        this.IdResidente = IdResidente;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.IdMembresia = IdMembresia;
        this.IdTipoResidente = IdTipoResidente;
    }
    
    private int IdResidente;
    private String Nombre;
    private String Descripcion;
    private int IdMembresia;
    private int IdTipoResidente;
    
    
}
