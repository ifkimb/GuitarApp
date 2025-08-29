package br.com.etecia.myapp;

public class Guitarra {

    private int idImgCardGuitarra;
    private String idTituloGuitarra;

    public Guitarra(int idImgCardGuitarra, String idTituloGuitarra){
        this.idImgCardGuitarra = idImgCardGuitarra;
        this.idTituloGuitarra = idTituloGuitarra;
    }

    public int getIdImgCardGuitarra() {
        return idImgCardGuitarra;
    }

    public void setIdImgCardGuitarra(int idImgCardGuitarra) {
        this.idImgCardGuitarra = idImgCardGuitarra;
    }

    public String getIdTituloGuitarra() {
        return idTituloGuitarra;
    }

    public void setIdTituloGuitarra(String idTituloGuitarra) {
        this.idTituloGuitarra = idTituloGuitarra;
    }
}
