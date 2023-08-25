import java.util.Scanner;

public class  Cono{
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
        double radio,altura,generatriz,areaLateral,areaTotal,areaBase,volumen;

        System.out.print("Digite la altura del cono: ");
        altura= lector.nextDouble();
        System.out.print("Digite el radio del cilindro:");
        radio=lector.nextDouble();

        generatriz=Math.sqrt(Math.pow(radio,2)+Math.pow(altura,2));

        areaLateral = Math.PI*radio*generatriz;
        areaBase = Math.PI*Math.pow(radio,2);
        areaTotal=areaLateral+areaBase;
        volumen= areaBase*altura/3;
        
        System.out.println("generatriz:"+generatriz);
        System.out.println("Area lateral: " + areaLateral + " centimetro cuadradas.");
        System.out.println("Area total:" +areaTotal+ " centimetro cuadrado.");
        System.out.println("Volumen:"+volumen+"centimetro al cubo.");
        lector.close();

    }
}