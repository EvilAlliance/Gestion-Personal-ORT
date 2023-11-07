/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Menu;
import View.MenuPostulante;
import View.MenuPuesto;
import View.MenuTematica;

/**
 *
 * @author chial
 */
public class Controller {

    private static Menu menu = new Menu();
    public static MenuTematica menuTematica = new MenuTematica();
    public static MenuPuesto menuPuesto = new MenuPuesto();
    public static MenuPostulante menuPostulante = new MenuPostulante();

    public static void init() {
        menu.setVisible(true);
        System.out.println("Hola");
    }

    public static void initMenuTematica() {
        menuTematica.setVisible(true);
    }

    public static void initMenuPuesto() {
        menuPuesto.setVisible(true);
    }

    public static void initMenuPostulante() {
        menuPostulante.setVisible(true);
    }
}
