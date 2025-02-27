module ac.il.haifa.cs.sweng.entities {
    requires javafx.controls;
    requires javafx.fxml;


    opens ac.il.haifa.cs.sweng.entities to javafx.fxml;
    exports ac.il.haifa.cs.sweng.entities;
}