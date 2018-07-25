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
public class Detalle {

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

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Valor
     */
    public int getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the Factor
     */
    public double getFactor() {
        return Factor;
    }

    /**
     * @param Factor the Factor to set
     */
    public void setFactor(double Factor) {
        this.Factor = Factor;
    }

    public Detalle(int IdDetalle, String Tipo, int Valor, double Factor) {
        this.IdDetalle = IdDetalle;
        this.Tipo = Tipo;
        this.Valor = Valor;
        this.Factor = Factor;
    }
    
    
    private int IdDetalle;
    private String Tipo;
    private int Valor;
    private double Factor;
    
}
