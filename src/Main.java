import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner x = new Scanner(System.in);

        System.out.println("Ingrese el nommbre del estudiante");
        String nombre = x.next();
        System.out.print("Ingrese el dia de su nacimiento");
        int dia = x.nextInt();
        System.out.print("Ingrese el mes de su nacimiento");
        int mes = x.nextInt();
        System.out.print("Ingrese el año de su nacimiento");
        int año = x.nextInt();
        System.out.println("Ingrese la nota de la primera materia");
        double nota1 = x.nextInt();
        System.out.println("Ingrese la nota de la segunda materia");
        double nota2 = x.nextInt();
        System.out.println("Ingrese la nota de la tercera materia");
        double nota3 = x.nextInt();

        LocalDate fechaN = LocalDate.of(año, mes,dia);

        
          estudiante sebastian = new estudiante(nombre,fechaN);

          sebastian.setNotaMateria1(nota1);
          sebastian.setNotaMateria2(nota2);
          sebastian.setNotaMateria3(nota3);

        System.out.println("Nombre: " + sebastian.getNombre());
        System.out.println("Edad: " + sebastian.getEdad());
        System.out.println("Promedio: " + sebastian.getPromedio());

    }
}