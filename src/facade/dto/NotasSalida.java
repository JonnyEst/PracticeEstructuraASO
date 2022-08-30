package facade.dto;

public class NotasSalida {

    private int resultado;

    public NotasSalida() {
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "NotasSalida{" +
                "resultado=" + resultado +
                '}';
    }
}
