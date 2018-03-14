package retur.pant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.sql.SQLException;

public class Controller {

    //Klargøre buttons fra scenebuilder til at blive brugt i java.
    @FXML
    private Button btn_pant1; // Første knap til "Cans and bottles less than 1 liter DKK 1,00"
    @FXML
    private Button btn_pant2; // Anden knap til "Bottles of plastic 0,5 liter DKK 1,50"
    @FXML
    private Button btn_pant3; // Tredje knap til "Cans and bottles more than 1 liter DKK 3,00"
    @FXML
    private Button btn_end; // Knap til at færdiggøre panting. Denne bruges også til at "printe" en kvittering.

    /**
     * Metode der afhænger af ActionEvent e, og der afgører hvad der sker når man trykker på knapperne i GUI'en.
     */
    @FXML
    private void handleButtonAction(ActionEvent e) throws SQLException {
        //sqlStatement.useDB();


        if (e.getSource() == btn_end) {
            System.out.println("Button End virker");
        }
    }
}
