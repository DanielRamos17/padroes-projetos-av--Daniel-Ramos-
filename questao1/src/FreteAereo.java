import java.util.List;

public class FreteAereo implements Frete {
    @Override public String getModalidade() { return "Aéreo"; }
    @Override public double calcularValor(double valorCarga) { return valorCarga * 0.06; }
    @Override public List<String> getDocumentos() { return List.of("AWB (Air Waybill)"); }
}