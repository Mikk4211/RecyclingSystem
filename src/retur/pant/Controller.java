package retur.pant;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

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
}
