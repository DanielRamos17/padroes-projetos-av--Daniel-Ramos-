public class ContratacaoAerea extends ContratacaoFrete {
    @Override protected Frete criarFrete() { return new FreteAereo(); }
}