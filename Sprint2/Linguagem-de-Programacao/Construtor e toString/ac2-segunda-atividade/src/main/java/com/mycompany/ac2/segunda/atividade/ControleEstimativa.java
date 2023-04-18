/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ac2.segunda.atividade;

/**
 *
 * @author oliveira
 */
public class ControleEstimativa {
    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;
    
    public ControleEstimativa (String nomeAtividade, String responsavel, Integer diasEstimados, Integer diasUsados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }
    
    @Override
    public String toString() {
        return "\n\nAtividade{" +
                "nomeAtividade = '" + nomeAtividade +
                ", responsavel = '" + responsavel +
                ", diasEstimados = " + diasEstimados +
                ", diasUsados = " + diasUsados +
                '}';
    }
    
    public void terminarAtividade(Integer diasUsados) {
        if (diasUsados >= 0) {
            this.diasUsados = diasUsados;
        } else {
            System.out.println("Quantidade inválida!");
        }
    };

    public void exibirRelatorio() {
        if (diasUsados > diasEstimados) {
            System.out.println(
                    String.format(
                            "Você estimou %d dias, mas a tarefa foi feita em %d dias (%d dias a mais que o estimado)." +
                                    " Melhore a estimativa.", diasEstimados, diasUsados, (diasUsados - diasEstimados)
                    )
            );
        } else if (diasUsados < diasEstimados) {
            System.out.println(
                    String.format(
                            "Você estimou %d dias, e a tarefa foi feita em %d dias (%d dias a menos que o estimado)." +
                                    " Parabéns!", diasEstimados, diasUsados, (diasEstimados - diasUsados)
                    )
            );
        } else {
            System.out.println(
                    String.format(
                            "Você estimou %d dias, e a tarefa foi feita em %d dias, atendendo a estimativa com precisão.",
                                diasEstimados, diasUsados
                    )
            );
        }
        
        
        
    };
    
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

    public void setDiasUsados(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }
    
    
    
}
