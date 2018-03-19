package retur.pant;

public class Beregning {
  
  int     antalA = 0;
  int     antalB = 0;
  int     antalC = 0;
  
  int     totalAntalPantsat = antalA + antalB + antalC;
  double  totalPenge = 0;
  
  PantVærdi pantVærdi = new PantVærdi();
  
  /*
  Metode afsnit til pantsatning af dåser/flasker.
  
  */
  void tilføjPant(EnumPant typer) {
      if (typer == EnumPant.PANTA) {
          totalPenge += pantVærdi.getPantA();
          antalA++;
      }

      if (typer == EnumPant.PANTB) {
          totalPenge += pantVærdi.getPantB();
          antalB++;
      }

      if (typer == EnumPant.PANTC) {
          totalPenge += pantVærdi.getPantC();
          antalB++;
      }

  }
    
    //Getters for samlet antal + penge for pant.
    public int getAntalA() {
        return antalA;
    }

    public int getAntalB() {
        return antalB;
    }

    public int getAntalC() {
        return antalC;
    }

    public double getTotalPenge(){
        return totalPenge;
    }













}
