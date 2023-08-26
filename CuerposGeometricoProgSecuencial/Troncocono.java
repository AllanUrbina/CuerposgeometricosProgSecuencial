import java.util.Scanner;

public class Troncocono{
    public static void main(String[]args){
        Scanner lector =new Scanner(System.in);
        
        double altura,Radiomayor,radiomenor,generatriz,base,areaLateral,areatotal,Volumen;

        System.out.print("Digite el radio menor");
        radiomenor=lector.nextDouble();
        System.out.print("Digite el radio mayor");
        Radiomayor=lector.nextDouble();
        System.out.print("Digite la altura");
        altura=lector.nextDouble();
     base=Radiomayor-radiomenor;
     generatriz=Math.sqrt(Math.pow(altura, 2)+Math.pow(base, 2));
     areaLateral=Math.PI*generatriz*(Radiomayor+radiomenor);
     areatotal=Math.PI*generatriz*(Radiomayor+radiomenor)+Math.PI*Math.pow(Radiomayor, 2)+Math.PI*Math.pow(radiomenor, 2);
     Volumen=1/3*Math.PI*altura*(Math.pow(Radiomayor, 2)+Math.pow(radiomenor, 2)+Radiomayor*radiomenor);

     System.out.println("EL Area Lateral es:"+areaLateral+"centimetro cuadrado");
     System.out.println("El Area Total es:"+areatotal+"centimetro cuadrado");
     System.out.println("El Volumen es:"+Volumen+"centimetro cubico");
     lector.close();

    }

}