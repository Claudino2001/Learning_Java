package machine.projetoyoutube;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    @Override
    public void status(){
        super.status();
        System.out.println("Login: " + this.login);
        System.out.println("Total Assistido: " + this.totAssistido);
        System.out.println("######################\n"); 
    }

    public void viuMaisUm(){
        this.totAssistido++;
    }

    @Override
    protected void ganharExp() {
        this.experiencia++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

}
