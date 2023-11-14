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
	
	public enum TYPE_CONTOUR{NORMAL, POLICE};
	public void setContour(TYPE_CONTOUR type) {
		switch(type) {
		case NORMAL:
			ImageView badge = new ImageView();
			badge.setImage(new Image("/vue/decoration/badge/badge.png"));
			this.getChildren().add(badge);
			break;
		case POLICE:
			ImageView badgePolice = new ImageView();
			badgePolice.setImage(new Image("/vue/decoration/badge/badge-police.png"));
			this.getChildren().add(badgePolice);
			break;
		default:
			System.out.println("ERROR");
			break;
		}
	}
	public enum TYPE_IMAGE_HAUT{COMMUNISME, NAZISME};
	public void setImageHaut(TYPE_IMAGE_HAUT type) {
		switch(type) {
		case COMMUNISME:
			ImageView communisme = new ImageView();
			communisme.setImage(new Image("/vue/decoration/badge/commi.png"));
			communisme.setLayoutX(75);
			communisme.setLayoutY(30);
			this.getChildren().add(communisme);
			break;
		case NAZISME:
			ImageView nazi = new ImageView();
			nazi.setImage(new Image("/vue/decoration/badge/nazi.png"));
			nazi.setLayoutX(75);
			nazi.setLayoutY(25);
			this.getChildren().add(nazi);
			break;
		default:
			System.out.println("ERROR");
			break;
		}
	}
	public enum TYPE_IMAGE_BAS{IRAK, ZIMBABUE};
	public void setImageBas(TYPE_IMAGE_BAS type) {
		switch(type) {
		case IRAK:
			ImageView irak = new ImageView();
			irak.setImage(new Image("/vue/decoration/badge/irak.png"));
			irak.setLayoutX(75);
			irak.setLayoutY(165);
			this.getChildren().add(irak);
			break;
		case ZIMBABUE:
			ImageView zimbabue = new ImageView();
			zimbabue.setImage(new Image("/vue/decoration/badge/zimbabue.png"));
			zimbabue.setLayoutX(70);
			zimbabue.setLayoutY(185);
			this.getChildren().add(zimbabue);
			break;
		default:
			System.out.println("ERROR");
			break;
		}
	}
	public enum TYPE_TEXT{ANTINAZI, OUI};
	public void setText(TYPE_TEXT type) {
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
		case OUI:
			Label mottoOui = new Label();
			mottoOui.setText("INDEED");
			mottoOui.setLayoutX(100);
			mottoOui.setLayoutY(185);
			mottoOui.setStyle("-fx-font: 25px Tahoma;");
			this.getChildren().add(mottoOui);
			break;
		default:
			System.out.println("ERROR");
			break;
		}
	}
	public Badge avecContour(TYPE_CONTOUR type) {
		this.setContour(type);
		return this;
	}
	public Badge avecImageHaut(TYPE_IMAGE_HAUT type) {
		this.setImageHaut(type);
		return this;
	}
	public Badge avecImageBas(TYPE_IMAGE_BAS type) {
		this.setImageBas(type);
		return this;
	}
	public Badge avecText(TYPE_TEXT type) {
		this.setText(type);
		return this;
	}
	
}
