import java.util.Scanner;

public class Participante{
    private String Nombre;
    private int edad;
    private String sancion;

    public Participante(String Nombre, int edad,String sancion){
        this.Nombre=Nombre;
        this.edad=edad;
        this.sancion=sancion;
    }
    public void Examenes(){
        System.out.println("Se sometio a examenes medicos durante diciembre de 2023?");
    }
}
class atleta extends Participante{
    private String diciplina;

    public atleta(String Nombre, int edad, String sancion, String diciplina) {
        super(Nombre, edad, sancion);
        this.diciplina=diciplina;
    }
    public void evaluar(){
        System.out.println("Evaluacion de la aptitud de la atleta y su diciplina es: " + diciplina);
    }

}

class holder extends Participante{
    private String tipodeporte;

    public holder(String Nombre, int edad, String sancion, String tipodeporte) {
        super(Nombre, edad, sancion);
        this.tipodeporte=tipodeporte;
    }

    public void deporte(){
        System.out.println("Este es el tipo de deporte General" + tipodeporte);
    }
}

class Main{
    public static void main (String[]args){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese Su Nombre: ");
            String Nombre = scanner.next();
            System.out.println("Ingrese su Edad: ");
            int edad = Integer.parseInt(scanner.next());
            if(edad < 18){
                System.out.println("Eres muy joven para entrar en el sistema");

            }
            System.out.println("Ha tenido sanciones en el pasado: ");
            String sancion = scanner.next();
            if(sancion == "si"){
                System.out.println("No puede ingresar al sistemas");
            } else if (sancion == "no") {
                System.out.println("Bien hecho continua con el formulario");
            }
            System.out.println("Ingrese su diciplina: ");
            String diciplina = scanner.next();
            System.out.println("Ingrese su deporte(Futbol/Basket): ");
            String deporte = scanner.next();

            if ( deporte == "Futbol"){
                Participante participante1 = new Participante(Nombre,edad,sancion);
                participante1.Examenes();

            } else if ( deporte == "Basket") {
                Participante participante2 = new Participante(Nombre,edad,sancion);
                participante2.Examenes();
            }

        } catch (Exception e) {
            System.out.println("Error....");
        }

    }
}