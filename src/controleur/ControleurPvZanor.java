package controleur;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import controleur.commande.Commande;
import controleur.commande.CommandeChoisirTerrain;
import donnee.Exporteur;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import modele.Terrain;
import modele.Jardin;
import modele.Jardin.TERRAIN;
import modele.Plantes;
import modele.Plantes.PLANTES;
import modele.Zombies;
import modele.Zombies.ZOMBIES;
import vue.VuePvZanor;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ControleurPvZanor extends Controleur{

	private Plantes.PLANTES plantesChoisi;
	private Zombies.ZOMBIES zombiesChoisi;
	private Jardin jardin = new Jardin();
	public ControleurPvZanor()
	{
		Logger.logMsg(Logger.INFO, "new ControleurPvZanor()");
	}
	
	public void initialiser()
	{
		
	}
	
	
	
	public void notifierChoixPlantes(PLANTES plante) {
		

		this.plantesChoisi = plante;
		
	}
	
	public void notifierChoixZombies(ZOMBIES zombie) {
		
		this.zombiesChoisi = zombie;
		
	}
	
	
	public void notifierClicJardin(double x, double y, Boolean zombieBool) {
		if(zombieBool == true) {
			VuePvZanor.getInstance().placerZombies(x, y, this.zombiesChoisi);
			Zombies zombies = new Zombies(this.zombiesChoisi, x, y);
			jardin.ajouterZombie(zombies);
		}
		if (zombieBool == false) {
			VuePvZanor.getInstance().planterPlantes(x, y, this.plantesChoisi);
			Plantes plantes = new Plantes(this.plantesChoisi, x, y);
			jardin.ajouterPlante(plantes);
		}
	}
	
	public void musique(int selection) {
		String bip = "";
		
		
		switch (selection) {
		
		case 1: 	
			
		bip = "bin/vue/decoration/musique/day.mp3";
	       
		break;
		
		case 2: 
		bip = "bin/vue/decoration/musique/night.mp3";
		break;
		
		case 3:  
		bip = "bin/vue/decoration/musique/daypool.mp3";
		break;
		
		case 4 :  
		bip = "bin/vue/decoration/musique/nightpool.mp3";
		break;
		
		case 5 :  
		bip = "bin/vue/decoration/musique/dayroof.mp3";
		break;
		
		case 6 :  
		bip = "bin/vue/decoration/musique/nightroof.mp3";
		break;
		
		}
		
		Media hit = new Media(new File(bip).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.play();
		
		/*
		String bip = "bin/vue/decoration/musique/day.wav";
		Media hit = new Media(new File(bip).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.play();
		*/
		
	}
	
	public void notifierSauvegarder() {
		System.out.println("ControleurPvZanor.notifierSauvegarder()");		
		Exporteur exporteur = new Exporteur();
		System.out.println(jardin);
		//exporteur.sauvegarder(legumesDuJardin);
		exporteur.sauvegarder(jardin);
	}
	public void notifierAnnuler(List<Commande> historique) {
		
	}

	protected List<Commande> historique = new ArrayList();
	protected TERRAIN terrainChoisi = TERRAIN.AUCUN;
	public void notifierClicTerrain(TERRAIN nouveauTerrain) {
		Commande commande = new CommandeChoisirTerrain(terrainChoisi, nouveauTerrain);
		commande.executer(); //VuePvZanor.getInstance().afficherTerrain(terrain);
		
		historique.add(commande);
		this.terrainChoisi = nouveauTerrain;
		
		
		jardin.setTerrain(nouveauTerrain);
		
		/*
		if (terrain == TERRAIN.ENTREE_JOUR)
			this.musique(1);
		if (terrain == TERRAIN.ENTREE_NUIT)
			this.musique(2);
		if (terrain == TERRAIN.PISCINE_JOUR)
			this.musique(3);
		if (terrain == TERRAIN.PISCINE_NUIT)
			this.musique(4);
		if (terrain == TERRAIN.TOIT_JOUR)
			this.musique(5);
		if (terrain == TERRAIN.TOIT_NUIT)
			this.musique(6);
		 */
	}

}
