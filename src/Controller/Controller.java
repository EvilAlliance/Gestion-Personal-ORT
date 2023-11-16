/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
import View.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author chial
 */
public class Controller {

    private static final boolean devMode = true;

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
    private static final ArrayList<Topic> topicList = new ArrayList<Topic>();
    private static final ArrayList<Interviewee> intervieweeList = new ArrayList<Interviewee>();

    public static void init() {
        if (devMode) {
            topicList.add(new Topic("asdfasdfasdf", "asdf"));
            topicList.add(new Topic("asddfasdf", "asdf"));
            topicList.add(new Topic("asdf", "asdf"));
        }
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
            altaPostulanteS.reset();
        }
        altaPostulanteP.setVisible(true);
    }

    public static void nextAltaPostulante(boolean reset) {
        if (reset) {
            altaPostulanteS.reset();
            altaPostulanteP.reset();
        }
        altaPostulanteS.set(topicList);
        altaPostulanteS.setVisible(true);
    }

    public static String getPostulanteNombre() {
        return altaPostulanteP.getNombre();
    }

    public static String getPostulanteCedula() {
        return altaPostulanteP.getCedula();
    }

    public static String getPostulanteDireccion() {
        return altaPostulanteP.getDireccion();
    }

    public static String getPostulanteTelefono() {
        return altaPostulanteP.getTelefono();
    }

    public static String getPostulanteMail() {
        return altaPostulanteP.getMail();
    }

    public static String getPostulanteLinkedin() {
        return altaPostulanteP.getLinkedin();
    }

    public static String getPostulanteFormato() {
        return altaPostulanteP.getFormato();
    }

    public static void addPostulante(String nombre, String cedula, String direccion, String telefono, String mail, String linkedin,String formato, Experiencia[] experiencia) {
        intervieweeList.add(new Interviewee(nombre, cedula, direccion, telefono, mail, linkedin,formato, experiencia));
    }
    
    public static void disposeAltaPostulante() {
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

    public static void addTematica(String nombre, String descripcion) {
        topicList.add(new Topic(nombre, descripcion));
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

    public static String verifyPostulanteNombre(String nombre) {
        return Interviewee.verifyName(nombre);
    }

    public static String verifyPostulanteCedula(String cedula) {
        return Interviewee.verifyDni(cedula);
    }

    public static String verifyPostulanteTelefono(String telefono) {
        return Interviewee.verifyPhone(telefono);
    }

    public static String verifyPostulanteDireccion(String direccion) {
        return Interviewee.verifyHomeDirection(direccion);
    }

    public static String verifyPostulanteMail(String mail) {
        return Interviewee.verifyMail(mail);
    }

    public static String verifyPostulanteLinkedin(String linkedin) {
        return Interviewee.verifyLinkedin(linkedin);
    }
}
