package org.example.ingsw.products.chair;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import org.example.ingsw.products.abstractproducts.Chair;

public class VictorianChair implements Chair {

    private Image image;
    private ImageView imageView;

    public VictorianChair() {
        image = new Image(getClass().getResource("/org/example/ingsw/images/victorianchair.png").toExternalForm());

        imageView = new ImageView(this.image);
        imageView.setFitHeight(200);
        imageView.setFitWidth(100);
        imageView.setLayoutX(100);
        imageView.setLayoutY(400);
        imageView.setPreserveRatio(false);
    }


    @Override
    public void show(AnchorPane pane) {
        pane.getChildren().add(imageView);
    }

    @Override
    public void hide() {
        imageView.setVisible(false);
    }
}
