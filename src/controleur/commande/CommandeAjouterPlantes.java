package controleur.commande;

import modele.Jardin.TERRAIN;
import modele.Plantes.PLANTES;
import vue.VuePvZanor;

public class CommandeAjouterPlantes  extends Commande{
	
	protected double x;
	protected double y;
	
	protected PLANTES planteChoisi;
	public CommandeAjouterPlantes(PLANTES planteChoisi, double x, double y)
	{
		this.planteChoisi = planteChoisi;
		this.x = x;
		this.y = y;
	}
	
	
	public void executer()
	{
		VuePvZanor.getInstance().planterPlantes(x, y, planteChoisi);
	}
	
	public void annuler()
	{
		VuePvZanor.getInstance().deracinerPlante(planteChoisi, x, y);
	}

}
