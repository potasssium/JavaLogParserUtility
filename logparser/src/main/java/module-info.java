module net.logparser {
    requires javafx.controls;
    requires javafx.fxml;

    opens net.logparser to javafx.fxml;
    exports net.logparser;
}
