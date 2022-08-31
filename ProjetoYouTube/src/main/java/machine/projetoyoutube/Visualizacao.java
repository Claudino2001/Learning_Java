package machine.projetoyoutube;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int n){
        this.filme.setAvaliacao(n);
    }
    
    public void avaliar(float n){
        int tot = 0;
        if(n <= 20){
            tot = 3;
        } else if(n <= 50){
            tot = 5;
        }else if(n <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void status(){
        System.out.println("****** VISUALIZAÇÃO ******");
        this.espectador.status();
        this.filme.status();
        System.out.println("**************************");
    }

}
