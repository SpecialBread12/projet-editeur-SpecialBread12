package modele;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class BadgeCommunisme extends AnchorPane {
	public BadgeCommunisme() {
		this.setPrefHeight(200);
		this.setPrefWidth(166);
		this.setStyle("-fx-background-color: white;");
		
		ImageView badge = new ImageView();
		badge.setImage(new Image("badge.png"));
		this.getChildren().add(badge);
		
		ImageView communisme = new ImageView();
		communisme.setImage(new Image("commi.png"));
		communisme.setLayoutX(75);
		communisme.setLayoutY(30);
		this.getChildren().add(communisme);
		
		ImageView irak = new ImageView();
		irak.setImage(new Image("irak.png"));
		irak.setLayoutX(75);
		irak.setLayoutY(165);
		this.getChildren().add(irak);
		
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
		

	}
}
