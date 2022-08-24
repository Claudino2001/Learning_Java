package gac.leitor;
public class Leitor {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Gabriel", 21, 'M');
        p[1] = new Pessoa("Daniela", 45, 'F');
        
        l[0] = new Livro("Livro Legal", "Autor Bacana", p[0], 312);
        l[1] = new Livro("Livro Chato", "Autor Menos Bacana", p[1], 845);
        l[2] = new Livro("Livro Legal", "Autor Gente Boa", p[0], 436);
        
        l[0].abrir();
        l[0].avancarPag();
        l[0].detalhes();
    }
}
