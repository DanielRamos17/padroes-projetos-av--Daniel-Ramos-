public class Main {
    public static void main(String[] args) {
        ContratacaoFrete rodoviaria = new ContratacaoRodoviaria();
        ContratacaoFrete aerea = new ContratacaoAerea();
        ContratacaoFrete maritima = new ContratacaoMaritima();

        rodoviaria.contratar("Transportes Primario Ltda", 100_000.00);
        aerea.contratar("Secundario Eletrônicos S.A.", 100_000.00);
        maritima.contratar("Terceario Importadora", 100_000.00);
    }
}