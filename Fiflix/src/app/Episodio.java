package app;
/**
 * Episodio
 */
public class Episodio {
    public int numeroEpisodio;
    public String titulo;
    public Episodio(String tit)
    {this.titulo=tit;
    }
    public Episodio(){

    }
    public int numero;
    public int duracion;
//objetivo de la funcion: que devuelva el titulo (this)
    public String getTitulo()
    {return this.titulo;
    }

public void reproducir()
    {
        System.out.println("Reproduciendo episodio "+this.numeroEpisodio+" "+this.titulo);
        
    }
}