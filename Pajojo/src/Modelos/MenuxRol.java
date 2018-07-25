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
public class MenuxRol {

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
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
     * @return the IdMenu
     */
    public int getIdMenu() {
        return IdMenu;
    }

    /**
     * @param IdMenu the IdMenu to set
     */
    public void setIdMenu(int IdMenu) {
        this.IdMenu = IdMenu;
    }

    /**
     * @return the Visible
     */
    public boolean isVisible() {
        return Visible;
    }

    /**
     * @param Visible the Visible to set
     */
    public void setVisible(boolean Visible) {
        this.Visible = Visible;
    }
    
    private int Id;
    private int IdRol;
    private int IdMenu;
    private boolean Visible;
    
}
