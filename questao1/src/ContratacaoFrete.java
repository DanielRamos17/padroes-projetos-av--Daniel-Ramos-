public abstract class ContratacaoFrete {

    // Factory Method: cada especialização decide qual frete criar
    protected abstract Frete criarFrete();

    // Procedimento escrito uma única vez (RNF01); só conhece a abstração Frete (RNF02)
    public final void contratar(String cliente, double valorCarga) {
        Frete frete = criarFrete();
        double valorFrete = frete.calcularValor(valorCarga);
        imprimirResumo(frete, cliente, valorFrete);
    }

    private void imprimirResumo(Frete frete, String cliente, double valorFrete) {
        System.out.println("=== Resumo da contratação ===");
        System.out.println("Modalidade: " + frete.getModalidade());
        System.out.println("Cliente: " + cliente);
        System.out.printf("Valor do frete: R$ %.2f%n", valorFrete);
        System.out.println("Documentos exigidos: " + String.join(", ", frete.getDocumentos()));
        System.out.println();
    }
}