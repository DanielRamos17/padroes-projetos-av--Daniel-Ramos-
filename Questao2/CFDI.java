package Questao2;

public class CFDI implements ComprovanteFiscal {
    private static final double IVA = 0.16;

    @Override public String descrever(double valor) {
        return String.format("Comprovante fiscal: CFDI (IVA 16%%) - imposto: MXN %.2f", valor * IVA);
    }
}