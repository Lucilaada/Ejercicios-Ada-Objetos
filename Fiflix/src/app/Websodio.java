package app;
public class Websodio extends Episodio
{
    public Websodio(String tit){
        super(tit);
    }
    public void reproducir()
    {
        System.out.println("Reproduciendo episodio "+this.numeroEpisodio+" "+this.titulo);
        
    }
}


     
