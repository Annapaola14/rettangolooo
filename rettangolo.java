public class rettangolo {
    float area;
    float base;
    float altezza;
    float perimetro;

    public rettangolo(){
    }

   public void perimetro(){
        perimetro= (base+altezza)*2;
        System.out.println("Il perimetro è " +perimetro);
   }


    public void area(){
        area= (base*altezza);
        System.out.println("l'area è " +area);
    }

}
