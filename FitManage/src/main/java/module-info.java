module com.example.fitmanage {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fitmanage.smartgym to javafx.fxml;
    exports com.fitmanage.smartgym;
    exports com.fitmanage.smartgym.model;
    opens com.fitmanage.smartgym.model to javafx.fxml;
    exports com.fitmanage.smartgym.controller;
    opens com.fitmanage.smartgym.controller to javafx.fxml;
}