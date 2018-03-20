package retur.pant;

import java.io.FileNotFoundException;

public class Kvittering {

    Beregning calc = Beregning.getInstance(); //Henter min ene instance af Beregning.

    java.io.File file = new java.io.File("Udskrift/Kvittering.txt");

    //Metode til udskriver til txt fil af alle studerende og alt deres informtion
    public void getPrint() {

        if (file.exists()) { // tjekker om hvorvidt txt filen allerede er lavet.
            file.delete(); // Sletter txt fil såfremt den allerede er lavet, så en ny med frisk information kan printes.
        }

        try (
                // Create a file
                java.io.PrintWriter output = new java.io.PrintWriter(file); // laver en ny Writer ved navn output.

        ) {

            // Udskriver pant information til txt fil.
            output.println("");
            output.println("----------- KVITTERING -----------");
            output.println("");
            output.println("Antal Pant A: " + calc.getAntalA());
            output.println("Antal Pant B: " + calc.getAntalB());
            output.println("Antal Pant C: " + calc.getAntalC());
            output.println("Samlet har du pantet: " + calc.totalAntalPantsat + " Flasker/Dåser");
            output.println("");
            output.println("Din samlet pant bon lyder på: " + calc.totalPenge + ",-");

            output.close(); // For at sikre det åbne dokument er lukket igen. Således det ikke skaber problemer.

        }
        catch(FileNotFoundException ex){ // påtvunget for at køre Writer funktionen.
            System.out.println("Der opstod en fejl ved udskrift af kvittering.");// fortæller i konsol såfremt der er fejl ved at udskriver til txt.

        }

    }

  public void getKvit() {
      System.out.println("");
      System.out.println("----------- KVITTERING -----------");
      System.out.println("");
      System.out.println("Antal Pant A: " + calc.getAntalA());
      System.out.println("Antal Pant B: " + calc.getAntalB());
      System.out.println("Antal Pant C: " + calc.getAntalC());
      System.out.println("Samlet har du pantet: " + calc.totalAntalPantsat + " Flasker/Dåser");
      System.out.println("");
      System.out.println("Din samlet pant bon lyder på: " + calc.totalPenge + ",-");
  }


}
