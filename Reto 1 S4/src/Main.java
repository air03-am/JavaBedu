public class Main {
    public static void main(String[] args) {
        Factura f1 = new Factura("FAC001", "Jesús González", 1450.00);
        Factura f2 = new Factura("FAC001", "Comercial Mexicana", 1450.00);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}
