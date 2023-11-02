package controleur.commande;

import modele.Jardin.TERRAIN;
import vue.VuePvZanor;

public class CommandeChoisirTerrain extends Commande{
	
	
	protected TERRAIN ancienTerrain;
	protected TERRAIN nouveauTerrain;
	public CommandeChoisirTerrain(TERRAIN ancienTerrain, TERRAIN nouveauTerrain)
	{
		this.ancienTerrain = ancienTerrain;
		this.nouveauTerrain = nouveauTerrain;
	}
	
	public void executer()
	{
		VuePvZanor.getInstance().afficherTerrain(this.nouveauTerrain);
	}
	
	public void annuler()
	{
		VuePvZanor.getInstance().afficherTerrain(this.ancienTerrain);
	}
}
