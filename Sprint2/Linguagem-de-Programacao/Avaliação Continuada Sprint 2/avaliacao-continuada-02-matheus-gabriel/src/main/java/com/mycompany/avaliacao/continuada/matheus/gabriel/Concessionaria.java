/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao.continuada.matheus.gabriel;

/**
 *
 * @author oliveira
 */
public class Concessionaria {
    private String nome;
    private Integer qtdVendas;
    private Integer qtdDescontosAplicados;
    private Double totalVendido;
    
    public Concessionaria (String nome) {
        this.nome = nome;
        this.qtdVendas = 0;
        this.qtdDescontosAplicados = 0;
        this.totalVendido = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(Integer qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public Integer getQtdDescontosAplicados() {
        return qtdDescontosAplicados;
    }

    public void setQtdDescontosAplicados(Integer qtdDescontosAplicados) {
        this.qtdDescontosAplicados = qtdDescontosAplicados;
    }

    public Double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(Double totalVendido) {
        this.totalVendido = totalVendido;
    }
    
    
    public void aumentarEstoque(Veiculo veiculo, Integer quantidade) {
        if (quantidade > 0) {
            veiculo.setQtdEstoque(veiculo.getQtdEstoque() + quantidade);
            System.out.println("ESTOQUE AUMENTADO!");
        } else {
            System.out.println("QUANTIDADE INVÁLIDA!");
        }
    }
    
    public void realizarVenda(Veiculo veiculo) {
        if(veiculo.getQtdEstoque() > 0 && veiculo.getValorTabela() > 0) {
            veiculo.setQtdEstoque(veiculo.getQtdEstoque() - 1);
            totalVendido += veiculo.getValorTabela();
            qtdVendas += 1;
            System.out.println("VENDA REALIZADA!");

        } else {
            System.out.println("NÃO É POSSÍVEL REALIZAR A VENDA");
        }
    }
    
    public void realizarVenda(Veiculo veiculo, Double porcentagemDesconto) {
        Double desconto = veiculo.getValorTabela() * (porcentagemDesconto / 100.0) ;
        if(veiculo.getQtdEstoque() > 0 && veiculo.getValorTabela() > 0 && desconto > 0) {
            Double valorFinal = veiculo.getValorTabela() - desconto;
            veiculo.setQtdEstoque(veiculo.getQtdEstoque() - 1);
            totalVendido += valorFinal;
            qtdVendas += 1;
            qtdDescontosAplicados += 1;
            System.out.println("VENDA REALIZADA!");

        } else {
            System.out.println("NÃO É POSSÍVEL REALIZAR A VENDA");
        }
    }
    
    public Double getPercentualVendasComDesconto() {
        Double percentualVendasDesconto = (qtdDescontosAplicados * 100.00) / qtdVendas;
                
        if (qtdVendas == 0) {
            System.out.println("NÃO HOUVE VENDAS");
            return percentualVendasDesconto = 0.0;
        } else if (qtdVendas == qtdDescontosAplicados) {
            System.out.println("TODAS AS VENDAS COM DESCONTO");
            return percentualVendasDesconto = 100.00;
        } else {
            System.out.println("AQUI ESTÁ A PORCENTAGEM DE VENDAS COM DESCONTO");
            return percentualVendasDesconto;
        }
        
    }
    
    @Override
    public String toString() {
        return String.format("\nConcessionaria:"
                + "\nNome da concessionaria = %s"
                + "\nQuantidade de vendas = %d"
                + "\nQuantidade de descontos aplicados = %d"
                + "\nTotal Vendido = %.2f", nome, qtdVendas, qtdDescontosAplicados, totalVendido);
    }
    
    
}
