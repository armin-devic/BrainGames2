package braingames.informatique.cgmatane.cq.ca.braingames;

/**
 * Created by 1443920 on 2014-10-03.
 * Classe qui crée les cases à afficher sur la fenêtre de jeu
 */
public class CaseNomre {

    int abscisse;
    int ordonnée;
    int valeurCase;
    int visibilité;


    public CaseNomre(int abscisse, int ordonnée, int valeurCase, int visibilité) {
        this.abscisse = abscisse;
        this.ordonnée = ordonnée;
        this.valeurCase = valeurCase;
        this.visibilité = visibilité;
    }

    public int getValeurCase() {
        return valeurCase;
    }

    public int getOrdonnée() {
        return ordonnée;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public int getVisibilité() {
        return visibilité;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonnée(int ordonnée) {
        this.ordonnée = ordonnée;
    }

    public void setValeurCase(int valeurCase) {
        this.valeurCase = valeurCase;
    }

    public void setVisibilité(int visibilité) {
        this.visibilité = visibilité;
    }
}
