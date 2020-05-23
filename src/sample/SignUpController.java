package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField signUpLastName;

    @FXML
    private TextField login_field;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    private TextField signUpCountry;

    @FXML
    void initialize() {

        signUpButton.setOnAction(actionEvent -> {

            signUpNewUser();
            
        });
    }

    private void signUpNewUser() {
        DatabaseHadler dbHadler = new DatabaseHadler();

        String firstName = signUpName.getText();
        String lastName  = signUpLastName.getText();
        String userName  = login_field.getText();
        String password  = password_field.getText();
        String location  = signUpCountry.getText();
        String gender  = "";
        if (signUpCheckBoxMale.isSelected())
            gender ="Мужской";
        else
            gender = "Женский";
        User user = new User(firstName, lastName, userName, password, location, gender);

        dbHadler.signUpUser(user);
    }
}
