package org.example.ingsw.products.sofa;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import org.example.ingsw.products.abstractproducts.Sofa;

public class VictorianSofa implements Sofa{

    private Image image;
    private ImageView imageView;

    public VictorianSofa() {
        image = new Image(getClass().getResource("/org/example/ingsw/images/victoriansofa.png").toExternalForm());

        imageView = new ImageView(this.image);
        imageView.setFitHeight(200);
        imageView.setFitWidth(300);
        imageView.setLayoutX(350);
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
