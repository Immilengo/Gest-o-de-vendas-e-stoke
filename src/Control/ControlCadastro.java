/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.ModeloCadastrarProduto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author IMMilengo
 */
public abstract class ControlCadastro {
    
ArrayList<ModeloCadastrarProduto> lista=new ArrayList<>();
public void salvardados(BufferedWriter conexao, ModeloCadastrarProduto mcp){

    try {
        conexao.write(mcp.getNomepro() +";");
        conexao.write(mcp.getPrecopro() +";");
        conexao.write(mcp.getQuantidadepro() +"; \n");
        
    } catch (Exception e) {

        JOptionPane.showMessageDialog(null, e.getMessage());
    }

}
public void actualizarArquivo(){

    try {
        int linha=0;
        BufferedWriter conexao;
        conexao=new BufferedWriter(new FileWriter("Cadastro.txt"));
    while((linha<lista.size())){
    String nomepro,precopro,quantidadepro;
    nomepro=lista.get(linha).getNomepro();
    precopro=lista.get(linha).getPrecopro();
    quantidadepro=lista.get(linha).getQuantidadepro();
    
  //  ModeloCadastrarProduto mcp=new ModeloCadastrarProduto(nomepro,precopro,quantidadepro);
  //  salvardados(conexao, mcp);
    linha++;
    }
    conexao.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }


}
public void preencherarraylist(){

    try {
        
        int linha=0;
        BufferedReader leitura=new BufferedReader(new FileReader("Cadastro.txt"));
        String linhalida;
        linhalida=leitura.readLine();
        while(linha<lista.size()){
            lista.removeAll(lista);
            linha++;
        }
        while (linhalida != null/*vazio*/) {
            String campo[]=linhalida.split(";");//Preenchemos cada campo com cada linha lida. o split acrescentará um caracter d separação
            //definiremos as variáveis e suas respectivas posições no vetor,e o elemento da posição tal vai preencher a variável tal
            String nomepro =campo[0];
            String precopro=campo[1];
            String quantidadepro=campo[2];
            /*após isso chamamos o nosso método salvar e no nosso método salvar
            passamos os como parámetro os nossos dados que temos e estes por sua vez são salvos na lista(vetor)*/
          //  ModeloCadastrarProduto md=new ModeloCadastrarProduto(nomepro, precopro, quantidadepro);
           // lista.add(md);
            linhalida=leitura.readLine();
        }
        leitura.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}

public Object[][] transformarlistaobjeto(){
    int linha=0, tamanho=0;
        tamanho=lista.size();
        Object[][] dados=new Object[tamanho][3];
    try {
        while(linha<lista.size()){
        
        dados[linha][0]=lista.get(linha).getNomepro();
        dados[linha][1]=lista.get(linha).getPrecopro();
        dados[linha][2]=lista.get(linha).getQuantidadepro();
        linha++;
        }
        
    } catch (Exception e) {
   JOptionPane.showMessageDialog(null, e.getMessage());
    }



return dados;
}
    
}
