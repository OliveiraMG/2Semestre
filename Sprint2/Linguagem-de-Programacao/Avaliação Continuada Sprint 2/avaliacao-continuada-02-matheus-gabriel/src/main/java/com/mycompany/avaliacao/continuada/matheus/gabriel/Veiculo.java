/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avaliacao.continuada.matheus.gabriel;

/**
 *
 * @author oliveira
 */
public class Veiculo {
    
    private Integer id;
    private String modelo;
    private Double valorTabela;
    private Integer qtdEstoque;
    
    public Veiculo (Integer id, String modelo) {
        this.id = id;
        this.modelo = modelo;
        this.valorTabela = 0.0;
        this.qtdEstoque = 0;
    }
    
    @Override
    public String toString() {
        return String.format("\nVeículo:"
                + "\nId do veículo = %d"
                + "\nModelo do veículo = %s"
                + "\nValor de tabela do veículo = %.2f"
                + "\nQuantidade de veículo no estoque = %d", id, modelo, valorTabela, qtdEstoque);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getValorTabela() {
        return valorTabela;
    }

    public void setValorTabela(Double valorTabela) {
        this.valorTabela = valorTabela;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}
