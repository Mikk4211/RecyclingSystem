package retur.pant;

import com.sun.jndi.ldap.Ber;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
    @FXML
    private Label lbl_penge;
    @FXML
    private Label lbl_antal;


    Beregning cyka = Beregning.getInstance(); //Henter min ene instance af Beregning.
    Kvittering kvit = new Kvittering();


    /**
     * Metode der afhænger af ActionEvent e, og der afgører hvad der sker når man trykker på knapperne i GUI'en.
     */
    @FXML
    private void handleButtonAction(ActionEvent e) {
        //sqlStatement.useDB();


        if (e.getSource() == btn_pant1) { // Håndtering af GUI Knap for pant type A
            System.out.println("Pant 1");
            cyka.tilføjPant(EnumPant.PANTA);
            lbl_penge.setText(cyka.totalPenge + ",-");
            lbl_antal.setText(cyka.totalAntalPantsat + " stk");
                        
        }
        
        if (e.getSource() == btn_pant2) { // Håndtering af GUI Knap for pant type B
            System.out.println("Pant 2");
            cyka.tilføjPant(EnumPant.PANTB);
            lbl_penge.setText(cyka.totalPenge + ",-");
            lbl_antal.setText(cyka.totalAntalPantsat + " stk");
        }
        
        if (e.getSource() == btn_pant3) { // Håndtering af GUI Knap for pant type C
            System.out.println("Pant 3");
            cyka.tilføjPant(EnumPant.PANTC);
            lbl_penge.setText(cyka.totalPenge + ",-");
            lbl_antal.setText(cyka.totalAntalPantsat + " stk");
        }
        
        if (e.getSource() == btn_end) { // Håndtering af GUI Knap for afslut
            System.out.println("Afslut. Antal penge + antal i alt. bla bla something.");
            kvit.getKvit();
            kvit.getPrint();
            cyka.afslutPant();
            lbl_penge.setText(cyka.totalPenge + ",-");
            lbl_antal.setText(cyka.totalAntalPantsat + " stk");
            //SQL statement til at overføre antal pantA, pantB, pantC til DB.
            //Tænker Writer funktion til at smide sout i en txt fil.
            //klasse(værdi).resetfunktionNoget?
           
        }
    }
}
