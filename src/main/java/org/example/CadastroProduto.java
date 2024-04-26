package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroProduto extends JFrame {
    public CadastroProduto() {
        setTitle("Cadastro de Produto");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JLabel lblNome = new JLabel("Nome do Produto:");
        JTextField txtNome = new JTextField(20);

        JLabel lblDataValidade = new JLabel("Data de Validade:");
        JTextField txtDataValidade = new JTextField(20);

        JButton btnCadastrar = new JButton("Cadastrar");

        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String dataValidade = txtDataValidade.getText();
                JOptionPane.showMessageDialog(null, "Produto cadastrado:\nNome: " + nome + "\nData de Validade: " + dataValidade);
            }
        });

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(lblNome);
        panel.add(txtNome);
        panel.add(lblDataValidade);
        panel.add(txtDataValidade);
        panel.add(btnCadastrar);

        add(panel);
    }
}