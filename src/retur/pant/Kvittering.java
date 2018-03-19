package retur.pant;

public class Kvittering {

//Metode til udskriver til txt fil af alle studerende og alt deres informtion
    public void getPrint() {

        if (file.exists()) { // tjekker om hvorvidt txt filen allerede er lavet.
            file.delete(); // Sletter txt fil såfremt den allerede er lavet, så en ny med frisk information kan printes.
            System.out.println("\nFil til udskrift eksistere allerede. Forbereder overskrivning......"); //Fortæller at txt allerede var lavet, men at den slettes så en ny kan laves.
        }

        try (
                // Create a file
                java.io.PrintWriter output = new java.io.PrintWriter(file); // laver en ny Writer ved navn output.

        ) {
            // Her bliver min Metode allStufull som indeholder alt information på alle studerende udskrevet til studerende.txt
            ArrayList<Studerende> temp = allStuFull(true);
            int i, k;
            for(i=0; i<temp.size(); i++){
                for (k=0; k<temp.get(i).hentData(true).size(); k++){
                    output.print(temp.get(i).hentData(true).get(k));
                }
            }
            //output.print(allStuFull()); /// Hvad gør jeg her???????????????????????

            System.out.println("Information nu udskrevet til studerende.txt. "); //fortæller hvis det lykkedes at udskriver til txt.
            output.close(); // For at sikre det åbne dokument er lukket igen. Således det ikke skaber problemer.

        }
        catch(FileNotFoundException ex){ // påtvunget for at køre Writer funktionen.
            System.out.println("Der opstod en fejl ved udskrift af studerende.");// fortæller i konsol såfremt der er fejl ved at udskriver til txt.

        }

}
