import java.util.List;

public class FreteRodoviario implements Frete {
    @Override public String getModalidade() { return "Rodoviário"; }
    @Override public double calcularValor(double valorCarga) { return valorCarga * 0.02; }
    @Override public List<String> getDocumentos() { return List.of("CT-e", "MDF-e"); }
}