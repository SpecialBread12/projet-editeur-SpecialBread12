package controleur;

import java.io.File;
import java.io.IOException;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import modele.Terrain;
import modele.Plantes;
import modele.Plantes.PLANTES;
import modele.Terrain.TERRAIN;
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
			VuePvZanor.getInstance().placerZombie(x, y, this.zombiesChoisi);
		}
		if (zombieBool == false) {
			VuePvZanor.getInstance().planterPlantes(x, y, this.plantesChoisi);
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
	


}
