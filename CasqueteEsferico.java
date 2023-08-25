import java.util.Scanner;

public class  CasqueteEsferico{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        double Areacasqueteesferico;
        double volumencasqueteesferico,Radio,altura;

        
        System.out.print("Digite el Radio Mayor:");
        Radio=lector.nextDouble();
        System.out.print("Digite la altura:");
        altura = lector.nextDouble();
        

        Areacasqueteesferico=2*Math.PI*Radio*altura;
        volumencasqueteesferico= Math.PI*Math.pow(altura, 2)*3*Radio-altura/3;
        
        System.out.println("Areacasqueteesferico:"+Areacasqueteesferico+"cuadrado");
        System.out.println("Volumencasqueteesferico:"+volumencasqueteesferico+"cubico");
        lector.close();
        
    }
}