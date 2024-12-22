/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.ModeloCadastrarFuncionario;
import Modelo.ModeloInventario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author IMMilengo
 */
public class ControlInventario {
    ArrayList<ModeloInventario>lista=new ArrayList<>();
    public void historico(BufferedWriter escritor,ModeloInventario mi){
        try {
          
    escritor.write(mi.getProduto()+";");
    escritor.write(mi.getQuantidade()+";");
    escritor.write(mi.getValorpago()+";");
    escritor.write(mi.getData()+";\n");
    
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null,"Problema no controlo");
        }
    
    
    }
    
    
public void preencherarraylist(){

    try {
        
        int linha=0;
        BufferedReader leitura=new BufferedReader(new FileReader("Historico.txt"));
        String linhalida;
        linhalida=leitura.readLine();
        while(linha<lista.size()){
            lista.removeAll(lista);
            linha++;
        }
        while (linhalida != null/*vazio*/) {
            String campo[]=linhalida.split(";");//Preenchemos cada campo com cada linha lida. o split acrescentará um caracter d separação
            //definiremos as variáveis e suas respectivas posições no vetor,e o elemento da posição tal vai preencher a variável tal
            String nomedoproduto =campo[0];
            String quantidadeunidades=campo[1];
            String valorpago=campo[2];
            //LocalDate data=LocalDate.now();
            //String dia=data.toString();
            String dia=campo[3];
            /*após isso chamamos o nosso método salvar e no nosso método salvar
            passamos os como parámetro os nossos dados que temos e estes por sua vez são salvos na lista(vetor)*/
            ModeloInventario mi=new ModeloInventario(nomedoproduto,quantidadeunidades,valorpago,dia);
            lista.add(mi);
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
        Object[][] dados=new Object[tamanho][4];
    try {
        while(linha<lista.size()){
        
        dados[linha][0]=lista.get(linha).getProduto();
        dados[linha][1]=lista.get(linha).getQuantidade();
        dados[linha][2]=lista.get(linha).getValorpago();
        dados[linha][3]=lista.get(linha).getData();
        linha++;
        }
        
    } catch (Exception e) {
   JOptionPane.showMessageDialog(null, e.getMessage());
    }



return dados;
}
   

 public void removerElemento(BufferedReader conexa, String linha) {
        try {
            
            java.io.File inputFile = new java.io.File("Historico.txt");
            java.io.File tempFile = new java.io.File("tempfile.txt");

            BufferedReader ler = new BufferedReader(new FileReader("Historico.txt"));
            BufferedWriter escrever = new BufferedWriter(new FileWriter("tempfile.txt"));

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

 
    public void pesquisar(String dados) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
           int linha=0;
           BufferedReader ler=new BufferedReader(new FileReader("Historico.txt"));
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
           String quantidade=campo[1];
           String valor=campo[2];
           String data=campo[3];
           
           ModeloInventario mc=new ModeloInventario(produto,quantidade,valor,data);
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
