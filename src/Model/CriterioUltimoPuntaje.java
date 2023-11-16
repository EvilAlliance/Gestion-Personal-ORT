package Model;

import java.util.Comparator;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class CriterioUltimoPuntaje implements Comparator<Postulante> {
    @Override
    public int compare(Postulante postulanteA, Postulante postulanteB){
        return postulanteB.getUltimoPuntajeEntrevista() - postulanteA.getUltimoPuntajeEntrevista();
    }
}
