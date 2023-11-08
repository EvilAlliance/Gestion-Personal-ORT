/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.*;

/**
 *
 * @author chial
 */
public class Controller {

    private static Menu menu = new Menu();
    private static MenuTematica menuTematica = new MenuTematica();
    private static MenuPuesto menuPuesto = new MenuPuesto();
    private static MenuPostulante menuPostulante = new MenuPostulante();
    private static AltaPostulanteP altaPostulanteP = new AltaPostulanteP();
    private static AltaPostulanteS altaPostulanteS = new AltaPostulanteS();
    private static BajaPostulante bajaPostulante = new BajaPostulante();
    private static HistorialPostulante historialPostulante = new HistorialPostulante();
    private static IngresoEntrevista ingresoEntrevista = new IngresoEntrevista();
    private static RegistroTematica registroTematica = new RegistroTematica();
    private static ConsultaTematica consultaTematica = new ConsultaTematica();
    private static ConsultaPuesto consultaPuesto = new ConsultaPuesto();
    private static RegistroPuesto registroPuesto = new RegistroPuesto();

    public static void init() {
        menu.setVisible(true);
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

    public static void initAltaPostulante() {
        altaPostulanteP.setVisible(true);
    }

    public static void diposeAltaPostulante() {
        altaPostulanteP.dispose();
        altaPostulanteS.dispose();
    }

    public static void nextAltaPostulante() {
        altaPostulanteS.setVisible(true);
    }

    public static void initBajaPostulante() {
        bajaPostulante.setVisible(true);
    }

    public static void initHistoriaPostulante() {
        historialPostulante.setVisible(true);
    }

    public static void initIngresoEntrevista() {
        ingresoEntrevista.setVisible(true);
    }

    public static void initRegistroTematica() {
        registroTematica.setVisible(true);
    }

    public static void initConsultaTematica() {
        consultaTematica.setVisible(true);
    }

    public static void initRegistroPuesto() {
        registroPuesto.setVisible(true);
    }

    public static void initConsultaPuesto() {
        consultaPuesto.setVisible(true);
    }
}
