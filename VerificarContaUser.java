public class VerificarContaUser extends Conta {

    public VerificarContaUser(String nome, String sobrenome, int cpf) {
        super(nome, sobrenome, cpf);
    }


    public void verificarConta(String nome,int cpf,String sobrenome){
        if(nome == null && sobrenome == null && cpf == 0){
            System.out.println("[ERROR] sua conta invalidar");
        }else{
            System.out.println(nome+" "+sobrenome+" "+cpf+" esta acessor");
        }
    }
    
}
