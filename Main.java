public class Main {
    public static void main(String[] args) {
        Bancario banco = new Bancario("", "", 0, 0, 0);
        VerificarContaUser v = new VerificarContaUser("Ana", null, 123);
       v.verificarConta(null, 0, null);
        
        banco.MandaValor(50);
        banco.SobrouDoSaldo(20);
    }
}
