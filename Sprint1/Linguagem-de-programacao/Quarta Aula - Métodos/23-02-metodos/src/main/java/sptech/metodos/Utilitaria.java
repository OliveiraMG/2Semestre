package sptech.metodos;

/**
 *
 * @author miniguiti
 */
public class Utilitaria {
    // Retorno: esse não tem, é void!
    // Nome: exibirLinha (camelCase, igual variável)
    // Argumentos: esse não tem, fica dentro dos ()
    // Corpo: fica dentro das { }    
    void exibirLinha(){
        System.out.println("*--------*--------*");
    }
    
    //Método com Argumento:    
    void exibirNome(String nomeExibir){
        System.out.println("Meu nome é: " + nomeExibir);
    }
    
    // Métodos diferentes podem ter argumentos com o mesmo nome
    // Já que eles nascem e morrem dentro do método
    void exibirNomeFormatado(String nome){
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
        System.out.println("\n");
    }
}
