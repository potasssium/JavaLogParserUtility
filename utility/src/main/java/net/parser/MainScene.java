package net.parser;

import java.io.File;
import java.lang.classfile.Label;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Window;

public class MainScene {

    @FXML
    private TextArea largeTextBox;

    @FXML
    private MenuItem importItem;

    @FXML
    private MenuItem exportItem;


    @FXML
    public void initialize() {
        largeTextBox.setText("logs here");
        importItem.setOnAction(e -> handleImport());
        exportItem.setOnAction(e -> handleExport());
    }

    private void handleImport() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Import Log File");
        File file = fileChooser.showOpenDialog(getWindow());
        if (file != null) {
            largeTextBox.setText("Imported: " + file.getAbsolutePath());
            // You can add file reading logic here
        }
    }

    private void handleExport() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Export Log File");
        File file = fileChooser.showSaveDialog(getWindow());
        if (file != null) {
            // You can add file writing logic here
            largeTextBox.setText("Exported to: " + file.getAbsolutePath());
        }
    }

    private Window getWindow() {
        return largeTextBox.getScene().getWindow();
    }

}