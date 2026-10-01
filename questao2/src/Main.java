package Questao2;

public class Main {
    public static void main(String[] args) {
        Assinatura brasil = new Assinatura("Empresa Brasileira Ltda", 1000.00, new FabricaBrasil());
        Assinatura mexico = new Assinatura("Empresa Mexicana S.A.", 1000.00, new FabricaMexico());

        brasil.ativar();
        mexico.ativar();
    }
}