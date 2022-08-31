package machine.projetoyoutube;

public class ProjetoYouTube {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Vídeo Chato!");
        v[1] = new Video("Vídeo Legal.");
        v[2] = new Video("Top 5 coisas legais.");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Gabriel", 21, 'M', "@Gabi");
        g[1] = new Gafanhoto("Marcele", 38, 'F', "@Mar");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar(0);
        vis[0].status();
        
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar();
        vis[1].status();
        
    }
}
