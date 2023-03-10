import VueControleur.VueControleurGyromite;
import modele.plateau.Jeu;

/**
 *
 * @author jhomi
 */
public class Lifapoo {

    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        
        VueControleurGyromite vc = new VueControleurGyromite(jeu);

        jeu.getOrdonnanceur().addObserver(vc);
        
        vc.setVisible(true);
        
        jeu.start(200);
    }
}
