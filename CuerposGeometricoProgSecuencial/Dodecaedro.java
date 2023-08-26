import java.util.Scanner;

public class  Dodecaedro{
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
        double arista,areaTotal,Volumen,Areapent,longitudLados,apotema;

        System.out.print("Digite la arista del Dodecadro: ");
        arista= lector.nextDouble();
        System.out.print("Digite la longitud de los lados:");
        longitudLados=lector.nextDouble();
        
     
        areaTotal=3*Math.pow(arista,2)*Math.sqrt(25+10*Math.sqrt(5));
        Volumen=1/4*15+7*Math.sqrt(5)*Math.pow(arista, 3);
        apotema = longitudLados / (2 * Math.tan(36));
        Areapent=5/2*arista*apotema;
      

        System.out.println("Area Total:"+areaTotal+"cuadrado");
        System.out.println("Volumen"+Volumen+"cubico");
        System.out.println("Areapent:"+Areapent+"cuadrado");
        
        lector.close();

    }
}