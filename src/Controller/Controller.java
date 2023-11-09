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

    private static final Menu menu = new Menu();
    private static final MenuTematica menuTematica = new MenuTematica();
    private static final MenuPuesto menuPuesto = new MenuPuesto();
    private static final MenuPostulante menuPostulante = new MenuPostulante();
    private static final AltaPostulanteP altaPostulanteP = new AltaPostulanteP();
    private static final AltaPostulanteS altaPostulanteS = new AltaPostulanteS();
    private static final BajaPostulante bajaPostulante = new BajaPostulante();
    private static final HistorialPostulante historialPostulante = new HistorialPostulante();
    private static final IngresoEntrevista ingresoEntrevista = new IngresoEntrevista();
    private static final RegistroTematica registroTematica = new RegistroTematica();
    private static final ConsultaTematica consultaTematica = new ConsultaTematica();
    private static final ConsultaPuesto consultaPuesto = new ConsultaPuesto();
    private static final RegistroPuesto registroPuesto = new RegistroPuesto();
    private static final RegistroEvaluador registroEvaluador = new RegistroEvaluador();

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

    public static void initAltaPostulante(boolean reset) {
        if (reset) {
            altaPostulanteP.reset();
        }
        altaPostulanteP.setVisible(true);
    }

    public static void nextAltaPostulante(boolean reset) {
        if (reset) {
            altaPostulanteS.reset();
            altaPostulanteP.reset();
        }
        altaPostulanteS.setVisible(true);
    }

    public static void disposeAltaPostulante() {
        altaPostulanteS.dispose();
        altaPostulanteP.dispose();
    }

    public static void initBajaPostulante() {
        bajaPostulante.reset();
        bajaPostulante.setVisible(true);
    }

    public static void initHistoriaPostulante() {
        historialPostulante.reset();
        historialPostulante.setVisible(true);
    }

    public static void initIngresoEntrevista() {
        ingresoEntrevista.reset();
        ingresoEntrevista.setVisible(true);
    }

    public static void initRegistroTematica() {
        registroTematica.reset();
        registroTematica.setVisible(true);
    }

    public static void initConsultaTematica() {
        consultaTematica.reset();
        consultaTematica.setVisible(true);
    }

    public static void initRegistroPuesto() {
        registroPuesto.reset();
        registroPuesto.setVisible(true);
    }

    public static void initConsultaPuesto() {
        consultaPuesto.reset();
        consultaPuesto.setVisible(true);
    }

    public static void initRegistroEvaluador() {
        registroEvaluador.reset();
        registroEvaluador.setVisible(true);
    }
}
