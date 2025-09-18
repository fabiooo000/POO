abstract class Comprobante {
    protected String numero;
    protected double monto;
    protected String fecha;
    
    public Comprobante(String numero, double monto, String fecha) {
        this.numero = numero;
        this.monto = monto;
        this.fecha = fecha;
    }
    
    // Métodos abstractos
    public abstract void imprimir();
    public abstract void validar();
    
    // Métodos concretos
    public String getNumero() {
        return numero;
    }
    
    public double getMonto() {
        return monto;
    }
}

class Factura extends Comprobante {
    private String ruc;
    
    public Factura(String numero, double monto, String fecha, String ruc) {
        super(numero, monto, fecha);
        this.ruc = ruc;
    }
    
    @Override
    public void imprimir() {
        System.out.println("FACTURA: " + numero);
        System.out.println("RUC: " + ruc);
        System.out.println("Monto: $" + monto);
        System.out.println("Fecha: " + fecha);
    }
    
    @Override
    public void validar() {
        if (ruc.length() == 11) {
            System.out.println("Factura válida");
        } else {
            System.out.println("RUC inválido");
        }
    }
}

class Boleta extends Comprobante {
    private String dni;
    
    public Boleta(String numero, double monto, String fecha, String dni) {
        super(numero, monto, fecha);
        this.dni = dni;
    }
    
    @Override
    public void imprimir() {
        System.out.println("BOLETA: " + numero);
        System.out.println("DNI: " + dni);
        System.out.println("Monto: $" + monto);
        System.out.println("Fecha: " + fecha);
    }
    
    @Override
    public void validar() {
        if (dni.length() == 8) {
            System.out.println("Boleta válida");
        } else {
            System.out.println("DNI inválido");
        }
    }
}
