/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.ModeloCadastrarFuncionario;
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
public class ControlCadastroFuncionario extends ControlCadastro{
    
    ArrayList<ModeloCadastrarFuncionario> lista=new ArrayList<>();
   
public void salvardados(BufferedWriter conexao, ModeloCadastrarFuncionario mdc){
/* - Você pode obter várias informações sobre o arquivo, como o caminho absoluto, nome do arquivo, se é um diretório, tamanho do arquivo, etc.

   ```java
   System.out.println("Caminho absoluto: " + arquivo.getAbsolutePath());
   System.out.println("Nome do arquivo: " + arquivo.getName());
   System.out.println("É um diretório? " + arquivo.isDirectory());
   System.out.println("Tamanho do arquivo: " + arquivo.length() + " bytes");*/
    try {
        conexao.write(mdc.getNome() +";");
        conexao.write(mdc.getNacionalidade() +";");
        conexao.write(mdc.getSexo() +";");
        conexao.write(mdc.getUsername()+";");
        conexao.write(mdc.getPalavrapasse()+";");
        conexao.write(mdc.getPrivilegio()+";");
        conexao.write(mdc.getData()+"; \n");
        
    } catch (Exception e) {

        JOptionPane.showMessageDialog(null, e.getMessage());
    }

}

//POLIMORFISMO
@Override
public void actualizarArquivo(){

    try {
        int linha=0;
        BufferedWriter conexao;
        conexao=new BufferedWriter(new FileWriter("CadastroFuncionario.txt"));
    while((linha<lista.size())){
    String nome,nacionalidade,sexo,data,username,privilegio,palavra;
    nome=lista.get(linha).getNome();
    nacionalidade=lista.get(linha).getNacionalidade();
    sexo=lista.get(linha).getSexo();
    username=lista.get(linha).getUsername();
    palavra=lista.get(linha).getPalavrapasse();
    privilegio=lista.get(linha).getData();
     Date Datacad=new Date();
          SimpleDateFormat ft=new SimpleDateFormat("dd-mm-yyyy");
          data=ft.format(Datacad);
        
    
    ModeloCadastrarFuncionario mdc=new ModeloCadastrarFuncionario(nome,nacionalidade,sexo,username,palavra,privilegio,data);
    salvardados(conexao, mdc);
    linha++;
    }
    conexao.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }


}
//POLIMORFISMO
@Override
public void preencherarraylist(){

    try {
        
        int linha=0;
        BufferedReader leitura=new BufferedReader(new FileReader("CadastroFuncionario.txt"));
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
            String nacionalidade=campo[1];
            String sexo=campo[2];
            String username=campo[3];
            String palavra=campo[4];
            String privilegio=campo[5];
            String data=campo[6];
            /*após isso chamamos o nosso método salvar e no nosso método salvar
            passamos os como parámetro os nossos dados que temos e estes por sua vez são salvos na lista(vetor)*/
            ModeloCadastrarFuncionario md=new ModeloCadastrarFuncionario(nome, nacionalidade, sexo,username,palavra,privilegio,data);
            lista.add(md);
            linhalida=leitura.readLine();
        }
        leitura.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}
//POLIMORFISMO
@Override
public Object[][] transformarlistaobjeto(){
    int linha=0, tamanho=0;
        tamanho=lista.size();
        Object[][] dados=new Object[tamanho][7];
    try {
        while(linha<lista.size()){
        
        dados[linha][0]=lista.get(linha).getNome();
        dados[linha][1]=lista.get(linha).getNacionalidade();
        dados[linha][2]=lista.get(linha).getSexo();
        dados[linha][3]=lista.get(linha).getUsername();
        dados[linha][4]=lista.get(linha).getPalavrapasse();
        dados[linha][5]=lista.get(linha).getPrivilegio();
        dados[linha][6]=lista.get(linha).getData();
        linha++;
        }
        
    } catch (Exception e) {
   JOptionPane.showMessageDialog(null, e.getMessage());
    }



return dados;
}


 public static void removerElemento(BufferedReader conexa, String linha) {
        try {
            
            java.io.File inputFile = new java.io.File("CadastroFuncionario.txt");
            java.io.File tempFile = new java.io.File("tempfile.txt");

            BufferedReader ler = new BufferedReader(new FileReader("CadastroFuncionario.txt"));
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
 
 
 
 public static void pesquisarNoArquivo(BufferedReader leitura, String pesquisa) {
        try (BufferedReader reader = new BufferedReader(new FileReader("CadastroFuncionario.txt"))) {
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
           BufferedReader ler=new BufferedReader(new FileReader("CadastroFuncionario.txt"));
           String linhaLida;
           linhaLida=ler.readLine();
           while(linha<lista.size()){
           lista.removeAll(lista);
           linha++;
           }
           while(linhaLida!=null){
           if(linhaLida.contains(dados)){
           String campo[]=linhaLida.split(";");
           String nome =campo[0];
           String nacionalidade=campo[1];
           String sexo=campo[2];
           String username=campo[3];
           String palavra=campo[4];
           String privilegio=campo[5];
           String data=campo[6];
           ModeloCadastrarFuncionario mc=new ModeloCadastrarFuncionario(nome,nacionalidade,sexo,username,palavra,privilegio,data);
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
