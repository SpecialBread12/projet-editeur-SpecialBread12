package modele;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Badge extends AnchorPane {
	public Badge() {
		this.setPrefHeight(200);
		this.setPrefWidth(166);
	}
	
	public enum TYPE_CONTOUR{NORMAL};
	public void afficherContour(TYPE_CONTOUR type) {
		switch(type) {
		case NORMAL:
			ImageView badge = new ImageView();
			badge.setImage(new Image("badge.png"));
			this.getChildren().add(badge);
			break;
		default:
			System.out.println("ERROR");
			break;
		}
	}
	public enum TYPE_IMAGE_HAUT{COMMUNISME, NAZISME};
	public void afficherImageHaut(TYPE_IMAGE_HAUT type) {
		switch(type) {
		case COMMUNISME:
			ImageView communisme = new ImageView();
			communisme.setImage(new Image("commi.png"));
			communisme.setLayoutX(75);
			communisme.setLayoutY(30);
			this.getChildren().add(communisme);
			break;
		case NAZISME:
			ImageView nazi = new ImageView();
			nazi.setImage(new Image("nazi.png"));
			nazi.setLayoutX(90);
			nazi.setLayoutY(35);
			this.getChildren().add(nazi);
			break;
		default:
			System.out.println("ERROR");
			break;
		}
	}
	public enum TYPE_IMAGE_BAS{IRAK};
	public void afficherImageBas(TYPE_IMAGE_BAS type) {
		switch(type) {
		case IRAK:
			ImageView irak = new ImageView();
			irak.setImage(new Image("irak.png"));
			irak.setLayoutX(75);
			irak.setLayoutY(165);
			this.getChildren().add(irak);
			break;
		default:
			System.out.println("ERROR");
			break;
		}
	}
	public enum TYPE_TEXT{ANTINAZI};
	public void afficherText(TYPE_TEXT type) {
		switch(type) {
		case ANTINAZI:
			Label motto1 = new Label();
			motto1.setText("Faire face");
			motto1.setLayoutX(100);
			motto1.setLayoutY(185);
			motto1.setStyle("-fx-font: 25px Tahoma;");
			this.getChildren().add(motto1);
			
			Label motto2 = new Label();
			motto2.setText("Au Nazi");
			motto2.setLayoutX(110);
			motto2.setLayoutY(265);
			motto2.setStyle("-fx-font: 25px Tahoma;");
			this.getChildren().add(motto2);
			break;
		default:
			System.out.println("ERROR");
			break;
		}
	}
	
}
