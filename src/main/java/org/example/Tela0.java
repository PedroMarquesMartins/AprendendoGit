package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Tela0 extends JFrame {

    private JPanel painel1;
    private JButton btn1;
    private JTextField textFieldNome;
    private JTextField textFieldData;

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

        JLabel lblNome = new JLabel("Nome:");
        textFieldNome = new JTextField(15);

        JLabel lblData = new JLabel("Data:");
        textFieldData = new JTextField(15);

        btn1 = new JButton("Cadastrar");

        painel1.add(jlabel);
        painel1.add(lblNome);
        painel1.add(textFieldNome);
        painel1.add(lblData);
        painel1.add(textFieldData);
        painel1.add(btn1);

        add(painel1, BorderLayout.CENTER);
    }

    public void acoes() {
        btn1.addActionListener((ActionEvent e) -> {
            //Logica para salvar
        });
    }
}