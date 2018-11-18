package sistemacolegio;

public class Administrativo extends Empleado {

    public Administrativo(String nombre, String sexo) {
        super(nombre, sexo);
    }

    public Administrativo(String nombre, int edad, String direccion, double sueldo, int aServicio, String sexo) {
        super(nombre, edad, direccion, sueldo, aServicio, sexo);
    }

    @Override
    public double getSueldoFinal() {
        return sueldo * Constantes.P_ADMIN;
    }
}
