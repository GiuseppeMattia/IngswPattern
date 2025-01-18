package org.example.ingsw.factories.abstractfactories;

import org.example.ingsw.products.abstractproducts.Chair;
import org.example.ingsw.products.abstractproducts.Sofa;
import org.example.ingsw.products.abstractproducts.Table;

public interface Factory {

    public Chair createChair();

    public Sofa createSofa();

    public Table createTable();
}
