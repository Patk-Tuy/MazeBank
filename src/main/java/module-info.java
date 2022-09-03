module com.jmc.mazebank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.jmc.mazebank to javafx.fxml;
    exports com.jmc.mazebank;
    exports com.jmc.mazebank.Controllers;
    exports com.jmc.mazebank.Controllers.Admin;
    exports com.jmc.mazebank.Controllers.Client;
    exports com.jmc.mazebank.Models;
    exports com.jmc.mazebank.Views;
}