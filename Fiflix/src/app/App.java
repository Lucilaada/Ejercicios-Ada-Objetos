package app;

public class App {
    public static void main(String[] args) throws Exception {;
        System.out.println("Iniciando Catalogo");
        Netflix.InicializarCatalogo();

        Serie bb = Netflix.BuscarSerie("Breaking Bad");//devuelve serie
        
        Temporada laMejorTemporada = bb.getTemporada(0);//devuelve temporada
        
        Episodio elTop;
        
        elTop = laMejorTemporada.getEpisodio("webepi1");//reproduce
        
        elTop.reproducir();
    }
}