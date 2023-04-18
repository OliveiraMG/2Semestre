package controle.atividade;

/**
 *
 * @author Admin
 */
public class Atividade {
    //1º Atributos
    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;
    
    //2º Construtor
    public Atividade(String nomeAtividade, 
            String responsavel, 
            Integer diasEstimados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }
   
    // 3º Métodos do Objeto - Comportamentos
    public void terminarAtividade(Integer diasUsados){
        if(diasUsados > 0){
           this.diasUsados = diasUsados; 
            System.out.println("Atividade finalizada");
        }else{
            System.out.println("Valor informado negativo.");
        }           
    }
    
    public void exibirRelatorio(){
       
        if(diasUsados > diasEstimados){
            System.out.println(
                    String.format("\"Você estimou %d dias, "
                            + "mas a tarefa foi feita em %d dias "
                            + "(%d dias a mais que o estimado). "
                            + "Melhore a estimativa.",diasEstimados, 
                            diasUsados, (diasUsados - diasEstimados) ));
        }else if (diasUsados < diasEstimados){
            System.out.println(
                    String.format("\"Você estimou %d dias, "
                            + "mas a tarefa foi feita em %d dias "
                            + "(%d dias a menos que o estimado). "
                            + "Parabéns.",diasEstimados, 
                            diasUsados, (diasEstimados - diasUsados) ));
        }else{
            System.out.println(
                    String.format("\"Você estimou %d dias, "
                            + "e a tarefa foi feita em %d dias, "
                            + "atendendo a estimativa com precisão. "
                            ,diasEstimados,diasUsados));
        }
            
    }
    // 4º Getters & Setters
    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }
    
    // 5º Método toString();

    @Override
    public String toString() {
        return String.format("Atividade: "
                + "\nNome: %s"
                + "\nResponsável: %s"
                + "\nDias Estimados: %d"
                + "\nDias Usados: %d", 
                nomeAtividade,
                responsavel,
                diasEstimados,
                diasUsados
        );
    }
    
    
}
