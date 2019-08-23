package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Serie
 */
public class Serie extends Contenido 
{
    //lista = temporadas

    public List<Temporada> temporadas = new ArrayList<Temporada>();

    public Temporada getTemporada(int nro)
    {
        //recorrer cada temporada
        //si el numero de temporada del ciclo es igual al "nro"
        //devolver cada temporada
        for ( Temporada tempo : this.temporadas) 
        {
            // dos partes, tipo y coleccion
            //type = clase
            // var = nombre con el cual quiero llamar al iterador
           if (tempo.numeroTemporada == nro)
           // el "." conecta dos variables
           // = asignacion
           // == comparacion
           {
           return tempo;  
           }
        } 
        return null;
    }
}