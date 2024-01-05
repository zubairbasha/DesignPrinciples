module com.example.soliddesignprinciple {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.soliddesignprinciple to javafx.fxml;
    exports com.example.soliddesignprinciple;
}