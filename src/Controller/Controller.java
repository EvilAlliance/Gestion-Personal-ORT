/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
import View.*;
import java.util.ArrayList;

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
    private static final ArrayList<Tema> topicList = new ArrayList<Tema>();

    private static final ArrayList<Postulante> postulanteLista = new ArrayList<Postulante>();
    private static final ArrayList<Puesto> puestoLista = new ArrayList<Puesto>();
    private static final ArrayList<Entrevistador> entrevistadorLista = new ArrayList<Entrevistador>();

    public static void initDevMode() {
        if (devMode) {
            topicList.add(new Tema("asdfasdfasdf", "asdf"));
            topicList.add(new Tema("asddfasdf", "asdf"));
            topicList.add(new Tema("asdf", "asdf"));
        }
    }

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

    public static void addPostulante(String nombre, String cedula, String direccion, String telefono, String mail, String linkedin, String formato, Experiencia[] experiencia) {
        postulanteLista.add(new Postulante(nombre, cedula, direccion, telefono, mail, linkedin, formato, experiencia));
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
        topicList.add(new Tema(nombre, descripcion));
    }

    public static void initConsultaTematica() {
        consultaTematica.reset();
        consultaTematica.setVisible(true);
    }

    public static void initRegistroPuesto() {
        registroPuesto.reset();
        registroPuesto.set(topicList);
        registroPuesto.setVisible(true);
    }

    public static void addPuesto(String nombre, String formato, Tema[] topics) {
        puestoLista.add(new Puesto(nombre, formato, topics));
    }

    public static void initConsultaPuesto() {
        consultaPuesto.reset();
        consultaPuesto.setVisible(true);
    }

    public static void initRegistroEvaluador() {
        registroEvaluador.reset();
        registroEvaluador.setVisible(true);
    }

    public static void addEvaluador(String nombre, String Cedula, String direccion, String ano) {
        entrevistadorLista.add(new Entrevistador(nombre, Cedula, direccion, ano));
    }

    public static String verifyPersonaNombre(String nombre) {
        return Persona.verifyNombre(nombre);
    }

    public static String verifyPersonaCedula(String cedula) {
        return Persona.verifyCedula(cedula);
    }

    public static String verifyPostulanteTelefono(String telefono) {
        return Postulante.verifyTelefono(telefono);
    }

    public static String verifyPersonaDireccion(String direccion) {
        return Persona.verifyDireccion(direccion);
    }

    public static String verifyPostulanteMail(String mail) {
        return Postulante.verifyMail(mail);
    }

    public static String verifyPostulanteLinkedin(String linkedin) {
        return Postulante.verifyLinkedin(linkedin);
    }
    
    public static String verifyEntrevistadorAno(String ano){
        return Entrevistador.verifyAno(ano);
    }
}
