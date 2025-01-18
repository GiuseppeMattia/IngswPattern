package org.example.ingsw.products.table;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import org.example.ingsw.products.abstractproducts.Table;

public class NormalTable implements Table {
    private Image image;
    private ImageView imageView;

    public NormalTable() {
        image = new Image(getClass().getResource("/org/example/ingsw/images/normaltable.png").toExternalForm());

        imageView = new ImageView(this.image);
        imageView.setFitHeight(150);
        imageView.setFitWidth(150);
        imageView.setLayoutX(750);
        imageView.setLayoutY(450);
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
