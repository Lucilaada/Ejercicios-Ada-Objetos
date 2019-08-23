package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Titular y cantidad de la cuenta: ");
        Cuenta cuenta1 = new Cuenta("Pepe", 9000.90);
        Cuenta cuenta2 = new Cuenta("Sol", 12000.60);

        cuenta1.setTitular("Pepe");
        cuenta2.setTitular("Sol");

        cuenta1.ingresar(3000.00);
        cuenta2.ingresar(3200.78);

        cuenta1.retirar(2000.87);
        cuenta2.retirar(11000.98);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
  }


