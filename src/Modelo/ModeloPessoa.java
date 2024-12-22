      /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author IMMilengo
 */
public abstract class ModeloPessoa {
    
private String nome;
private String nacionalidade;
private String sexo;
private String username;
private String palavrapasse;
private String privilegio;
private String data;

    public ModeloPessoa (String nome, String nacionalidade, String sexo, String username, String palavrapasse, String privilegio, String data) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
        this.username = username;
        this.palavrapasse = palavrapasse;
        this.privilegio = privilegio;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPalavrapasse() {
        return palavrapasse;
    }

    public void setPalavrapasse(String palavrapasse) {
        this.palavrapasse = palavrapasse;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

   
    
    
}
