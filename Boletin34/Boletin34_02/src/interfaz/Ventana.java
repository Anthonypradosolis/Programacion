package interfaz;

import services.Main;
import services.Wallet;

import javax.swing.*;
import java.awt.*;

import static services.Main.ventana;

public class Ventana extends JFrame {
    private static JPanel walletPanel;
    private static JPanel optionsPanel;
    private static Wallet wallet;

    public Ventana(Wallet wallet) {
        Ventana.wallet = wallet;
        initializeWindow();
        initializePanels();
    }

    private void initializeWindow() {
        setTitle("Ventana");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 600, 500);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
    }

    private void initializePanels() {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;

        walletPanel = new WalletPanel(wallet);
        c.gridx = 0;
        c.gridy = 0;
        add(walletPanel, c);

        c.gridx = 1;
        c.gridy = 0;
        add(Box.createHorizontalStrut(30), c);

        optionsPanel = new OptionPanel(wallet);
        c.gridx = 2;
        c.gridy = 0;
        add(optionsPanel, c);

        setVisible(true);
    }

    public static void repintarWallet() {
        ventana.remove(walletPanel);
        walletPanel = new WalletPanel(wallet);
        ventana.add(walletPanel);
        walletPanel.setVisible(true);
        ventana.validate();
        ventana.repaint();
    }

    public static void repintarOptions() {
        ventana.remove(optionsPanel);
        optionsPanel = new OptionPanel(wallet);
        ventana.add(optionsPanel);
        optionsPanel.setVisible(true);
        ventana.validate();
        ventana.repaint();
    }
}
