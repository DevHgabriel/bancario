public class Conta {
    private String nome;
    private String Sobrenome;
    private int cpf;

    
    public Conta(String nome, String sobrenome, int cpf) {
        this.nome = nome;
        Sobrenome = sobrenome;
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }


    public String getSobrenome() {
        return Sobrenome;
    }


    public int getCpf() {
        return cpf;
    }

    
}
