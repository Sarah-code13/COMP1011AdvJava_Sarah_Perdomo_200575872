package com.example.comp1011spring2025thursdays5pm;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;


public class StudentViewController  {

    @FXML
    private TableView<Student> tableView;

    @FXML
    private TableColumn<Student, Integer> studentNumCol;

    @FXML
    private TableColumn<Student, String> firstNameCol;

    @FXML
    private TableColumn<Student, String> lastNameCol;

    @FXML
    private TableColumn<Student, String> telephoneCol;

    @FXML
    private TableColumn<Student, String> addressCol;

    @FXML
    private TableColumn<Student, String> provinceCol;

    @FXML
    private TableColumn<Student, Integer> avgGradeCol;

    @FXML
    private TableColumn<Student, String> majorCol;

    @FXML
    private CheckBox ontarioCheckBox;

    @FXML
    private Label numOfStudentsLabel;

    @FXML
    private CheckBox honourRollCheckBox;

    @FXML
    private ComboBox<String> areaCodeComboBox;

    private ObservableList<Student> students = FXCollections.observableArrayList();
    @FXML
    private void applyFilter()  {
    }

    @FXML
    void initialize() {
        areaCodeComboBox.getItems().add("All");

        studentNumCol.setCellValueFactory(new PropertyValueFactory<>("studentNum"));
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        telephoneCol.setCellValueFactory(new PropertyValueFactory<>("telephone"));
        addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        provinceCol.setCellValueFactory(new PropertyValueFactory<>("province"));
        avgGradeCol.setCellValueFactory(new PropertyValueFactory<>("avgGrade"));
        majorCol.setCellValueFactory(new PropertyValueFactory<>("major"));

        loadStudents();
        updateStudentCountLabel();
        populateAreas();


    }
    private void loadStudents() {
        String database = "Select studentNum, firstName, lastName, telephone, address, province, avgGrade, major from students";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://172.31.22.43:3306/Sarah200575872", "Sarah200575872", "j4IUJJiMim");
             PreparedStatement statement = conn.prepareStatement(database);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Student student = new Student(
                        resultSet.getInt("studentNum"),
                        resultSet.getString("firstName"),
                        resultSet.getString("lastName"),
                        resultSet.getInt("telephone"),
                        resultSet.getString("address"),
                        resultSet.getString("province"),
                        resultSet.getInt("avgGrade"),
                        resultSet.getString("major")
                );
                students.add(student);

            }
            tableView.setItems(students);

        }
        catch (SQLException e) {
            e.getErrorCode();
        }
    }
    private void populateAreas() {
        Set<String> areaCodes = new HashSet<>();

        for (Student student : students) {
            int phone = student.getStudentPhoneNumber();
            if (phone != null && phone.length() >= 3) {
                String areaCode = phone.subtring(0, 3);
                areaCodes.add(areaCode);
            }
        }
        areaCodeComboBox.getItems().addAll(areaCodes);
    }
    private void updateStudentCountLabel() {
        numOfStudentsLabel.setText("Number of students: " + tableView.getItems().size());
    }
}
