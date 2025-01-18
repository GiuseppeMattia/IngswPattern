package org.example.ingsw.factories;

import org.example.ingsw.factories.abstractfactories.Factory;
import org.example.ingsw.products.abstractproducts.Sofa;
import org.example.ingsw.products.abstractproducts.Table;
import org.example.ingsw.products.chair.VictorianChair;
import org.example.ingsw.products.sofa.VictorianSofa;
import org.example.ingsw.products.table.VictorianTable;

public class VictorianFactory implements Factory {


    @Override
    public VictorianChair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }


}
