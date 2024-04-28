package interfaz;

import services.Wallet;

import javax.swing.*;
import java.awt.*;

import static services.Main.ventana;

public class WalletPanel extends JPanel {
    private JLabel numeroBitcoin;
    private JLabel numeroEthereum;
    private JLabel numeroDogeCoin;
    private JLabel numeroDollar;
    private JButton addDollar;

    public WalletPanel(Wallet wallet) {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        setBackground(Color.LIGHT_GRAY);

        numeroBitcoin = new JLabel(wallet.getBitCoins().toString());
        numeroEthereum = new JLabel(wallet.getEthereum().toString());
        numeroDogeCoin = new JLabel(wallet.getDogeCoin().toString());
        numeroDollar = new JLabel(wallet.getEuros().toString());

        addLabel(c, "Nombre Usuario", 0, 0);
        addLabel(c, "Bitcoin", 0, 1);
        addLabel(c, numeroBitcoin.getText(), 1, 1);
        addLabel(c, "Ethereum", 0, 2);
        addLabel(c, numeroEthereum.getText(), 1, 2);
        addLabel(c, "DogeCoin", 0, 3);
        addLabel(c, numeroDogeCoin.getText(), 1, 3);
        addLabel(c, "Dollar", 0, 4);
        addLabel(c, numeroDollar.getText(), 1, 4);

        c.gridx = 0;
        c.gridy = 5;
        add(Box.createVerticalStrut(20), c);

        addDollar = new JButton("add Dollar");
        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 2;
        add(addDollar, c);
        addDollar.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Introduce el numero de Dolares que vas a añadir");
            double dollars = Double.parseDouble(input);
            wallet.setEuros(wallet.getEuros() + dollars);
            ventana.repintarWallet();
        });

        setVisible(true);
    }

    private void addLabel(GridBagConstraints c, String text, int x, int y) {
        c.gridx = x;
        c.gridy = y;
        add(new JLabel(text), c);
    }
}
