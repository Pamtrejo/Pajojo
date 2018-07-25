/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Date;

/**
 *
 * @author Toshiba
 */
public class Visitas {

    /**
     * @return the IdVisita
     */
    public int getIdVisita() {
        return IdVisita;
    }

    /**
     * @param IdVisita the IdVisita to set
     */
    public void setIdVisita(int IdVisita) {
        this.IdVisita = IdVisita;
    }

    /**
     * @return the NomVisitante
     */
    public String getNomVisitante() {
        return NomVisitante;
    }

    /**
     * @param NomVisitante the NomVisitante to set
     */
    public void setNomVisitante(String NomVisitante) {
        this.NomVisitante = NomVisitante;
    }

    /**
     * @return the DUIVisitante
     */
    public String getDUIVisitante() {
        return DUIVisitante;
    }

    /**
     * @param DUIVisitante the DUIVisitante to set
     */
    public void setDUIVisitante(String DUIVisitante) {
        this.DUIVisitante = DUIVisitante;
    }

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
     * @return the HoraVisita
     */
    public Date getHoraVisita() {
        return HoraVisita;
    }

    /**
     * @param HoraVisita the HoraVisita to set
     */
    public void setHoraVisita(Date HoraVisita) {
        this.HoraVisita = HoraVisita;
    }

    /**
     * @return the FechaVisita
     */
    public Date getFechaVisita() {
        return FechaVisita;
    }

    /**
     * @param FechaVisita the FechaVisita to set
     */
    public void setFechaVisita(Date FechaVisita) {
        this.FechaVisita = FechaVisita;
    }

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

    public Visitas(int IdVisita, String NomVisitante, String DUIVisitante, String Descripcion, Date HoraVisita, Date FechaVisita, int IdUsuario) {
        this.IdVisita = IdVisita;
        this.NomVisitante = NomVisitante;
        this.DUIVisitante = DUIVisitante;
        this.Descripcion = Descripcion;
        this.HoraVisita = HoraVisita;
        this.FechaVisita = FechaVisita;
        this.IdUsuario = IdUsuario;
    }
    
    private int IdVisita;
    private String NomVisitante;
    private String DUIVisitante;
    private String Descripcion;
    private Date HoraVisita;
    private Date FechaVisita;
    private int IdUsuario;
    
    
}
