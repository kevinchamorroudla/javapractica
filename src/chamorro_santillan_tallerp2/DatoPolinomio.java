package chamorro_santillan_tallerp2;

public class DatoPolinomio {
    private int signo;
    private int termino;
    private int exponente;

    public DatoPolinomio(int signo, int termino, int exponente) {
        this.signo = signo;
        this.termino = termino;
        this.exponente = exponente;
    }

    public DatoPolinomio() {
    }
    
    public int getTermino() {
        return termino;
    }

    public void setTermino(int termino) {
        this.termino = termino;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public int getSigno() {
        return signo;
    }

    public void setSigno(int signo) {
        this.signo = signo;
    }
    
}
