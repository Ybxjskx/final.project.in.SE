module org.example.finalproject1.server {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires jakarta.persistence;


    opens org.example.finalproject1.server to javafx.fxml;
    exports org.example.finalproject1.server;
}