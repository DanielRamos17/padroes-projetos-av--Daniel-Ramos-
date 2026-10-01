package Questao2;

public class Assinatura {
    private final String cliente;
    private final double valor;
    private final ComprovanteFiscal comprovante;
    private final Pagamento pagamento;
    private final TermoPrivacidade termo;

    public Assinatura(String cliente, double valor, FabricaArtefatos fabrica) {
        this.cliente = cliente;
        this.valor = valor;
        this.comprovante = fabrica.criarComprovanteFiscal();
        this.pagamento = fabrica.criarPagamento();
        this.termo = fabrica.criarTermoPrivacidade();
    }

    public void ativar() {
        System.out.println("=== Ativação de assinatura: " + cliente + " ===");
        System.out.println(comprovante.descrever(valor));
        System.out.println(pagamento.descrever(valor));
        System.out.println(termo.descrever());
        System.out.println();
    }
}