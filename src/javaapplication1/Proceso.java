package javaapplication1;

public class Proceso {
    
    private String identificador;
    private Long cuanto;

    public Proceso(String identificador, Long cuanto) {
        this.identificador = identificador;
        this.cuanto = cuanto;
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Long getCuanto() {
        return cuanto;
    }

    public void setCuanto(Long cuanto) {
        this.cuanto = cuanto;
    }
    
}
