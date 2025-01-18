package org.example.ingsw.products.sofa;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import org.example.ingsw.products.abstractproducts.Sofa;

public class NormalSofa implements Sofa {

    private Image image;
    private ImageView imageView;

    public NormalSofa() {
        image = new Image(getClass().getResource("/org/example/ingsw/images/normalsofa.png").toExternalForm());

        imageView = new ImageView(this.image);
        imageView.setFitHeight(200);
        imageView.setFitWidth(400);
        imageView.setLayoutX(325);
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
