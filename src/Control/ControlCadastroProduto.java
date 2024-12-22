/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.ModeloCadastrarProduto;
import Modelo.ModeloRealizarVenda;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author IMMilengo
 */
public class ControlCadastroProduto extends ControlCadastro{
    
    
//ArrayList<ModeloCadastrarProduto> lista=new ArrayList<>();


    public void AddPrateleira(ModeloCadastrarProduto prateleira){
        String atualizar = null;
        ArrayList<String> listar=new ArrayList();
        try {
           
        BufferedReader le=new BufferedReader(new FileReader("CadastroProduto.txt"));
        String novo=prateleira.getProdutoAdd();
        String linha;
        while((linha=le.readLine())!=null){
        if(linha.contains(novo)){
        atualizar=linha;
        }else{
        listar.add(linha);
        }
          }
        if(listar.contains(novo)){
        
        BufferedWriter escritorio=new BufferedWriter(new FileWriter("CadastroProduto.txt"));
        String partir[]=atualizar.split(";");
        int novaprat=Integer.parseInt(partir[2])+prateleira.getQuantidadeAdd();
        for(String lista:listar){
        escritorio.write(lista+"\n");
            System.out.println(lista);
        }
        escritorio.write(partir[0]+";"+partir[1]+";"+String.valueOf(novaprat)+";"+partir[3]+";"+partir[4]+";\n");
        
        escritorio.close();
        
        
        }else{
            BufferedWriter escrito=new BufferedWriter(new FileWriter("CadastroProduto.txt",true));
            
            escrito.write(prateleira.getLinhaAdd());
            escrito.close();
        
        }
     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no Control Adicionar a Paleta");
        }
    }


    
}
