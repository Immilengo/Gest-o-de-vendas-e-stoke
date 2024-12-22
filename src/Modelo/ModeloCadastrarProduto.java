/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author IMMilengo
 */
public class ModeloCadastrarProduto {

      
  private String Nomepro;
  private String quantidadepro;
  private String Precopro;
  private String Id;
  private String data;
  private int quantidadeAdd;
  private String produtoAdd;
  private String linhaAdd;
  private String validade;

    public String getLinhaAdd() {
        return linhaAdd;
    }

    public void setLinhaAdd(String linhaAdd) {
        this.linhaAdd = linhaAdd;
    }
  
  public int getQuantidadeAdd() {
        return quantidadeAdd;
    }

    public void setQuantidadeAdd(int quantidadeAdd) {
        this.quantidadeAdd = quantidadeAdd;
    }

    public String getProdutoAdd() {
        return produtoAdd;
    }

    public void setProdutoAdd(String produtoAdd) {
        this.produtoAdd = produtoAdd;
    }

    public ModeloCadastrarProduto(int quantidadeAdd, String produtoAdd, String linhaAdd) {
        this.quantidadeAdd = quantidadeAdd;
        this.produtoAdd = produtoAdd;
        this.linhaAdd=linhaAdd;
    }

    public ModeloCadastrarProduto(String Nomepro, String Precopro,String quantidadepro,String Id, String data, String validade) {
        this.Nomepro = Nomepro;
        this.quantidadepro = quantidadepro;
        this.Precopro = Precopro;
          this.Id = Id;
        this.data = data;
        this.validade=validade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getNomepro() {
        return Nomepro;
    }

    public void setNomepro(String Nomepro) {
        this.Nomepro = Nomepro;
    }

    public String getQuantidadepro() {
        return quantidadepro;
    }

    public void setQuantidadepro(String quantidadepro) {
        this.quantidadepro = quantidadepro;
    }

    public String getPrecopro() {
        return Precopro;
    }

    public void setPrecopro(String Precopro) {
        this.Precopro = Precopro;
    }
  public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
  
    
}
