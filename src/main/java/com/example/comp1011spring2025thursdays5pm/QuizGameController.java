package com.example.comp1011spring2025thursdays5pm;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;

public class QuizGameController {

    @FXML
    private Button btnSubmit;

    @FXML
    private ImageView imgAvatar;

    @FXML
    private RadioButton rbOption1;

    @FXML
    private RadioButton rbOption2;

    @FXML
    private RadioButton rbOption3;

    @FXML
    private RadioButton rbOption4;

    @FXML
    private Label txtCorrectAnswers;

    @FXML
    private Label txtNickname;

    @FXML
    private Label txtQuestion;

    @FXML
    private Label txtQuestionsRemaining;

    @FXML
    private Label txtTotalQuestions;
}
