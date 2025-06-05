package com.example.comp1011spring2025thursdays5pm;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CameraTableController {

    @FXML
    private TableView<CameraModel> tableView;


    @FXML
        private void initialize() {

        TableColumn<CameraModel, String> columnLens = new TableColumn<>("Column X");
        columnLens.setCellValueFactory(new PropertyValueFactory<>("lens"));

        TableColumn<CameraModel, String> columnColor = new TableColumn<>("Other Name");
        columnColor.setCellValueFactory(new PropertyValueFactory<>("color"));

        TableColumn<CameraModel, String> columniso = new TableColumn<>("iso");
        columniso.setCellValueFactory(new PropertyValueFactory<>("iso"));

        TableColumn<CameraModel, String> columnResolution = new TableColumn<>("Resolution");
        columnResolution.setCellValueFactory(new PropertyValueFactory<>("resolution"));

        TableColumn<CameraModel, String> columnModel = new TableColumn<>("Model");
        columnModel.setCellValueFactory(new PropertyValueFactory<>("model"));

        TableColumn<CameraModel, String> columnCompanies = new TableColumn<>("Companies");
        columnCompanies.setCellValueFactory(new PropertyValueFactory<>("companies"));

        tableView.getColumns().add(columnLens);
        tableView.getColumns().add(columnColor);
        tableView.getColumns().add(columniso);
        tableView.getColumns().add(columnResolution);
        tableView.getColumns().add(columnModel);
        tableView.getColumns().add(columnCompanies);


        tableView.getItems().addAll(CameraModel.populateCameraList());
    }
}
