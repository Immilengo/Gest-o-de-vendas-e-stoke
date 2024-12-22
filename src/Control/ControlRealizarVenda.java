/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.ModeloRealizarVenda;
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
public class ControlRealizarVenda {
    ArrayList<ModeloRealizarVenda> lista=new ArrayList<>();
    
    
public void preencherarraylist(){

    try {
        
        int linha=0;
        BufferedReader leitura=new BufferedReader(new FileReader("CadastroProduto.txt"));
        String linhalida;
        linhalida=leitura.readLine();
        while(linha<lista.size()){
            lista.removeAll(lista);
            linha++;
        }
        while (linhalida != null/*vazio*/) {
            String campo[]=linhalida.split(";");//Preenchemos cada campo com cada linha lida. o split acrescentará um caracter d separação
            //definiremos as variáveis e suas respectivas posições no vetor,e o elemento da posição tal vai preencher a variável tal
            String nome =campo[0];
            String preco=campo[1];
            String quantidade=campo[2];
            String id=campo[3];
            
            /*após isso chamamos o nosso método salvar e no nosso método salvar
            passamos os como parámetro os nossos dados que temos e estes por sua vez são salvos na lista(vetor)*/
            ModeloRealizarVenda md=new ModeloRealizarVenda(nome, preco,id);
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
        Object[][] dados=new Object[tamanho][3];
    try {
        while(linha<lista.size()){
        
        dados[linha][0]=lista.get(linha).getProduto();
        dados[linha][1]=lista.get(linha).getPreco();
        dados[linha][2]=lista.get(linha).getId();
       // linha++;
        }
        
    } catch (Exception e) {
   JOptionPane.showMessageDialog(null, e.getMessage());
    }



return dados;
}
public void voltar(){





}

/*
 public static void removerElemento(BufferedReader conexa, String linha) {
        try {
            
            java.io.File inputFile = new java.io.File("Cadastro.txt");
            java.io.File tempFile = new java.io.File("tempfile.txt");

            BufferedReader ler = new BufferedReader(new FileReader("Cadastro.txt"));
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
 
    */
}