package app;

/**
 * Persona
 */
public class Persona {


    private static final char SEXO_DEF = 'H';
    static final int PESO_IDEAL = 0;
    static final int PESO_BAJO = -1;
    static final int SOBREPESO = 1;
    String nombre;
    int edad;
    String dni;
    char sexo;
    Double peso;
    Double altura;

    public Persona(String nombre, int edad, String dni,
        Double peso, Double altura, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }
    public Persona() {
        this.nombre = " ";
        this.edad = 0;
        this.peso = 0.0;
        this.altura = 0.0;
        this.sexo = SEXO_DEF;
    }
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    protected int IMC() {
        double pesoActual = peso / (Math.pow(altura,2));//Calcula el peso de la persona
    if (pesoActual >= 20 && pesoActual <= 25){
        return PESO_IDEAL;
    }else if (pesoActual < 20){
        return PESO_BAJO ;
    }else{return SOBREPESO;}
    }
    protected boolean esMayorEdad(){
        if (edad > 18){
            return true ;
        }else{return false;}
    }
    protected void comprobarSexo(char sexo){
        if (sexo != 'H' && sexo != 'M') {
                this.sexo = SEXO_DEF;}
        }
    protected void generarDni() {
        int numDni = ((int)Math.floor(Math.random()*(100000000 - 100000000)+100000000));
        dni = Integer.toString(numDni);}
        
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }


    public String toString() {
        return "Nombre: "+ nombre +"\n Edad: "
        + edad+"\n DNI: "+ dni+ "\n Sexo: " +sexo +"\n Peso: "
        + IMC() ;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	public boolean PESO_IDEAL() {
		return false;
	}
	public boolean PESO_BAJO() {
		return false;
	}
}