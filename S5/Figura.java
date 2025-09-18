// Clase abstracta
abstract class Figura {
    protected String color;
    
    // Constructor
    public Figura(String color) {
        this.color = color;
    }
    
    // Método abstracto
    public abstract double calcularArea();
    
    // Método concreto
    public String getColor() {
        return color;
    }
}

// Subclases concretas
class Circulo extends Figura {
    private double radio;
    
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return base * altura;
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo("Rojo", 5.0);
        Figura rectangulo = new Rectangulo("Azul", 4.0, 6.0);
        
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}
