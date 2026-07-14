package librarymanagement.librarymanagement;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogInViewController
{
    @javafx.fxml.FXML
    private TextField enterUserId;
    @javafx.fxml.FXML
    private PasswordField enterPassword;
    @javafx.fxml.FXML
    private ComboBox<String> enterUserType;
    @javafx.fxml.FXML
    private TextField enterUserName;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void LogInButton(ActionEvent actionEvent) {
    }
}