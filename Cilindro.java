import java.util.Scanner;

public class Cilindro {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
    
        
        double altura,radio,areaBase;
        double perimetroBase,areaLateral,areaTotal,volumen;
        
        System.out.print("Digite la altura del cilindro: ");
        altura = lector.nextDouble();
        System.out.print("Digite el radio del cilindro:");
        radio=lector.nextDouble();

        perimetroBase=2*Math.PI*radio;
        areaLateral=perimetroBase*altura;
        areaBase = Math.PI*Math.pow(radio, 2);
        areaTotal=2*areaBase+areaLateral;
        volumen = areaBase*altura;
        
        
        System.out.println("Area lateral: " + areaLateral + " centimetro cuadradas.");
        System.out.println("Area total:" +areaTotal+ " centimetro cuadrado.");
        System.out.println("Volumen:"+volumen+"centimetro al cubo.");
        lector.close();


    }
}