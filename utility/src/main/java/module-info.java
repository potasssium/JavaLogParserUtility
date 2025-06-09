module net.parser {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;
    requires javafx.base;

    opens net.parser to javafx.fxml;
    exports net.parser;
}
