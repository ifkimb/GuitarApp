package br.com.etecia.myapp;

public class Guitarra {

    private int imgCardGuitarra;
    private String tituloGuitarra;

    public Guitarra(int idImgCardGuitarra, String idTituloGuitarra){
        this.imgCardGuitarra = idImgCardGuitarra;
        this.tituloGuitarra = idTituloGuitarra;
    }

    public int getImgCardGuitarra() {return imgCardGuitarra; }

    public void setImgCardGuitarra(int imgCardGuitarra) {
        this.imgCardGuitarra = imgCardGuitarra;
    }

    public String getTituloGuitarra() {
        return tituloGuitarra;
    }

    public void setTituloGuitarra(String tituloGuitarra) {
        this.tituloGuitarra = tituloGuitarra;
    }
}
