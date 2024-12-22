/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import View.MenuPrincipalAdm;
import View.TelaPrincipall;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author IMMilengo
 */
public class ControlTelaDeLogin {

    public void acesso1() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     TelaPrincipall tp=new TelaPrincipall();
            tp.setVisible(true);
            JOptionPane.showMessageDialog(null,"Login Feito Com SUCESSO");
    }
     public void acesso2() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    MenuPrincipalAdm mp=new MenuPrincipalAdm();
            mp.setVisible(true);
            JOptionPane.showMessageDialog(null,"Login Feito Com SUCESSO");
    }
    
     
     
     
  
    private static final int MAX_TENTATIVAS = 3;

         public static boolean verificarAcesso(String usuario, String senha) {
        int numTentativas = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("CadastroFuncionario.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");

                String usuarioBD = dados[0];
                String senhaBD = dados[3];
                int tentativasBD = 2;//Integer.parseInt(dados[2]);

                if (usuario.equals(usuarioBD) && senha.equals(senhaBD)) {
                    if (tentativasBD < MAX_TENTATIVAS) {
                        // Atualiza o número de tentativas no arquivo
        atualizarTentativas(usuarioBD, senhaBD, tentativasBD, 0);
                        return true;
                    }
                } else if (usuario.equals(usuarioBD)) {
                    numTentativas = tentativasBD + 1;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (numTentativas < MAX_TENTATIVAS) {
            // Atualiza o número de tentativas no arquivo
            atualizarTentativas(usuario, senha, numTentativas, 1);
        }

        return false;
    }

    public static void atualizarTentativas(String usuario, String senha, int tentativas, int operacao) {
        try (BufferedReader br = new BufferedReader(new FileReader("CadastroFuncionario.txt"));
             FileWriter fw = new FileWriter("Tentativas.txt", true)) {

            StringBuilder conteudo = new StringBuilder();
            String linha;

            // Atualiza o número de tentativas no arquivo
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados[0].equals(usuario) && dados[3].equals(senha)) {
                    int novasTentativas = operacao == 0 ? tentativas : 2 + 1;
                    conteudo.append(usuario).append(";").append(senha).append(";").append(novasTentativas).append("\n");
                } else {
                    conteudo.append(linha).append("\n");
                }
            }

            fw.write
            (conteudo.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    
}
