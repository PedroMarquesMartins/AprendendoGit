package org.example;

import javax.swing.*;
import java.awt.*;

public class ListagemProdutos extends JFrame {
    public ListagemProdutos()
    {
        setTitle("Listagem de Produtos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400,300);
        setLocationRelativeTo(null);

        String [][] data = {
                {"Produto 1","03/03/2024"},
                {"Produto 2","01/04/2024"},
                {"Produto 3","30/02/2024"},
        };
        String[] columnNames = {"Nome","Data de Validade"};
        JTable table = new JTable(data,columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        JPanel panel = new JPanel (new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        add(panel);
    }
}