interface Volador {
    void volar();
}

class Pajaro implements Volador {
    public void volar() {
        System.out.println("El pájaro vuela");
    }
}

class Avion implements Volador {
    public void volar() {
        System.out.println("El avión vuela");
    }
}

public class Main {
    public static void main(String[] args) {
        Volador[] objetosVoladores = {new Pajaro(), new Avion()};
        for (Volador v : objetosVoladores) {
            v.volar(); // Polimorfismo con interfaz
        }
    }
}
