import java.util.Scanner;

public class  ZonaEsferica{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        double radio,Areazonaesferica;
        double Radio,altura,Volumenzonaesferica,radiosuperior;

        System.out.print("Digite el radio de la esfera: ");
        radio= lector.nextDouble();
        System.out.print("Digite el Radio Mayor:");
        Radio=lector.nextDouble();
        System.out.print("Digite la altura:");
        altura = lector.nextDouble();
        System.out.print("Digite radio superior:");
        radiosuperior=lector.nextDouble();

        Areazonaesferica=2*Math.PI*Radio*altura;
        Volumenzonaesferica=Math.PI*altura*Math.pow(altura,2)+3*Math.pow(radio,2)+3*Math.pow(radiosuperior, 2)/6;
        
        System.out.println("Areazonaesferica:"+Areazonaesferica+"cuadrado");
        System.out.println("Volumenzonaesferica:"+Volumenzonaesferica+"cubico");
        
        lector.close();
        
    }
}