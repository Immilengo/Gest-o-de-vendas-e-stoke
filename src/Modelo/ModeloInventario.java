/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author IMMilengo
 */
public class ModeloInventario {
    
    private String produto;
    private String quantidade;
    private String valorpago;
    private String data;

    public ModeloInventario(String produto, String quantidade, String valorpago, String data) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorpago = valorpago;
        this.data = data;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
}
