package br.com.etecia.myapp;

public class Loja {

    private int imgCardLojas;
    private String idTitulosLoja;

    public Loja (int imgCardLojas){
        this.imgCardLojas = imgCardLojas;
        this.idTitulosLoja = idTitulosLoja;
    }

    public int getImgCardLojas() {
        return imgCardLojas;}

    public void setImgCardLojas(int imgCardLojas) {
        this.imgCardLojas = imgCardLojas;
    }

    public String getIdTitulosLoja() {
        return idTitulosLoja;
    }

    public void setIdTitulosLoja(String idTitulosLoja) {
        this.idTitulosLoja = idTitulosLoja;
    }
}
