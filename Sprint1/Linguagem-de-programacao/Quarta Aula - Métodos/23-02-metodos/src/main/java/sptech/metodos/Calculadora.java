package sptech.metodos;

/**
 *
 * @author miniguiti
 */
public class Calculadora {
    
    // Evitar colocar print do retorno dentro do próprio método
    // Isso pode me fazer esquecer de usar o retono onde o método é chamado
    Integer somar(Integer numero01, Integer numero02){
        return numero01 + numero02;
    }
    
    void exibirSoma(Integer numero01, Integer numero02){
        System.out.println(numero01 + numero02);
    }
    
    // subtrair(){}
    Double subtrair(Double numero01, Double numero02){
        return numero01 - numero02;
    }
    
    Double retornaSubtracaoEmostrarUsuario(Double numero01, 
                    Double numero02,
                    String usuarioSolicitante){
        System.out.println("Soma solicitada por " + usuarioSolicitante);

        return numero01 - numero02;
    }
    
    String retornaFraseAprovacao(Double nota){
        if(nota >= 6){
            return "Passou!";
        }else{
            return "Reprovou :(";
        }
    }
    
    Boolean isPar(Double numeroVerificar){
        Boolean isPar;
        
//        if(numeroVerificar % 2 == 0){
//            isPar = true;
//        }else{
//            isPar = false;
//        }

        //Assim também funciona:
        isPar = numeroVerificar % 2 == 0;
        
        //Assim também (com uma linha):
        // return numeroVerificar % 2 == 0;
        
        return isPar;
    }
    
    
    //Sobrecarga
    // Argumentos diferentes, sem considerar o nome
    Integer somar(Integer numero01, 
                Integer numero02, 
                Integer numero03){
        return numero01 + numero02 + numero03 ;
    }
    
}
