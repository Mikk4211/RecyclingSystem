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
  void tilføjPant(EnumType typer){
      if(typer == EnumType.pantA){
          totalPenge += pantVærdi.getPantA();
          antalA++;
      }
    
    if(typer == EnumType.pantB){
          totalPenge += pantVærdi.getPantB();
          antalB++;
      }
    
    if(typer == EnumType.pantC){
          totalPenge += pantVærdi.getPantC();
          antalB++;
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
