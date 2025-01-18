package org.example.ingsw.factories;

import org.example.ingsw.factories.abstractfactories.Factory;
import org.example.ingsw.products.abstractproducts.Chair;
import org.example.ingsw.products.abstractproducts.Sofa;
import org.example.ingsw.products.abstractproducts.Table;
import org.example.ingsw.products.chair.ModernChair;
import org.example.ingsw.products.sofa.ModernSofa;
import org.example.ingsw.products.table.ModernTable;

public class ModernFactory implements Factory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
