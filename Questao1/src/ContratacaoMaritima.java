public class ContratacaoMaritima extends ContratacaoFrete {
    @Override protected Frete criarFrete() { return new FreteMaritimo(); }
}