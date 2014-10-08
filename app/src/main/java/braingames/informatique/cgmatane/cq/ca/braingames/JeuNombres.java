package braingames.informatique.cgmatane.cq.ca.braingames;

import android.app.Activity;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class JeuNombres extends Activity {

    private List<CaseNomre> mesCases;

    private int[][] monTableau;
    private int nombreCases;

    private Button[][] tableauCases;

    
    Button bouton_0_0;
    Button bouton_0_1;
    Button bouton_0_2;
    Button bouton_0_3;
    Button bouton_0_4;

    Button bouton_1_0;
    Button bouton_1_1;
    Button bouton_1_2;
    Button bouton_1_3;
    Button bouton_1_4;

    Button bouton_2_0;
    Button bouton_2_1;
    Button bouton_2_2;
    Button bouton_2_3;
    Button bouton_2_4;

    Button bouton_3_0;
    Button bouton_3_1;
    Button bouton_3_2;
    Button bouton_3_3;
    Button bouton_3_4;

    Button bouton_4_0;
    Button bouton_4_1;
    Button bouton_4_2;
    Button bouton_4_3;
    Button bouton_4_4;
    
    
    
        




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeu_nombres);

        initAttr();
        creerCases();
        creerTableauInt();
        creerTabCaseNombre();
    }


    private void initAttr() {
        mesCases = new ArrayList<CaseNomre>();
        monTableau = new int[5][5];
        tableauCases = new Button[5][5];
        nombreCases = 5;

         bouton_0_0 = (Button) findViewById(R.id.bouton_0_0);
         bouton_0_1 = (Button) findViewById(R.id.bouton_0_1);
         bouton_0_2 = (Button) findViewById(R.id.bouton_0_2);
         bouton_0_3 = (Button) findViewById(R.id.bouton_0_3);
         bouton_0_4 = (Button) findViewById(R.id.bouton_0_4);

         bouton_1_0 = (Button) findViewById(R.id.bouton_1_0);
         bouton_1_1 = (Button) findViewById(R.id.bouton_1_1);
         bouton_1_2 = (Button) findViewById(R.id.bouton_1_2);
         bouton_1_3 = (Button) findViewById(R.id.bouton_1_3);
         bouton_1_4 = (Button) findViewById(R.id.bouton_1_4);

         bouton_2_0 = (Button) findViewById(R.id.bouton_2_0);
         bouton_2_1 = (Button) findViewById(R.id.bouton_2_1);
         bouton_2_2 = (Button) findViewById(R.id.bouton_2_2);
         bouton_2_3 = (Button) findViewById(R.id.bouton_2_3);
         bouton_2_4 = (Button) findViewById(R.id.bouton_2_4);

         bouton_3_0 = (Button) findViewById(R.id.bouton_3_0);
         bouton_3_1 = (Button) findViewById(R.id.bouton_3_1);
         bouton_3_2 = (Button) findViewById(R.id.bouton_3_2);
         bouton_3_3 = (Button) findViewById(R.id.bouton_3_3);
         bouton_3_4 = (Button) findViewById(R.id.bouton_3_4);

         bouton_4_0 = (Button) findViewById(R.id.bouton_4_0);
         bouton_4_1 = (Button) findViewById(R.id.bouton_4_1);
         bouton_4_2 = (Button) findViewById(R.id.bouton_4_2);
         bouton_4_3 = (Button) findViewById(R.id.bouton_4_3);
         bouton_4_4 = (Button) findViewById(R.id.bouton_4_4);
        
    }

    private void creerTabCaseNombre() {
              
        tableauCases[0][0] = bouton_0_0;
        tableauCases[0][1] = bouton_0_1;
        tableauCases[0][2] = bouton_0_2;
        tableauCases[0][3] = bouton_0_3;
        tableauCases[0][4] = bouton_0_4;

        tableauCases[1][0] = bouton_1_0;
        tableauCases[1][1] = bouton_1_1;
        tableauCases[1][2] = bouton_1_2;
        tableauCases[1][3] = bouton_1_3;
        tableauCases[1][4] = bouton_1_4;

        tableauCases[2][0] = bouton_2_0;
        tableauCases[2][1] = bouton_2_1;
        tableauCases[2][2] = bouton_2_2;
        tableauCases[2][3] = bouton_2_3;
        tableauCases[2][4] = bouton_2_4;

        tableauCases[3][0] = bouton_3_0;
        tableauCases[3][1] = bouton_3_1;
        tableauCases[3][2] = bouton_3_2;
        tableauCases[3][3] = bouton_3_3;
        tableauCases[3][4] = bouton_3_4;

        tableauCases[4][0] = bouton_4_0;
        tableauCases[4][1] = bouton_4_1;
        tableauCases[4][2] = bouton_4_2;
        tableauCases[4][3] = bouton_4_3;
        tableauCases[4][4] = bouton_4_4;

        remplirTabCaseNombre();
    }

    private void remplirTabCaseNombre() {
        for (int i = 0; i < monTableau.length; i++) {
            for (int j = 0; j < monTableau.length; j++) {

                // si montableau contient une valeure,
                // on place la valeur dans tableauCases
                if (monTableau[i][j] != 0){
                    tableauCases[i][j].setVisibility(View.VISIBLE);
                    tableauCases[i][j].setText(String.valueOf(monTableau[i][j]));
                }
            }
        }
    }

    private void creerCases() {

        for (int i = 0; i < nombreCases; i++) {

                int abs = (int) Math.floor(Math.random() * 5);
                int ord = (int) Math.floor(Math.random() * 5);
                int valeur  = (int) Math.floor(Math.random() * 25);
                int visibilite = View.VISIBLE;


                while (valeurDansListe(valeur) || valeur == 0){
                    valeur  = (int) Math.floor(Math.random() * 25);
                }
                mesCases.add(i, new CaseNomre(abs, ord, valeur, visibilite));
        }

        afficherCaseNombres();

    }

    private boolean valeurDansListe(int valeur) {
        boolean estDansListe = false;
        for (int i = 0; i < mesCases.size(); i++) {
            if (mesCases.get(i).getValeurCase() == valeur)
                estDansListe = true;
        }
        return  estDansListe;
    }

    private void afficherCaseNombres() {

        for (int i = 0; i < nombreCases; i++) {
            System.out.print("¦" + String.valueOf(mesCases.get(i).getValeurCase()) + "¦");
        }

    }

    private void creerTableauInt() {

        // on commence par remplir le tableau de 0
        // pour représenter les cases vides
        for (int i = 0; i < monTableau.length; i++) {
            for (int j = 0; j < monTableau.length; j++) {
                monTableau[i][j] = 0;
            }
        }

        // on remplace les 0 par les bonnes valeurs dans la bonne position
        // pour chaque CaseNombre dans la liste mesCases

        for (int i = 0; i < mesCases.size(); i++) {
            CaseNomre caseCourrante = mesCases.get(i);
            // on récupère les données
            int abs = caseCourrante.getAbscisse();
            int ord = caseCourrante.getOrdonnée();
            int valeur = caseCourrante.getValeurCase();

            // on place la case dans le tableau
            monTableau[abs][ord] = valeur;
        }

        afficherTabInt();


    }

    private void afficherTabInt() {
        System.out.println("");
        for (int i = 0; i < monTableau.length; i++) {
            for (int j = 0; j < monTableau.length; j++) {
                System.out.print(monTableau[i][j] + "|");
            }
            System.out.println("");
        }
    }

}



