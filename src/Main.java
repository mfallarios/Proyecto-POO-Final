//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase hija
        EmpleadoVendedor vendedor = new EmpleadoVendedor("Juan Perez", "12345678", 1500.0, 5000.0, 0.10);

        // Mostramos los datos usando los getters (Encapsulamiento)
        System.out.println("Empleado: " + vendedor.getNombre());

        // El resultado de este cálculo debe ser: 1500 + (5000 * 0.10) = 2000
        System.out.println("Salario Final: S/ " + vendedor.calcularSalarioFinal());
    }
}