public class Bancario extends Conta {
    private int saldo;
    private int deposita;

    public Bancario(String nome, String sobrenome, int cpf, int saldo, int deposita) {
        super(nome, sobrenome, cpf);
        this.saldo = saldo;
        this.deposita = deposita;
    }

    public void MandaValor(int valor){
        int receberValor = valor;
        System.out.println("O valor recebido do Usuario foi "+receberValor);
    }

    public void DepositaValor(int valor){
      deposita =  valor;
      saldo = saldo + valor;
      System.out.println("Você deposito "+deposita+" na sua conta "+saldo);
    }

     public void SobrouDoSaldo(int valor){
      saldo = saldo - valor;
      System.out.println("seu saldo foi de "+valor);
    }
}