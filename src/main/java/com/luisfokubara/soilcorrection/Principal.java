package com.luisfokubara.soilcorrection;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Principal {
    public Principal() {
        cbTexturaSolo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                switch (cbTexturaSolo.getSelectedIndex()) {
                    case 0:
                        lblTextura.setText("+ 40% de argila");
                        break;
                    case 1:
                        lblTextura.setText("25 a 40% de argila");
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Equilibrio e correção CTC");
        frame.setContentPane(new Principal().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    private JPanel panelPrincipal;
    private JTextField txtLote;
    private JTextField txtMunicipio;
    private JTextField txtAreaTotal;
    private JTextField txtTalhao;
    private JTextField txtMatriculaLote;
    private JTextField txtAreaTalhao;
    private JTextField txtProduto;
    private JTextField txtData;
    private JComboBox cbTexturaSolo;
    private JComboBox cbSistemaCultivo;
    private JLabel lblTextura;
    private JLabel lblCultivo;
    private JTextField txtResponsavel;

}
