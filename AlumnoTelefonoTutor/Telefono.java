package escuela;

/**
 *
 * @author chanp
 */
public class Telefono {
    String pais, lada, numero;

    public Telefono() {
    }

    public Telefono(String pais, String lada, String numero) {
        this.pais = pais;
        this.lada = lada;
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public String getLada() {
        return lada;
    }

    public String getNumero() {
        return numero;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setLada(String lada) {
        this.lada = lada;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefono{" + "pais=" + pais + ", lada=" + lada + ", numero=" + numero + '}';
    }
}
