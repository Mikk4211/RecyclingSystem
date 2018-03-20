package retur.pant;

public class Beregning {
  
  int     antalA = 0;
  int     antalB = 0;
  int     antalC = 0;

  private static Beregning instance = null; //Singleton Pattern. Bruger samme information i mere end en klasse.

  int     totalAntalPantsat = 0;
  double  totalPenge = 0;
  
  PantVærdi pantVærdi = new PantVærdi();

  protected Beregning(){ //Sikre mig at constructor ikke kan kaldes andre steder.

  }

  public static Beregning getInstance(){ // Sikre mig det altid er den samme instance der bliver brugt.
      if(instance==null){
          instance = new Beregning();
      }
      return instance;
  }
  
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
          antalC++;
      }
      totalAntalPantsat = antalA + antalB + antalC;
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

    public int getTotalAntalPantsat(){
        return
                totalAntalPantsat;
    }

    public double getTotalPenge(){
        return
                totalPenge;
    }


    void afslutPant(){
        antalA = 0;
        antalB = 0;
        antalC = 0;
        totalAntalPantsat = 0;
        totalPenge = 0;
    }













}
