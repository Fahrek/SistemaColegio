package sistemacolegio;

public class SistemaColegio {

    public static void main(String[] args) {
        SistemaColegio obj = new SistemaColegio();
        obj.run();
    }

    public void run() {
        Empleado p1 = new Profesor("Miguel", "Masculino");
        Empleado a1 = new Administrativo("Carlos", "Masculino");
    }
}
