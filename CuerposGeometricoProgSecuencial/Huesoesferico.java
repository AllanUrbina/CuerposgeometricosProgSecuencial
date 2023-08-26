import java.util.Scanner;

public class Huesoesferico{
    public static void main(String[]args){
        Scanner lector =new Scanner(System.in);
        
        double radio,Area,angulo,volumen;

        System.out.print("Digite el Radio");
        radio=lector.nextDouble();
        System.out.print("Digite el angulo");
        angulo=lector.nextDouble();
        
     Area = Math.PI*Math.pow(radio,2)*angulo/90;
     volumen=Math.PI*Math.pow(radio,3)*angulo/270;

     System.out.println("El area del Hueso esferico es:"+Area+"al cuadrado");
     System.out.println("EL volumen de la cuña esferica es:"+volumen+"cubico");
 
      lector.close();
    }
}