import java.util.Scanner;

public class  Esfera{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        double radio,Area,Volumen,Areazonaesferica,Areacasqueteesferico;
        double volumencasqueteesferico,Radio,altura,Volumenzonaesferica,radiosuperior;

        System.out.print("Digite el radio de la esfera: ");
        radio= lector.nextDouble();
        System.out.print("Digite el Radio Mayor:");
        Radio=lector.nextDouble();
        System.out.print("Digite la altura:");
        altura = lector.nextDouble();
        System.out.print("Digite radio superior:");
        radiosuperior=lector.nextDouble();

        Area=4*Math.PI*Math.pow(radio,2 ) ;
        Volumen = 4/3 * Math.PI*Math.pow(radio, 3);
        Areazonaesferica=2*Math.PI*Radio*altura;
        Volumenzonaesferica=Math.PI*altura*Math.pow(altura,2+3*Math.pow(radio,2)+3*Math.pow(radiosuperior, 2))/6;
        Areacasqueteesferico=2*Math.PI*Radio*altura;
        volumencasqueteesferico= Math.PI*Math.pow(altura, 2)*3*Radio-altura/3;
        
        System.out.println("Area:"+Area+"cuadrado");
        System.out.println("Volumen:"+Volumen+"cubico");
        System.out.println("Areazonaesferica:"+Areazonaesferica+"cuadrado");
        System.out.println("Volumenzonaesferica:"+Volumenzonaesferica+"cuadrado");
        System.out.println("Areacasqueteesferico:"+Areacasqueteesferico+"cubico");
        System.out.println("Volumencasqueteesferico:"+volumencasqueteesferico+"cubico");
        lector.close();
        
    }
}