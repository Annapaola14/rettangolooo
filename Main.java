public class Main {
    public static void main(String[] args) {
        float sommaAree;
        float sommaPerimetri;


        rettangolo giamma  =new rettangolo();
        rettangolo ria     =new rettangolo();
        rettangolo biffi   =new rettangolo();



        giamma.ridimensiona();
        ria.ridimensiona();
        biffi.ridimensiona();


        giamma.area();
        ria.area();
        biffi.area();


        sommaAree=giamma.area + ria.area + biffi.area;


        giamma.perimetro();
        ria.perimetro();
        biffi.perimetro();

        sommaPerimetri=giamma.perimetro + ria.perimetro + biffi.perimetro;


        System.out.println("" + sommaAree);
        System.out.println("" + sommaPerimetri);

        




    }
}