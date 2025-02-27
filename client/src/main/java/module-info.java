module ac.il.haifa.cs.sweng.client {
    requires javafx.controls;
    requires javafx.fxml;


    opens ac.il.haifa.cs.sweng.client to javafx.fxml;
    exports ac.il.haifa.cs.sweng.client;
}