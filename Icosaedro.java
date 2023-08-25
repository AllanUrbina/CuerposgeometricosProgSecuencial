import java.util.Scanner;
public class Icosaedro{
public static void main (String []args){

Scanner lector=new Scanner(System.in);

double arista,areaTotal,Volumen;

System.out.print("Digite la arista del Icosaedro:");
arista=lector.nextDouble();

areaTotal=5*Math.pow(arista,2);
Volumen=5/12*3+Math.sqrt(5)*Math.pow(arista,3);

System.out.println("EL Area Total es igual a:"+areaTotal+"centrimetro cuadrado");
System.out.println("--------------------------------------------------------");
System.out.println("Volumen"+Volumen+"cubico");


System.out.println("Gracias");
lector.close();

}
}