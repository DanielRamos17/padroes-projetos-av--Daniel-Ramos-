public class ContratacaoRodoviaria extends ContratacaoFrete {
    @Override protected Frete criarFrete() { return new FreteRodoviario(); }
}