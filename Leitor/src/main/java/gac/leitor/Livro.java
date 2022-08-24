package gac.leitor;
public class Livro implements Publicacao{
    //Atributos
    private String titulo, autor;
    private Pessoa leitor;
    private int totPaginas, pagAtual;
    private boolean aberto;

    public Livro(String titulo, String autor, Pessoa leitor, int totPaginas) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setLeitor(leitor);
        this.setTotPaginas(totPaginas);
        this.setPagAtual(0);
        this.setAberto(false);
    }

    //Métodos
    public void detalhes(){
        System.out.println("***** DETALHES *****");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Leitor: " + leitor.getNome());
        System.out.println("Total de paginas: " + totPaginas);
        System.out.println("Pagina atual: " + pagAtual);
        System.out.println("Aberto?: " + aberto);
        System.out.println("********************");
    }

    //Métodos Especificos
    @Override
    public void abrir() {
        if(!this.isAberto())
            this.setAberto(true);
    }

    @Override
    public void fechar() {
        if(this.aberto)
            this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(this.isAberto() && (this.getPagAtual() + p) <= this.getTotPaginas())
            this.setPagAtual(this.getPagAtual() + p);
    }

    @Override
    public void avancarPag() {
        if(this.isAberto() && (this.getPagAtual() + 1) <= this.getTotPaginas())
            this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        if(this.isAberto() && (this.getPagAtual() - 1) >= 0)
            this.setPagAtual(this.getPagAtual() - 1);
    }
    
    //Métodos Públicos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}

