
import architecture.Controleur;
import architecture.Fenetre;
import vue.VuePvZanor;

public class App {

	public static void main(String[] parametres) {
		Controleur.choisirVuePrincipale(VuePvZanor.class);
		Fenetre.launch(Fenetre.class, parametres);	
	}

}
