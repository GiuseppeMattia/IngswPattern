package org.example.ingsw.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import org.example.ingsw.factories.ModernFactory;
import org.example.ingsw.factories.NormalFactory;
import org.example.ingsw.factories.VictorianFactory;
import org.example.ingsw.factories.abstractfactories.Factory;
import org.example.ingsw.products.abstractproducts.Chair;
import org.example.ingsw.products.abstractproducts.Sofa;
import org.example.ingsw.products.abstractproducts.Table;

public class PatternController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button modernButton;

    @FXML
    private Button normalButton;

    @FXML
    private Button victorianButton;

    private Factory factory;

    private Chair chair;
    private Sofa sofa;
    private Table table;

    @FXML
    void showModern(ActionEvent event) {
        clear();

        factory = new ModernFactory();

        chair = factory.createChair();
        sofa = factory.createSofa();
        table = factory.createTable();

        chair.show(anchorPane);
        sofa.show(anchorPane);
        table.show(anchorPane);
    }

    @FXML
    void showNormal(ActionEvent event) {
        clear();

        factory = new NormalFactory();

        chair = factory.createChair();
        sofa = factory.createSofa();
        table = factory.createTable();

        chair.show(anchorPane);
        sofa.show(anchorPane);
        table.show(anchorPane);
    }

    @FXML
    void showVictorian(ActionEvent event) {
        clear();

        factory = new VictorianFactory();

        chair = factory.createChair();
        sofa = factory.createSofa();
        table = factory.createTable();

        chair.show(anchorPane);
        sofa.show(anchorPane);
        table.show(anchorPane);
    }

    void clear(){
        if(chair != null)
            chair.hide();
        if(sofa != null)
            sofa.hide();
        if(table != null)
            table.hide();
    }

}
