package control;


public class Login {
   
    
    public void logar(int cpf, String senha){
        if (cpf == 1234 && senha == "sen21"){
            System.out.println("Acesso liberado"); 
        }
        else{
            System.out.println("acesso negado");
        }
    }
}