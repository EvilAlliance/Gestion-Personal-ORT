package Model;

import java.util.Comparator;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class CriterioCedula implements Comparator<Postulante>{
    @Override
    //si resta < 0 => a < b; si resta == 0 => a == b; si resta > 0 => a > b
    public int compare(Postulante postulanteA, Postulante postulanteB){
        return Integer.parseInt(postulanteA.getCedula()) - Integer.parseInt(postulanteB.getCedula());
    }
}
