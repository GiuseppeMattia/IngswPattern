module org.example.ingsw {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ingsw to javafx.fxml;
    opens org.example.ingsw.controller to javafx.fxml;
    exports org.example.ingsw;
    exports org.example.ingsw.controller;
}