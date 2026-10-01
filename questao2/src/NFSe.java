package Questao2;

public class NFSe implements ComprovanteFiscal {
    private static final double ISS = 0.05;

    @Override public String descrever(double valor) {
        return String.format("Comprovante fiscal: NFS-e (ISS 5%%) - imposto: R$ %.2f", valor * ISS);
    }
}