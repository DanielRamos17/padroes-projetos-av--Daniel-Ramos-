package Questao2;

public class PagamentoSPEI implements Pagamento {
    @Override public String descrever(double valor) {
        return String.format("Pagamento: SPEI - MXN %.2f", valor);
    }
}