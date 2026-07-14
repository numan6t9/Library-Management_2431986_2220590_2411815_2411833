module librarymanagement.librarymanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens librarymanagement.librarymanagement to javafx.fxml;
    exports librarymanagement.librarymanagement;
}