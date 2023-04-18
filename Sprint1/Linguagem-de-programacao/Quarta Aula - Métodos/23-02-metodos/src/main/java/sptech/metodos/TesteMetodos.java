package sptech.metodos;

/**
 *
 * @author miniguiti
 */
public class TesteMetodos {
    public static void main(String[] args) {
        
        // Para utilizar os métodos de outra classe que criamos
        // precisamos criar um objeto
        // Ou seja, fazer uma instância:        
        Utilitaria util = new Utilitaria();
        Calculadora calc = new Calculadora();
        
        String nome01 = "Xampson";
        String nome02 = "Giuliana";
        
        util.exibirNomeFormatado(nome01);  
        util.exibirNomeFormatado(nome02);
        
        //Método com retorno:        
        
        Integer numDigitado = 10; //Imagine que veio do Scanner
        
        Integer resultadoSoma = calc.somar(numDigitado,32);
        
        System.out.println("Retorno guardado em variável: " + resultadoSoma);
        System.out.println("Retorno direto no print:" + calc.somar(numDigitado,32));
        
        //Retorno Double e Argumentos Double
        Double numeroQuebrado = 10.5;         
        Double resultadoSubtracao = calc.subtrair(numeroQuebrado,32.0);
        System.out.println("Subtração: " + resultadoSubtracao);
    
        // Testando Sobrecarga:
        Integer resultadoSomaSobrecarga = calc.somar(10,5,4);
        System.out.println("Sobrecarga: " + resultadoSomaSobrecarga);      
    }
}
