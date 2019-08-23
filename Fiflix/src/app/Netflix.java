package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Netflix
 */
public class Netflix {
    public static List<Pelicula> catalogoPeliculas = new ArrayList<Pelicula>();
    public static List<Serie> catalogoSeries = new ArrayList<Serie>();
    public static Serie BuscarSerie(String nombre)
    {
        for (Serie s : Netflix.catalogoSeries) 
        {if(s.nombre.equals(nombre))
            {
                return s;
            }   
        }
        return null;
    }
    
    public static Pelicula BuscarPelicula(String nombre)
    {
        for(Pelicula p : Netflix.catalogoPeliculas)
        {if(p.nombre.equals(nombre)){
            return p;
        }
        }return null;
    }
    public static void LimpiarCatalogo()
    {
        Netflix.catalogoPeliculas.clear();
        Netflix.catalogoSeries.clear();
    }


    public static void InicializarCatalogo()
    {
            Netflix.AgregarBreakingBad();
    }
    public static void AgregarBreakingBad()
    {
            
            Serie breakingB = new Serie();
            breakingB.nombre = "Breaking Bad";
            breakingB.anio = 2008;
            breakingB.genero = "Drama";

            Temporada t= new Temporada(0);
            breakingB.temporadas.add(t);

            Websodio we = new Websodio("webepi1");
            t.episodios.add(we);
            we = new Websodio("webepi2");
            t.episodios.add(we);

            t= new Temporada(5);
            breakingB.temporadas.add(t);

            Episodio ep = new Episodio("Say my name");
            ep.numeroEpisodio = 7;
            ep.duracion = 43;
            t.episodios.add(ep);

            ep=new Episodio(" Ozymandias ");//epOtro deberia ser ep, reutilizo la variable
            ep.duracion = 41; 
            t.episodios.add(ep);
            
            breakingB.temporadas.add(t);

            Netflix.catalogoSeries.add(breakingB);
    }
}