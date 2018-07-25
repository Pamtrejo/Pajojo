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
public class Usuarios {

    /**
     * @return the IdUsuario
     */
    public int getIdUsuario() {
        return IdUsuario;
    }

    /**
     * @param IdUsuario the IdUsuario to set
     */
    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    /**
     * @return the NomUsuario
     */
    public String getNomUsuario() {
        return NomUsuario;
    }

    /**
     * @param NomUsuario the NomUsuario to set
     */
    public void setNomUsuario(String NomUsuario) {
        this.NomUsuario = NomUsuario;
    }

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
     * @return the Contrasena
     */
    public String getContrasena() {
        return Contrasena;
    }

    /**
     * @param Contrasena the Contrasena to set
     */
    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public Usuarios(int IdUsuario, String NomUsuario, int IdRol, String Contrasena) {
        this.IdUsuario = IdUsuario;
        this.NomUsuario = NomUsuario;
        this.IdRol = IdRol;
        this.Contrasena = Contrasena;
    }
    
    
    private int IdUsuario;
    private String NomUsuario;
    private int IdRol;
    private String Contrasena;
}
