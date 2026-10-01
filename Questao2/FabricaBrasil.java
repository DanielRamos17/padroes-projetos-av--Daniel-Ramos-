package Questao2;

public class FabricaBrasil implements FabricaArtefatos {
    @Override public ComprovanteFiscal criarComprovanteFiscal() { return new NFSe(); }
    @Override public Pagamento criarPagamento() { return new PagamentoPix(); }
    @Override public TermoPrivacidade criarTermoPrivacidade() { return new TermoLGPD(); }
}