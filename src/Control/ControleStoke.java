/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.ModeloCadastrarProduto;
import Modelo.ModeloStoke;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author IMMilengo
 */
public class ControleStoke {
  
    
    
ArrayList<ModeloCadastrarProduto> lista=new ArrayList<>();
public void salvardados(BufferedWriter conexao, ModeloStoke mcp){

    try {
        conexao.write(mcp.getNomepro() +";");
        conexao.write(mcp.getPrecopro() +";");
        conexao.write(mcp.getQuantidadepro() +";");
        conexao.write(mcp.getId()+";");
        conexao.write(mcp.getData()+";");
        conexao.write(mcp.getValidade()+"; \n");
        
    } catch (Exception e) {

        JOptionPane.showMessageDialog(null, e.getMessage());
    }

}
public void actualizarArquivo(){

    try {
        int linha=0;
        BufferedWriter conexao;
        conexao=new BufferedWriter(new FileWriter("Stoke.txt"));
    while((linha<lista.size())){
    String nomepro,precopro,quantidadepro;
    nomepro=lista.get(linha).getNomepro();
    precopro=lista.get(linha).getPrecopro();
    quantidadepro=lista.get(linha).getQuantidadepro();
    String id=lista.get(linha).getId();
          Date Datacad=new Date();
          SimpleDateFormat ft=new SimpleDateFormat("dd-mm-yyyy");
    String data=lista.get(linha).getData();
    String validade=lista.get(linha).getValidade();
    
    ModeloCadastrarProduto mcp=new ModeloCadastrarProduto(nomepro,precopro,quantidadepro,id,data,validade);
    //salvardados(conexao, mcp);
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
        BufferedReader leitura=new BufferedReader(new FileReader("Stoke.txt"));
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
            String id=campo[3];
            String data=campo[4];
            String validade=campo[5];
            /*após isso chamamos o nosso método salvar e no nosso método salvar
            passamos os como parámetro os nossos dados que temos e estes por sua vez são salvos na lista(vetor)*/
            ModeloCadastrarProduto md=new ModeloCadastrarProduto(nomepro,precopro,quantidadepro,id,data,validade);
            lista.add(md);
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
        Object[][] dados=new Object[tamanho][6];
    try {
        while(linha<lista.size()){
        
        dados[linha][0]=lista.get(linha).getNomepro();
        dados[linha][1]=lista.get(linha).getPrecopro();
        dados[linha][2]=lista.get(linha).getQuantidadepro();
        dados[linha][3]=lista.get(linha).getId();
        dados[linha][4]=lista.get(linha).getData();
        dados[linha][5]=lista.get(linha).getValidade();
        linha++;
        }
        
    } catch (Exception e) {
   JOptionPane.showMessageDialog(null, e.getMessage());
    }



return dados;
}
    

 public static void removerElemento(BufferedReader conexa, String linha) {
        try {
            
            java.io.File inputFile = new java.io.File("Stoke.txt");
            java.io.File tempFile = new java.io.File("tempfileStoke.txt.txt");

            BufferedReader ler = new BufferedReader(new FileReader("Stoke.txt"));
            BufferedWriter escrever = new BufferedWriter(new FileWriter("tempfileStoke.txt"));

            String linhaAtual;

            while ((linhaAtual = ler.readLine()) != null) {
                // Verifica se a linha contém o elemento a ser removido
                if (linhaAtual.contains(linha)) {
                    escrever.write(linhaAtual + System.getProperty("\n"));
                }
            }
            escrever.write(0);
            escrever.close();
            ler.close();

            // Renomeia o arquivo temporário para substituir o original
            tempFile.renameTo(inputFile);
            JOptionPane.showMessageDialog(null,"Elemento Removido com Sucesso");

          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERRO DETETADO");
        }

}
 
 
 
 public static void pesquisarNoArquivo(BufferedReader leitura, String pesquisa) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Stoke.txt"))) {
            String linhaAtual;
            int numeroLinha = 0;

            while ((linhaAtual = reader.readLine()) != null) {
                numeroLinha++;
                if (linhaAtual.contains(pesquisa)) {
                    System.out.println("Termo encontrado na linha " + numeroLinha + ": " + linhaAtual);
              JOptionPane.showMessageDialog(null,"Linha"+numeroLinha+":" +linhaAtual);
                }
            }

        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"ERRO Encontrado");
        }
 
 
}

    public void pesquisar(String dados) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
           int linha=0;
           BufferedReader ler=new BufferedReader(new FileReader("Stoke.txt"));
           String linhaLida;
           linhaLida=ler.readLine();
           while(linha<lista.size()){
           lista.removeAll(lista);
           linha++;
           }
           while(linhaLida!=null){
           if(linhaLida.contains(dados)){
           String campo[]=linhaLida.split(";");
           String produto =campo[0];
           String preco=campo[1];
           String quantidade=campo[2];
           String id=campo[3];
           String data=campo[4];
           String validade=campo[5];
           ModeloCadastrarProduto mc=new ModeloCadastrarProduto(produto,preco,quantidade,id,data,validade);
           lista.add(mc);
           break;
           }
           linhaLida=ler.readLine();
           }
           ler.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    
    }


    
}


