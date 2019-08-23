package app;
public class App {
    public static void main(String[] args) throws Exception {
        Persona persona3 = new Persona("Carolo", 32,"52.964.426", 3.06 , 1.78, 'M');
        
        System.out.println(persona3.getNombre());
        App.mostrarDni(persona3);
        App.mostrarEdad(persona3);
        App.mostrarPeso(persona3);
        App.mostrarSexo(persona3);
    }
    
    private static void mostrarSexo(Persona persona3) {
        if(persona3.sexo == 'H'){
            System.out.println("Es hombre.");
        }else{System.out.println("Es mujer");}
    }

   /* private static void mostrarPeso(Persona persona3, String nombre) {
        if (persona3.PESO_IDEAL()){
            System.out.println(nombre + "Tiene un peso ideal." );
        }else if(persona3.PESO_BAJO())
        {System.out.println("Tiene un peso muy bajo.");
    }else{System.out.println("Tiene sobrepeso.");}}*/
    public static void mostrarPeso(Persona persona3) {
        int IMC = persona3.IMC();
        switch (IMC) {
            case Persona.PESO_IDEAL:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.PESO_BAJO:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.SOBREPESO:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }}
	private static void mostrarEdad(Persona persona3) {
        if (persona3.esMayorEdad()){
        System.out.println("Es mayor de edad");
    }else{System.out.println("Es menor de edad");}
    }

    private static void mostrarDni(Persona persona3) {
        System.out.println("Su numero de dni es: " + persona3.getDni());
    }
}
 
