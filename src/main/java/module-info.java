module com.wroblewskigk.mazebank {
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

    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires java.desktop;

    opens com.wroblewskigk.mazebank to javafx.fxml;
    exports com.wroblewskigk.mazebank;
    exports com.wroblewskigk.mazebank.Controllers;
    exports com.wroblewskigk.mazebank.Controllers.Admin;
    exports com.wroblewskigk.mazebank.Controllers.Client;
    exports com.wroblewskigk.mazebank.Models;
    exports com.wroblewskigk.mazebank.Views;
}