package Controller;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
import javax.swing.JOptionPane;

public class Index {

    public static void main(String[] args) {
        int option = JOptionPane.showOptionDialog(null, "¿Desea recuperar el estado?", "Recuperar", 1, 1, null, null, null);
        switch (option) {
            case 0: {
                Controlador.deserialize();
                Controlador.init();
                break;
            }
            case 1: {
                Controlador.init();
                break;
            }
        }
    }
}
