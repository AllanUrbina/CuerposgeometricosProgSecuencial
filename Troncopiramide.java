import java.util.Scanner;

public class Troncopiramide{
    public static void main(String[]args){
        Scanner lector =new Scanner(System.in);
        
        double perimetrosuperior,perimetroinferior,altura,apotema,base,areaLateral,ladobasesuperior,ladobaseinferior,areatotal,volumen;

        System.out.print("Digite el perimetro superior");
        perimetrosuperior=lector.nextDouble();
        System.out.print("perimetro inferior");
        perimetroinferior=lector.nextDouble();
        System.out.print("Digite la altura");
        altura=lector.nextDouble();
        System.out.print("Digite lado base superior");
        ladobasesuperior=lector.nextDouble();
        System.out.print("Digite lado base inferior");
        ladobaseinferior=lector.nextDouble();
        
        base=perimetrosuperior-perimetroinferior;
        apotema=Math.sqrt(Math.pow(altura,2)+Math.pow(base,2));
        areaLateral=perimetrosuperior+perimetroinferior*apotema/2;
        areatotal= areaLateral+ladobasesuperior+ladobaseinferior;
        volumen= 1/3*altura*(ladobasesuperior+ladobaseinferior+Math.sqrt(ladobasesuperior+ladobaseinferior));

        System.out.println("Area Lateral:"+areaLateral+"Centimetro cuadrado");
        System.out.println("Area total:"+areatotal+"centimetro cuadrado");
        System.out.println("Volumen:"+volumen+"centimetro cubico");

        lector.close();







    }
}