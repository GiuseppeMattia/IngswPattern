package org.example.ingsw.factories;

import org.example.ingsw.factories.abstractfactories.Factory;
import org.example.ingsw.products.abstractproducts.Chair;
import org.example.ingsw.products.abstractproducts.Sofa;
import org.example.ingsw.products.abstractproducts.Table;
import org.example.ingsw.products.chair.NormalChair;
import org.example.ingsw.products.sofa.NormalSofa;
import org.example.ingsw.products.table.NormalTable;

public class NormalFactory implements Factory {
    @Override
    public Chair createChair() {
        return new NormalChair();
    }

    @Override
    public Sofa createSofa() {
        return new NormalSofa();
    }

    @Override
    public Table createTable() {
        return new NormalTable();
    }
}
