public class Main {
    public static void main(String[] args) {
        // 3. IMPLEMENTACIÓN DE POLIMORFISMO
        // Creamos un arreglo de la clase abstracta pero con instancias de clases hijas
        Empleado[] nomina = new Empleado[2];

        nomina[0] = new EmpleadoVendedor("Juan Perez", "12345678", 1200.0, 5000.0, 0.10);
        nomina[1] = new EmpleadoAdministrativo("Ana Gomez", "87654321", 1500.0, 300.0);

        System.out.println("--- REPORTE DE NÓMINA ---");

        for (Empleado emp : nomina) {
            // Aquí se aplica el polimorfismo:
            // el método se llama igual, pero hace cosas distintas según el objeto.
            System.out.println("Empleado: " + emp.getNombre());
            System.out.println("DNI: " + emp.getDni());
            System.out.println("Monto total a depositar: S/ " + emp.calcularSalarioFinal());
            System.out.println("-------------------------");
        }
    }
}