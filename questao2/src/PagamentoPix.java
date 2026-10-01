package Questao2;

public class PagamentoPix implements Pagamento {
    @Override public String descrever(double valor) {
        return String.format("Pagamento: Pix - R$ %.2f", valor);
    }
}