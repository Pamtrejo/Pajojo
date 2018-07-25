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
public class RespuestaUsuario {

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
     * @return the IdPregunta
     */
    public int getIdPregunta() {
        return IdPregunta;
    }

    /**
     * @param IdPregunta the IdPregunta to set
     */
    public void setIdPregunta(int IdPregunta) {
        this.IdPregunta = IdPregunta;
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

    public RespuestaUsuario(int IdRespuesta, int IdPregunta, int IdUsuario) {
        this.IdRespuesta = IdRespuesta;
        this.IdPregunta = IdPregunta;
        this.IdUsuario = IdUsuario;
    }
    
    private int IdRespuesta;
    private int IdPregunta;
    private int IdUsuario;
    
    
}
