package org.example.ingsw.products.chair;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import org.example.ingsw.products.abstractproducts.Chair;

public class NormalChair implements Chair {
    private Image image;
    private ImageView imageView;

    public NormalChair() {
        image = new Image(getClass().getResource("/org/example/ingsw/images/normalchair.png").toExternalForm());

        imageView = new ImageView(this.image);
        imageView.setFitHeight(200);
        imageView.setFitWidth(150);
        imageView.setLayoutX(100);
        imageView.setLayoutY(420);
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
