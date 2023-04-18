package controle.atividade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TesteLista {
    public static void main(String[] args) {
        // Para criar uma lista, 
        // usaremos um objeto do tipo ArrayList
        // Essa classe tem vários métodos que ajudam
        
        //Métodos mais usados:
        // add: adiciona objeto na lista
        // get: busca objeto pelo indice
        // size: retorna tamanho da lista
        // remove: remove por indice ou objeto
        
        List listaEstranha = new ArrayList();
        
        //Estranha pq aceita qualquer tipo
        // o que não é bom
        listaEstranha.add("Xampson");
        listaEstranha.add(42);
        listaEstranha.add(42.0);
        listaEstranha.add(false);
        
        System.out.println(listaEstranha);
        
        //Criando lista com tipo!
        List<String> nomes = new ArrayList();
        nomes.add("Bob");
        nomes.add("Maria");
        nomes.add("Xampson");
        nomes.add("William");
        nomes.add("Giuliana");
        
        String terceiroNome = nomes.get(3);
        System.out.println("Nome do indice 3: " + terceiroNome);
        
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(
                    String.format("%dº nome: %s", 
                            i, nomes.get(i)));
        }
        
        //Removendo o William
        nomes.remove("William");
        nomes.remove(3); // melhor esse!
        
        //Lista de objetos com nossas classes
        List<Atividade> atividades = new ArrayList();
        
        Atividade atividade01 = new Atividade("Preparar Aula", "William", 10);
        Atividade atividade02 = new Atividade("Pintar as paredes da casa", "Xampson", 3);
//        Atividade atividade03 = new Atividade("Cozinhar bolo", "Nathan", 1);
        
        atividades.add(atividade01);
        atividades.add(atividade02);
        atividades.add(new Atividade("Cozinhar bolo", "Nathan", 1));
        
        //Exiba somente atividades com menos de 5 dias estimados
        System.out.println("----------");
        System.out.println("Com for tradicional");
        for (int i = 0; i < atividades.size(); i++) {
            Atividade atividadeDaVez = atividades.get(i);
            if(atividadeDaVez.getDiasEstimados() < 5){
                System.out.println(atividadeDaVez);
            }
        }
        
        System.out.println("----------");
        System.out.println("Com enhanced for:");
        //Esse percorre a lista inteira, não tem o "i"
        for (Atividade atividadeDaVez : atividades) {
            if(atividadeDaVez.getDiasEstimados() < 5){
                System.out.println(atividadeDaVez);
            }
        }        
    }
}
 