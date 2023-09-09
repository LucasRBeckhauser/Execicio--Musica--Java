package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {

private String host;

private String descricao;


    public String getHost() {
        return host;
    }

    public String getDecricao() {
        return descricao;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setDecricao(String decricao) {
        this.descricao = decricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500) {
            return 10; }
            else {
                return 8;}

    }
}
