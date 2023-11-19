package Controller;

import Model.*;
import View.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Controlador {

    private static final boolean devMode = false;

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

    private static ArrayList<Tema> temaList = new ArrayList<Tema>();
    private static ArrayList<Postulante> postulanteLista = new ArrayList<Postulante>();
    private static ArrayList<Puesto> puestoList = new ArrayList<Puesto>();
    private static ArrayList<Entrevistador> entrevistadorLista = new ArrayList<Entrevistador>();

    public static void initDevMode() {
//        if (devMode) {
//            temaList.add(new Tema("asdfasdfasdf", "asdf"));
//            temaList.add(new Tema("asddfasdf", "asdf"));
//            temaList.add(new Tema("asdf", "asdf"));
//            entrevistadorLista.add(new Entrevistador("Leandro Meneses", "123456789", "algun - lugar 123", "1990"));
//            entrevistadorLista.add(new Entrevistador("PEPE Meneses", "123453789", "PEPE - lugar 2123", "1190"));
//            entrevistadorLista.add(new Entrevistador("PEdro Meneses", "123345689", "coca - lugar 2123", "1990"));
//            Experiencia[] prueba = {new Experiencia(2, temaList.get(0)), new Experiencia(8, temaList.get(2))};
//            postulanteLista.add(new Postulante("Pedro Chialanza", "123456789", "algun - lugar 1123", "122341345", "adsgagasga@gmail.com", "https://www.linkedin.com", "Precencial", prueba));
//            Experiencia[] prueba1 = {new Experiencia(5, temaList.get(1)), new Experiencia(6, temaList.get(2))};
//            postulanteLista.add(new Postulante("Leandro Chialanza", "123433789", "algun - lugar 1123", "114341345", "adsgasga@gmail.com", "https://www.linkedin.com", "Precencial", prueba1));
//            Experiencia[] prueba2 = {new Experiencia(7, temaList.get(1)), new Experiencia(1, temaList.get(0))};
//            postulanteLista.add(new Postulante("PEPe Chialanza", "123454489", "algun - lugar 1123", "113341345", "adsgaga@gmail.com", "https://www.linkedin.com", "Precencial", prueba2));
//            Tema[] prueba01 = {temaList.get(1), temaList.get(0)};
//            Tema[] prueba02 = {temaList.get(1)};
//            Tema[] prueba03 = {temaList.get(0), temaList.get(2)};
//            puestoList.add(new Puesto("pepe", "Presencil", prueba01));
//            puestoList.add(new Puesto("jaaj", "Presencil", prueba02));
//            puestoList.add(new Puesto("jaje", "Presencil", prueba03));
//        }
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
        altaPostulanteS.set(temaList);
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
        serialize();
    }

    public static void disposeAltaPostulante() {
        altaPostulanteP.dispose();
    }

    public static void initBajaPostulante() {
        bajaPostulante.reset();
        bajaPostulante.set(postulanteLista);
        bajaPostulante.setVisible(true);
    }

    public static void bajaPostulante(Postulante postulante) {
        postulanteLista.remove(postulante);
        serialize();
    }

    public static void initHistoriaPostulante() {
        historialPostulante.reset();
        historialPostulante.set(postulanteLista);
        historialPostulante.setVisible(true);
    }

    public static void initIngresoEntrevista() {
        ingresoEntrevista.reset();
        ingresoEntrevista.set(postulanteLista, entrevistadorLista);
        ingresoEntrevista.setVisible(true);
    }

    public static int getEntrevistaLastIndex() {
        return Entrevista.getInterviewNumber();
    }

    public static void addEntrevista(Postulante postulante, Entrevistador entrevistador, String puntaje, String comentario) {
        postulante.getEntrevistas().add(new Entrevista(entrevistador, puntaje, comentario));
        serialize();
    }

    public static void initRegistroTematica() {
        registroTematica.reset();
        registroTematica.setVisible(true);
    }

    public static String verifyNombreTematica(String nombre) {
        String repetido = "";

        for (int i = 0; i < temaList.size() && repetido.equals(""); i++) {
            if (temaList.get(i).getNombre().equalsIgnoreCase(nombre)) {
                repetido = "Nombre repetido";
            }
        }
        return repetido;
    }

    public static void addTematica(String nombre, String descripcion) {
        temaList.add(new Tema(nombre, descripcion));
        serialize();
    }

    public static void initConsultaTematica() {
        consultaTematica.reset();
        consultaTematica.set(temaList);
        consultaTematica.setVisible(true);
    }

    public static ArrayList<Puesto> getPuestos() {
        return puestoList;
    }

    public static ArrayList<Postulante> getPostulantes() {
        return postulanteLista;
    }

    public static void initRegistroPuesto() {
        registroPuesto.reset();
        registroPuesto.set(temaList);
        registroPuesto.setVisible(true);
    }

    public static String verifyNombrePuesto(String nombre) {
        String repetido = "";

        for (int i = 0; i < puestoList.size() && repetido.equals(""); i++) {
            if (puestoList.get(i).getNombre().equalsIgnoreCase(nombre)) {
                repetido = "Nombre repetido";
            }
        }
        return repetido;
    }

    public static void addPuesto(String nombre, String formato, Tema[] topics) {
        puestoList.add(new Puesto(nombre, formato, topics));
        serialize();
    }

    public static void initConsultaPuesto() {
        consultaPuesto.reset();
        consultaPuesto.set(puestoList, postulanteLista);
        consultaPuesto.setVisible(true);
    }

    public static void exportarPostulantes(String consulta) {
        ArchivoGrabacion recorder = new ArchivoGrabacion("./Consulta.txt");
        recorder.grabarLinea(consulta);
        recorder.shutDown();
    }

    public static void initRegistroEvaluador() {
        registroEvaluador.reset();
        registroEvaluador.setVisible(true);
    }

    public static void addEvaluador(String nombre, String Cedula, String direccion, String ano) {
        entrevistadorLista.add(new Entrevistador(nombre, Cedula, direccion, ano));
        serialize();
    }

    public static String verifyPersonaNombre(String nombre) {
        return Persona.verifyNombre(nombre);
    }

    public static String verifyPersonaCedula(String cedula) {
        String cedulaRepite = "";
        for (int i = 0; i < postulanteLista.size() && cedulaRepite.equals(""); i++) {
            if (postulanteLista.get(i).getCedula().equals(cedula)) {
                cedulaRepite = "Cedula repetida";
            }
        }

        for (int i = 0; i < entrevistadorLista.size() && cedulaRepite.equals(""); i++) {
            if (entrevistadorLista.get(i).getCedula().equals(cedula)) {
                cedulaRepite = "Cedula repetida";
            }
        }

        if (cedulaRepite.equals("")) {
            cedulaRepite = Persona.verifyCedula(cedula);
        }

        return cedulaRepite;
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

    public static String verifyEntrevistadorAno(String ano) {
        return Entrevistador.verifyAno(ano);
    }

    public static void serialize() {
        try {
            if (!new File("./Saved").exists()) {
                System.out.println("Pee");
                Files.createDirectory(Paths.get("./Saved"));
            }

            ObjectOutputStream SaveStream = new ObjectOutputStream(new FileOutputStream("./Saved/index"));
            Object[] out = {temaList, postulanteLista, puestoList, entrevistadorLista};
            SaveStream.writeObject(out);
            SaveStream.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error guardando estado");
        }
    }

    public static void deserialize() {
        try {
            if (!new File("./Saved").exists()) {
                Files.createDirectory(Paths.get("./Saved"));
            }

            ObjectInputStream getStream = new ObjectInputStream(new FileInputStream("./Saved/index"));
            Object[] in = (Object[]) getStream.readObject();
            getStream.close();

            temaList = (ArrayList<Tema>) in[0];
            postulanteLista = (ArrayList<Postulante>) in[1];
            puestoList = (ArrayList<Puesto>) in[2];
            entrevistadorLista = (ArrayList<Entrevistador>) in[3];

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido recuperar el estado");
        }
    }
}
