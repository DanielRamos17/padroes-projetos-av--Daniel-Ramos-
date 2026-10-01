package Questao2;

public class FabricaMexico implements FabricaArtefatos {
    @Override public ComprovanteFiscal criarComprovanteFiscal() { return new CFDI(); }
    @Override public Pagamento criarPagamento() { return new PagamentoSPEI(); }
    @Override public TermoPrivacidade criarTermoPrivacidade() { return new TermoLFPDPPP(); }
}