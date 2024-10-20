package aula15;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssintindo;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssintindo = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssintindo() {
        return totAssintindo;
    }

    public void setTotAssintindo(int totAssintindo) {
        this.totAssintindo = totAssintindo;
    }
}
