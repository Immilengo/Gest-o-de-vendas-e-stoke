/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author IMMilengo
 */
public class ModeloFormaDePagamento {
    private int numefactura;
    private int numecliente;
    private String produto;
    private String preco;
    private String quantidade;
    private String valorpago;
    private String total;
    private String formadepagamento;

   public ModeloFormaDePagamento(int numefactura, int numecliente, String produto, String preco, String quantidade, String valorpago, String total,String formadepagamento) {
        this.numefactura = numefactura;
        this.numecliente = numecliente;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
        this.valorpago = valorpago;
        this.total = total;
        this.formadepagamento = formadepagamento;
    }

    public int getNumefactura() {
        return numefactura;
    }

    public void setNumefactura(int numefactura) {
        this.numefactura = numefactura;
    }

    public int getNumecliente() {
        return numecliente;
    }

    public void setNumecliente(int numecliente) {
        this.numecliente = numecliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValorpago() {
        return valorpago;
    }

    public void setValorpago(String valorpago) {
        this.valorpago = valorpago;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
     public String getFormadepagamento() {
        return formadepagamento;
    }

    public void setFormadepagamento(String formadepagamento) {
        this.formadepagamento = formadepagamento;
    }
    
    
}
