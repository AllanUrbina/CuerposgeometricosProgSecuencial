import java.util.Scanner;

public class  Hexaedro{
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
        double arista,Diagonal,Volumen,Areadelacara,areaLateral,areaTotal;

        System.out.print("Digite la arista del Hexaedro ");
        arista= lector.nextDouble();
         
        Areadelacara= Math.pow(arista, 2);
        
        areaTotal=6*Math.pow(arista,2);
        Volumen=Math.pow(arista,3);
        Diagonal=arista*Math.sqrt(3);
        areaLateral=4*Areadelacara;
       
        System.out.println("Area Lateral"+areaLateral+"centimetro cuadrado");
        System.out.println("Arean Total :"+areaTotal+"cuadrado");
        System.out.println("Diagonal " + Diagonal + "cuadrado");
        System.out.println("Volumen:"+Volumen+"centimetro al cubo.");
    
    
    lector.close();
    }
}