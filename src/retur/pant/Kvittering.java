package retur.pant;

public class Kvittering {
  
  java.io.File file = new java.io.File("txt/kvittering.txt");
        if (file.exists()) { //Tjekker om der allerede ligger en kvittering.
            file.delete(); // Såfremt der allerede var en kvittering, slettes denne således ny kan laves til pant kunde.
            System.exit(0); // Efter filen er slettet lukkes dette if loop.
        }

        try (
                // Create a file
                java.io.PrintWriter output = new java.io.PrintWriter(file);
        ) {
            /* Indsættelse af værdier til .txt
            */
            output.print("text");
            // Måske arraylist?

            System.out.println("Kvittering lavet");
            output.close();

        }


}
