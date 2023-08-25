import java.util.Scanner;

public class  Octaedro{
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
        double arista,areaTotal,Volumen;

        System.out.print("Digite la arista del octaedro ");
        arista= lector.nextDouble();
        
        areaTotal=2*Math.pow(arista,2)*Math.sqrt(3);
        Volumen=Math.sqrt(2)/3*Math.pow(arista,3);

        System.out.println("Area Total:"+areaTotal+"cuadrado");
        System.out.println("Volumen"+Volumen+"cubico");
    
        lector.close();
    }
}