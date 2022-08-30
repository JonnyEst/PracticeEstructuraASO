package business.dto;

public class NotasOut {

    private int resultado;

    public NotasOut() {
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "NotasOut{" +
                "resultado=" + resultado +
                '}';
    }
}
