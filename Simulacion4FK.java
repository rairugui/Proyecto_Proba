public class Simulacion4FK
{
  int[] dados=new int[5];
  boolean[] lanzar=new boolean[5];
  int for_of_kind=0;
  
  //Metodo: Despues de lanzar verifica que dados se repiten mas
  void salvar(int intento_num)
  {
    int max_rep=0;
    int max_num=0;
    int repeticiones=0;
    //Cuenta cual cara cayo mas veces
    for(int c=0;c<5;c++)
    {
      repeticiones=0;
      for(int x=c;x<5;x++)
      {
        if(dados[c]==dados[x])
        {
          repeticiones++;
        }
        if(repeticiones>max_rep)
        {
          max_rep=repeticiones;
          max_num=dados[c];
        }
      }
    }
    //Bloquea la cara que mas veces salio
    //System.out.print(max_num+" "+max_rep+"\n");
    for(int reset=0;reset<5;reset++)
    {
      if(max_rep>1)
      {
        lanzar[reset]=((max_num!=dados[reset])&&max_rep!=1);
      }
      //System.out.print(lanzar[reset]+"_"+dados[reset]+"  ");
    }
    if(max_rep>=4&&intento_num==2)
    {
      for_of_kind++;
    }
    //System.out.print("\n");
  }
  
  //Metodo: Lanza dado si este tiene valor verdadero en lanzar
  void intento()
  {
    for(int c=0;c<5;c++)
    {
      if(lanzar[c])
      {
      dados[c]= (int) (Math.random() * 6);
      }
    }
  }
  
  //Meotodo: Simula un turno dado
  void turno()
  {
    //Cada inicio se marca verdadero para que se lancen dados
    for(int x=0;x<5;x++)
    {
      lanzar[x]=true;
    }
    //Intentos
    for(int c =0;c<3;c++)
    {
      intento();
      salvar(c);
    }
  }
  
  //Metodo: Simula 10 000 jugadas
  void simulacion()
  {
    for(int simulaciones=0;simulaciones<10000;simulaciones++)
    {
      turno();
      //System.out.print("\n");
    }
    System.out.print("\n\n\n"+for_of_kind+"\n\n\n");
  }
  public static void main(String [] args)
  {
    Simulacion4FK sim=new Simulacion4FK();
    sim.simulacion();
  }
}
