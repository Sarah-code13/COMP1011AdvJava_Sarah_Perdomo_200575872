package com.example.comp1011spring2025thursdays5pm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CameraController {

    @FXML
    private ComboBox<CameraModel> cbCameraList;

    @FXML
    private ComboBox<CameraModel.Companies> cbMake;

    @FXML
    private TextArea output;

    @FXML
    private TextField tstIso;

    @FXML
    private TextField txtColor;

    @FXML
    private TextField txtLens;

    @FXML
    private TextField txtModel;

    @FXML
    private TextField txtResolution;

    @FXML
    public void initialize() {
        cbMake.getItems().addAll(CameraModel.Companies.values());
    }
    @FXML
    void onSubmitCameraForm(ActionEvent event) {
        try {
            String lens = txtLens.getText();
            String color = txtColor.getText();
            double iso = Double.parseDouble(tstIso.getText());
            int resolution = Integer.parseInt(txtResolution.getText());
            String model = txtModel.getText();
            CameraModel.Companies make = cbMake.getValue();
            CameraModel camera = new CameraModel(lens, color, iso, resolution, model, make);
            cbCameraList.getItems().add(camera);
            String result = String.format("Lens: %s\n Color: %s\n Iso: %.1f\n Resolution: %d\n Model: %s\n Make: %s", camera.getLens(), camera.getColor(), camera.getIso(), camera.getResolution(), camera.getModel(), camera.getMake());
            output.setText(result);
            System.out.println("Submitted");
        } catch (Exception e) {
            output.setText(e.getMessage());
        }
    }

    @FXML
    void onSubmitCameraList(ActionEvent event) {

    }

}
