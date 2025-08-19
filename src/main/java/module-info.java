module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires javafx.graphics;
    requires static lombok;
    requires java.sql;

    opens com.app.javafx to javafx.fxml;

    exports com.app.javafx.application;
    opens com.app.javafx.application to javafx.fxml;
    exports com.app.javafx.gui;
    opens com.app.javafx.gui to javafx.fxml;
    opens com.app.javafx.model.entities to javafx.base;

}