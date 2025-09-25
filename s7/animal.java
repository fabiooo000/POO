class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau!");
    }
}

class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Miau!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal miMascota1 = new Perro(); // Polimorfismo
        Animal miMascota2 = new Gato();  // Polimorfismo

        miMascota1.hacerSonido(); // Imprime: Guau!
        miMascota2.hacerSonido(); // Imprime: Miau!
    }
}
