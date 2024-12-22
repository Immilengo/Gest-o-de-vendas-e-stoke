/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.ModeloInventario;
import Modelo.ModeloRegistroDeLogin;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author IMMilengo
 */
public class ControlRegistroLogin {
    
     ArrayList<ModeloRegistroDeLogin> lista=new ArrayList<>();
public void preencherarraylist(){

    try {
        
        int linha=0;
        BufferedReader leitura=new BufferedReader(new FileReader("login.txt"));
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
          
            /*após isso chamamos o nosso método salvar e no nosso método salvar
            passamos os como parámetro os nossos dados que temos e estes por sua vez são salvos na lista(vetor)*/
            ModeloRegistroDeLogin mi=new ModeloRegistroDeLogin(nomedoproduto,quantidadeunidades,valorpago);
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
        Object[][] dados=new Object[tamanho][3];
    try {
        while(linha<lista.size()){
        
        dados[linha][0]=lista.get(linha).getNomeusuario();
        dados[linha][1]=lista.get(linha).getSenha();
        dados[linha][2]=lista.get(linha).getData();
        linha++;
        }
        
    } catch (Exception e) {
   JOptionPane.showMessageDialog(null, e.getMessage());
    }



return dados;
}
    
}
