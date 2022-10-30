module com.example.java2022homework4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java2022homework4 to javafx.fxml;
    exports com.example.java2022homework4;
    exports com.example.java2022homework4.Inheritance;
    opens com.example.java2022homework4.Inheritance to javafx.fxml;
}