package interfaz;

import services.Wallet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static services.Main.ventana;

public class OptionPanel extends JPanel {

    public OptionPanel(Wallet wallet) {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;

        addLabel(c, "Precios", 0, 0);
        addLabel(c, "BitCoin", 0, 1);
        addLabel(c, "Ethereum", 0, 2);
        addLabel(c, "DogeCoin", 0, 3);
        addButton(c, "Actualizar Precios", 0, 4, e -> {
            wallet.acturalizarPrecios();
            ventana.repintarOptions();
        });

        addLabel(c, wallet.getBitCoinStatus().getPrice().toString(), 1, 1);
        addLabel(c, wallet.getEthereumStatus().getPrice().toString(), 1, 2);
        addLabel(c, wallet.getDogeCoinStatus().getPrice().toString(), 1, 3);

        addButton(c, "Comprar BitCoin", 2, 1, e -> {
            wallet.aceptarTransaccion(wallet.precioTransaccion(Wallet.BITCOIN), Wallet.BITCOIN);
            ventana.repintarWallet();
        });
        addButton(c, "Comprar Ethereum", 2, 2, e -> {
            wallet.aceptarTransaccion(wallet.precioTransaccion(Wallet.ETHEREUM), Wallet.ETHEREUM);
            ventana.repintarWallet();
        });
        addButton(c, "Comprar DogeCoin", 2, 3, e -> {
            wallet.aceptarTransaccion(wallet.precioTransaccion(Wallet.DOGECOIN), Wallet.DOGECOIN);
            ventana.repintarWallet();
        });

        addLabel(c, "powered by CoinGekoAPI", 3, 4);
    }

    private void addLabel(GridBagConstraints c, String text, int x, int y) {
        c.gridx = x;
        c.gridy = y;
        add(new JLabel(text), c);
    }

    private void addButton(GridBagConstraints c, String text, int x, int y, ActionListener actionListener) {
        c.gridx = x;
        c.gridy = y;
        JButton button = new JButton(text);
        button.addActionListener(actionListener);
        add(button, c);
    }
}
