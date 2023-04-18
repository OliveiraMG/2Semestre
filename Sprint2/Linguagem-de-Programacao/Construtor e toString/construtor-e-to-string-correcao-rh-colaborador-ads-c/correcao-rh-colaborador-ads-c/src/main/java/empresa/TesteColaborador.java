package empresa;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TesteColaborador {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do colaborador 01:");
        String nomeColab01 = leitor.nextLine();
        
        Colaborador colab01 = new Colaborador(nomeColab01, "Estágio", 1000.0);

        Colaborador colab02 = new Colaborador("William", "Gerente", 10100.0);
        Colaborador colab03 = new Colaborador("Maria", "Dev Sênior");

        RecursosHumanos rh = new RecursosHumanos();

        System.out.println(colab01.toString()); //chamando toString() de Colaborador
        System.out.println(colab02);//chamando toString() de Colaborador

        rh.promoverColaborador(colab01, "Dev Jr.", 3500.0);
        rh.promoverColaborador(colab02, "Diretor", 9500.0);
        rh.reajustarSalario(colab01, 500.0);

        System.out.println(colab01); //chamando toString() de Colaborador
        System.out.println(colab02); //chamando toString() de Colaborador

        System.out.println(rh); //chame o toString() sobrescrito aqui
        
   
        
       
    }
}
