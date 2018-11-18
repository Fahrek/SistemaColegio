package sistemacolegio;

public class Seguridad extends Empleado {

    private boolean jefe;
    private boolean nocturno;

    public Seguridad(boolean jefe, boolean nocturno, String nombre, String sexo) {
        super(nombre, sexo);
        this.jefe = jefe;
        this.nocturno = nocturno;
    }

    public Seguridad(boolean jefe, boolean nocturno, String nombre, int edad, String direccion, double sueldo, int aServicio, String sexo) {
        super(nombre, edad, direccion, sueldo, aServicio, sexo);
        this.jefe = jefe;
        this.nocturno = nocturno;
    }

    public boolean isJefe() {
        return jefe;
    }

    public void setJefe(boolean jefe) {
        this.jefe = jefe;
    }

    public boolean isNocturno() {
        return nocturno;
    }

    public void setNocturno(boolean nocturno) {
        this.nocturno = nocturno;
    }

    @Override
    public double getSueldoFinal() {
        if (nocturno) {
            return sueldo * Constantes.P_SEG;
        } else {
            return sueldo;
        }
    }
}
