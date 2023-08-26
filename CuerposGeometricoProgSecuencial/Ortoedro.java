import java.util.Scanner;

public class  Ortoedro{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        double altura,longitud,profundidad,Area,Volumen,Diagonal;

        System.out.print("Digite el radio  la altura: ");
        altura= lector.nextDouble();
        System.out.print("Digite la longitud:");
        longitud=lector.nextDouble();
        System.out.print("Digite la profundidad");
        profundidad = lector.nextDouble();

        Area=2*(altura*longitud+altura*profundidad+longitud*profundidad);
        Diagonal=Math.sqrt(Math.pow(altura,2)+Math.pow(longitud,2)+Math.pow(profundidad,2));
        Volumen=altura*longitud*profundidad;

       System.out.println("Area del Ortoedro es:"+Area+"Centimetro cuadrado");
       System.out.println("La diagonal del ortoedro es:"+Diagonal+"Centimetro cuadrado");
       System.out.println("El volumen del Ortoedro es:"+Volumen+"centimetro cubico");
        
     lector.close();
    }
}