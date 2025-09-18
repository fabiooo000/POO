abstract class Empleado {
    protected String nombre;
    protected double salarioBase;
    
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    // Método abstracto
    public abstract double calcularSalario();
    
    // Método concreto
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: $" + calcularSalario());
    }
}

class EmpleadoTiempoCompleto extends Empleado {
    private double bono;
    
    public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }
    
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}

class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    
    public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularSalario() {
        return salarioBase * horasTrabajadas;
    }
}
