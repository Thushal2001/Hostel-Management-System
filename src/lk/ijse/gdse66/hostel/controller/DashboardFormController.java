package lk.ijse.gdse66.hostel.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.gdse66.hostel.util.DateAndTime;
import lk.ijse.gdse66.hostel.util.Random;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author : Kavithma Thushal
 * @project : Hostel-Management-System
 * @since : 11:37 PM - 8/24/2023
 **/
public class DashboardFormController implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private AnchorPane random;
    @FXML
    private Label lblHeader;
    @FXML
    private Label lblDate;
    @FXML
    private Label lblTime;
    private Random randomImages;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        DateAndTime.loadDateAndTime(lblDate, lblTime);
        randomImages = new Random(random);
    }

    @FXML
    private void studentsOnAction(ActionEvent actionEvent) throws IOException {
        root.getChildren().clear();
        root.getChildren().add(FXMLLoader.load(getClass().getResource("/lk/ijse/gdse66/hostel/view/manage_students_form.fxml")));
        lblHeader.setText("Manage Students");
    }

    @FXML
    private void roomsOnAction(ActionEvent actionEvent) throws IOException {
        root.getChildren().clear();
        root.getChildren().add(FXMLLoader.load(getClass().getResource("/lk/ijse/gdse66/hostel/view/manage_rooms_form.fxml")));
        lblHeader.setText("Manage Rooms");
    }

    @FXML
    private void reservationOnAction(ActionEvent actionEvent) throws IOException {
        root.getChildren().clear();
        root.getChildren().add(FXMLLoader.load(getClass().getResource("/lk/ijse/gdse66/hostel/view/manage_reservation_form.fxml")));
        lblHeader.setText("Reservation");
    }

    @FXML
    private void keyMoneyOnAction(ActionEvent actionEvent) throws IOException {
        root.getChildren().clear();
        root.getChildren().add(FXMLLoader.load(getClass().getResource("/lk/ijse/gdse66/hostel/view/manage_keymoney_form.fxml")));
        lblHeader.setText("Find Key Money");
    }

    @FXML
    private void userOnAction(ActionEvent actionEvent) throws IOException {
        root.getChildren().clear();
        root.getChildren().add(FXMLLoader.load(getClass().getResource("/lk/ijse/gdse66/hostel/view/manage_user_form.fxml")));
        lblHeader.setText("Manage User");
    }

    @FXML
    private void reportsOnAction(ActionEvent actionEvent) throws IOException {
        root.getChildren().clear();
        root.getChildren().add(FXMLLoader.load(getClass().getResource("/lk/ijse/gdse66/hostel/view/reports_form.fxml")));
        lblHeader.setText("Reports");
    }

    @FXML
    private void closeOnAction(MouseEvent mouseEvent) {
        System.exit(0);
    }
}
