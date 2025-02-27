module org.example.finalproject1 {
    requires javafx.controls;
    requires javafx.fxml;
    //requires java.transaction.xa;
    //requires jakarta.transaction;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;


    opens org.example.finalproject1 to javafx.fxml;
    exports org.example.finalproject1;
}