package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Temporada
 */
public class Temporada {
    public int numeroTemporada;
    public List<Episodio> episodios = new ArrayList<Episodio>();
    public Temporada(int numero)
    {
    this.numeroTemporada = numero;}
    public Episodio getEpisodio(int nro)
    {
        for (Episodio epi : this.episodios) 
        {if (epi.numeroEpisodio == nro)
            {return epi;
            }
        }
        return null;
    }
    public Episodio getEpisodio(String nombre)
    {  
        for (Episodio epi : this.episodios) 
        {if (epi.titulo == nombre)
             {return epi;   
             }          
        }  
        return null;
    }
}