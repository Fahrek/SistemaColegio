package sistemacolegio;

public abstract class Empleado {

    protected String nombre;
    protected int edad;
    protected String direccion;
    protected double sueldo;
    protected int aServicio;
    protected String sexo;

    public Empleado(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Empleado(String nombre, int edad, String direccion, double sueldo, int aServicio, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.sueldo = sueldo;
        this.aServicio = aServicio;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSueldoBase() {
        return sueldo;
    }

    public void setSueldoBase(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getaServicio() {
        return aServicio;
    }

    public void setaServicio(int aServicio) {
        this.aServicio = aServicio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public abstract double getSueldoFinal();
}
