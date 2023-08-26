import java.util.Scanner;

public class  Tetraedro{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        double arista,Area,Altura,Volumen;

        System.out.print("Digite la arista : ");
        arista= lector.nextDouble();

        Area=Math.pow(arista,2)*Math.sqrt(3);
        Altura=arista*Math.sqrt(6)/3;
        Volumen=Math.sqrt(2)/12*Math.pow(arista,3);
       
        System.out.println("Area:"+Area+"cuadrado");
        System.out.println("Altura:"+Altura+"cuadrado");
        System.out.println("Volumen:"+Volumen+"cubico");
      lector.close();
    }
}