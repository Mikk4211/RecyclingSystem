package retur.pant;

import java.io.FileNotFoundException;

public class Kvittering {

    Beregning calc = new Beregning();
  
  public void getPrint() { //Metode til at lave kvittering til txt fil.
  
  java.io.File file = new java.io.File("txt/kvittering.txt");
        if (file.exists()) { //Tjekker om der allerede ligger en kvittering.
            file.delete(); // Såfremt der allerede var en kvittering, slettes denne således ny kan laves til pant kunde.
            System.exit(0); // Efter filen er slettet lukkes dette if loop.
        }

        try (
                // Create a file
                java.io.PrintWriter output = new java.io.PrintWriter(file);
        ) {
          
            /* Indsættelse af værdier til .txt fil.
            Kan ikke bruge output.print eller println da den kun tager imod "text".
            Tænker derfor værdier skal smides ind i et arraylist, og så køre arraylisten igennem.
            
            Måske noget lign:
            
            ArrayList<Kvit> temp = printKvit(true);
            int i, k;
            for(i=0; i<temp.size(); i++){
                for (k=0; k<temp.get(i).kvitData(true).size(); k++){
                    output.print(temp.get(i).kvitData(true).get(k));
                }
            */
          
            calc.getAntalA();
            calc.getAntalB();
            calc.getAntalC();
            calc.getTotalPenge();
            output.write("FUCK");
            // Måske arraylist?

            System.out.println("Kvittering lavet");
            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

  }

  public void getKvit() {
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
