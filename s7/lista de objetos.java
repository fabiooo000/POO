import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());

        for (Animal a : animales) {
            a.hacerSonido(); // Se llama al método correcto según el tipo real
        }
    }
}
