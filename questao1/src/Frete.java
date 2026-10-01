import java.util.List;

public interface Frete {
    String getModalidade();
    double calcularValor(double valorCarga);
    List<String> getDocumentos();
}