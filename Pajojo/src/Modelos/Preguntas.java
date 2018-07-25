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
public class Preguntas {

    /**
     * @return the IdRespuesta
     */
    public int getIdRespuesta() {
        return IdRespuesta;
    }

    /**
     * @param IdRespuesta the IdRespuesta to set
     */
    public void setIdRespuesta(int IdRespuesta) {
        this.IdRespuesta = IdRespuesta;
    }

    /**
     * @return the NomPregunta
     */
    public String getNomPregunta() {
        return NomPregunta;
    }

    /**
     * @param NomPregunta the NomPregunta to set
     */
    public void setNomPregunta(String NomPregunta) {
        this.NomPregunta = NomPregunta;
    }

    public Preguntas(int IdRespuesta, String NomPregunta) {
        this.IdRespuesta = IdRespuesta;
        this.NomPregunta = NomPregunta;
    }
    
    
    private int IdRespuesta;
    private String NomPregunta;
    
}
