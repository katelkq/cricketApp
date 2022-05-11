module uk.ac.cam.kl559.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens uk.ac.cam.demo to javafx.fxml;
    exports uk.ac.cam.demo;
    exports uk.ac.cam.demo.controllers;
    opens uk.ac.cam.demo.controllers to javafx.fxml;
}