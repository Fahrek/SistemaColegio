package sistemacolegio;

public class Mantenimiento extends Empleado {

    public Mantenimiento(String nombre, String sexo) {
        super(nombre, sexo);
    }

    public Mantenimiento(String nombre, int edad, String direccion, double sueldo, int aServicio, String sexo) {
        super(nombre, edad, direccion, sueldo, aServicio, sexo);
    }

    @Override
    public double getSueldoFinal() {
        return sueldo;
    }
}
