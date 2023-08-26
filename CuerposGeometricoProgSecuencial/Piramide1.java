import java.util.Scanner;

public class  Piramide1 {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
        
        double altura,apotema,base,areaLateral,areaTotal,areaBase,volumen;
        
        System.out.print("Digite la  base de la piramide: ");
        base= lector.nextDouble();
     System.out.print("Digite altura de la piramide");
        altura=lector.nextDouble();
     
        apotema=Math.sqrt(Math.pow(altura, 2)+Math.pow(base/2, 2));
     areaLateral=4*base*altura/2;
     areaBase=Math.pow(base, 2);
     areaTotal=areaLateral+areaBase;
    volumen = areaBase*altura/3;
   
    System.out.println("Apotema:"+apotema+"cuadrado");
    System.out.println("Area lateral:"+areaLateral+"cuadrado");
    System.out.println("Area Total:"+areaTotal+"cuadrado");
    System.out.println("Volumen:"+volumen+"cubico");

        lector.close();
    }
}