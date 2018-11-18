package sistemacolegio;

public class Profesor extends Empleado {

    private String titulo;
    private int nEstudiantes;

    public Profesor(String nombre, String sexo) {
        super(nombre, sexo);
    }

    public Profesor(String titulo, int nEstudiantes, String nombre, String sexo) {
        super(nombre, sexo);
        this.titulo = titulo;
        this.nEstudiantes = nEstudiantes;
    }

    public Profesor(String titulo, int nEstudiantes, String nombre, int edad, String direccion, double sueldo, int aServicio, String sexo) {
        super(nombre, edad, direccion, sueldo, aServicio, sexo);
        this.titulo = titulo;
        this.nEstudiantes = nEstudiantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnEstudiantes() {
        return nEstudiantes;
    }

    public void setnEstudiantes(int nEstudiantes) {
        this.nEstudiantes = nEstudiantes;
    }

    @Override
    public double getSueldoFinal() {
        if (nEstudiantes > 39) {
            return sueldo * Constantes.P_PROF;
        } else {
            return sueldo;
        }
    }
}
