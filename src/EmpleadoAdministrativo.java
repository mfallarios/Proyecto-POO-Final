public class EmpleadoAdministrativo extends Empleado {
    private double bonoMetas;

    public EmpleadoAdministrativo(String nombre, String dni, double salarioBase, double bonoMetas) {
        super(nombre, dni, salarioBase);
        this.bonoMetas = bonoMetas;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + bonoMetas;
    }
}
