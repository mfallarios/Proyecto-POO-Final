public abstract class Empleado {
    // 1. ENCAPSULAMIENTO: Atributos privados
    private String nombre;
    private String dni;
    private double salarioBase;

    // Constructor para inicializar objetos
    public Empleado(String nombre, String dni, double salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.salarioBase = salarioBase;
    }

    // 4. CLASE ABSTRACTA: Método que CADA hijo debe implementar de forma distinta
    public abstract double calcularSalarioFinal();

    // Métodos Getter y Setter (Encapsulamiento)
    public String getNombre() { return nombre; }

    public double getSalarioBase() { return salarioBase; }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase > 0) {
            this.salarioBase = salarioBase;
        }
    }
}
