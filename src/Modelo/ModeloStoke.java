/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author IMMilengo
 */
public class ModeloStoke {
    
      
  private String Nomepro;
  private String quantidadepro;
  private String Precopro;
  private String Id;
  private String data;
  private String validade;

    public ModeloStoke(String Nomepro, String quantidadepro, String Precopro, String Id, String data, String validade) {
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
