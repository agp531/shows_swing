package model;


public class Shows{

    private int codigo;
    private String artista;
    private Double cache;
    private String data;
    private Double valorIngresso;
    private String local;

    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public Double getCache() {
        return cache;
    }
    public void setCache(Double cache) {
        this.cache = cache;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Double getValorIngresso() {
        return valorIngresso;
    }
    public void setValorIngresso(Double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
    
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
 
    
}
