public class EmpleadoVendedor extends Empleado {
    // 1. ENCAPSULAMIENTO: Atributos propios privados
    private double ventasRealizadas;
    private double porcentajeComision;

    // 2. HERENCIA: Constructor que invoca al padre
    public EmpleadoVendedor(String nombre, String dni, double salarioBase, double ventas, double comision) {
        super(nombre, dni, salarioBase);
        this.ventasRealizadas = ventas;
        this.porcentajeComision = comision;
    }

    // 4. CLASE ABSTRACTA: Implementación obligatoria del método
    @Override
    public double calcularSalarioFinal() {
        // El salario final es el base + (ventas * comisión)
        return getSalarioBase() + (ventasRealizadas * porcentajeComision);
    }

    // Getters y Setters para los nuevos atributos (Encapsulamiento)
    public double getVentasRealizadas() { return ventasRealizadas; }
    public void setVentasRealizadas(double ventas) { this.ventasRealizadas = ventas; }

    public double getPorcentajeComision() { return porcentajeComision; }
    public void setPorcentajeComision(double comision) { this.porcentajeComision = comision; }
}
