package br.com.etecia.myapp;

public class Acessorios {

    private int imgCardAcessorios;
    private String idTituloAcessorios;

    public Acessorios(int imgCardAcessorios, String idTituloAcessorios) {
        this.imgCardAcessorios = imgCardAcessorios;
        this.idTituloAcessorios = idTituloAcessorios;
    }

    public int getImgCardAcessorios() {
        return imgCardAcessorios;
    }

    public void setImgCardAcessorios(int imgCardAcessorios) {
        this.imgCardAcessorios = imgCardAcessorios;
    }
    public String getIdTituloAcessorios(){
        return idTituloAcessorios;
    }

    public void setIdTituloAcessorios(String idTituloAcessorios) {
        this.idTituloAcessorios = idTituloAcessorios;
    }
}
