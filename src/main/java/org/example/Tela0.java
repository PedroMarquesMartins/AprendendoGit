package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela0 extends JFrame {

    private JPanel painel1;
    private JButton btn2;
    private JButton btn1;


    public Tela0() {
        configuracoes();
        alocaComponentes();
        acoes();
    }

    private void configuracoes() {
        setTitle("Início");
        setSize(400, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void alocaComponentes() {

        painel1 = new JPanel(new FlowLayout());
        painel1.setBackground(Color.WHITE);

        JLabel jlabel = new JLabel("Bem-vindo ao programa!\n\n");

        btn1 = new JButton("Cadastrar");
        btn2= new JButton("Listar");

        painel1.add(jlabel);
        painel1.add(btn1);
        painel1.add(btn2);

        add(painel1, BorderLayout.CENTER);
    }

    public void acoes() {
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //CadastroProduto telaCadastro = new CadastroProduto();
                //telaCadastro.setVisible(true);
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ListagemProdutos telaListagem = new ListagemProdutos();
                telaListagem.setVisible(true);
            }
        });
    }
}