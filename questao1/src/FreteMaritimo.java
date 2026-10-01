import java.util.List;

public class FreteMaritimo implements Frete {
    @Override public String getModalidade() { return "Marítimo"; }
    @Override public double calcularValor(double valorCarga) { return valorCarga * 0.01; }
    @Override public List<String> getDocumentos() {
        return List.of("BL (Bill of Lading)", "Fatura comercial");
    }
}