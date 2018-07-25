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
public class Menu {

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

    public Menu(int IdMenu, String Nombre, boolean Visible) {
        this.IdMenu = IdMenu;
        this.Nombre = Nombre;
        this.Visible = Visible;
    }
    
    private int IdMenu;
    private String Nombre;
    private boolean Visible;
    
}
