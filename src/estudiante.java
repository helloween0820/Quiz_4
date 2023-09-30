import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/**
 * clase CuentaBancaria
 */
public class estudiante {
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;

    /****************************************************************************************************/
    /******************************************* CONSTRUCTORES ******************************************/
    /****************************************************************************************************/

    /**
     * Método constuctor para inicializar los atributos de la clase
     * @param nombre Número de la cuenta bancaria
     * @param fechaDeNacimiento Nombre del banco
     *
     * Complejidad temporal: O(1) Tiempo constante
     */

    public estudiante (String nombre, LocalDate fechaDeNacimiento){
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.notaMateria1 = 0.0;
        this.notaMateria2 = 0.0;
        this.notaMateria3 = 0.0;
    }

    // Métodos get y set para los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
    public void getFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }

    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }

    /**
     * Método que permite calcular la edad del estudiante
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public int getEdad() {

        LocalDate fechaActual = LocalDate.now();

        Period diferencia = Period.between(fechaDeNacimiento,fechaActual);
        int edad = diferencia.getYears();

        return edad;
    }
    /**
     * Método que permite calcular el promedio de notas del estudiante
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double getPromedio() {
        return (notaMateria1 + notaMateria2 + notaMateria3) / 3.0;
    }

}
