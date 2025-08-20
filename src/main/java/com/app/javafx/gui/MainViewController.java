package com.app.javafx.gui;

import com.app.javafx.application.Main;
import com.app.javafx.gui.util.Alerts;
import com.app.javafx.model.entities.Department;
import com.app.javafx.model.services.DepartmentService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {

    @FXML
    private MenuItem menuItemSeller;

    @FXML
    private MenuItem menuItemDepartment;

    @FXML
    private MenuItem menuItemAbout;


    @FXML
    public void onMenuItemSellerAction() {
        System.out.println("onMenuItemSellerAction");
    }

    @FXML
    public void onMenuItemDepartmentAction() {
        loadView("/com/app/javafx/DepartmentListView.fxml",
        (DepartmentListController cont) -> {
            cont.setDepartmentService(new DepartmentService());
            cont.updateTableView();
        });
    }

    @FXML
    public void onMenuItemAboutAction() {
        loadView("/com/app/javafx/AboutView.fxml", x -> {});
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    private synchronized <T> void loadView(String absoluteName, Consumer<T> initializingAction){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVBox = fxmlLoader.load();
            Scene mainScene = Main.getMainScene();
            VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

            Node mainMenu = mainVBox.getChildren().get(0);
            mainVBox.getChildren().clear();
            mainVBox.getChildren().add(mainMenu);
            mainVBox.getChildren().addAll(newVBox.getChildren());

            T controller = fxmlLoader.getController();
            initializingAction.accept(controller);

        } catch (IOException e) {
            Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
        }
    }


}
