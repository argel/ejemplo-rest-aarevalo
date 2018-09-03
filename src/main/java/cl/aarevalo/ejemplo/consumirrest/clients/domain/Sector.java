package cl.aarevalo.ejemplo.consumirrest.clients.domain;


import java.math.BigDecimal;

public class Sector {
    private String codigo;
    private String tipo;
    private String nombre;
    private BigDecimal lat;
    private BigDecimal lng;
    private String url;
    private String codigo_padre;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCodigo_padre() {
        return codigo_padre;
    }

    public void setCodigo_padre(String codigo_padre) {
        this.codigo_padre = codigo_padre;
    }
}
