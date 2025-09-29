/*
 Bibliotecas importadas para manipulação gráfica:
 --> javax.swing = componentes mais modernos (JFrame, JPanel, JButton, JLabel etc.).
 --> java.awt = base para desenho gráfico e manipulação de eventos.
// JFrame = janela
// JPanel = a área dentro da janela onde você desenha ou coloca outros elementos.
*/

// Ao usar o * pega JFrame, JPanel, JButton, JLabel etc., sem precisar importar uma a uma; Mas não importa sub pacotes. Exemplo: javax.swing.event.*
import javax.swing.*;
import java.awt.*;

// Subclasse de JFrame
public class GameWindow extends JFrame{

    // cria fora pq vai ser usado em outros metodos
    JLabel livesLabel;

    // A constructor
    GameWindow() {
        this.setTitle("PacMan"); // Muda o titulo do programa
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // quando clica em sair, fecha o programa
        this.setResizable(false); // não pode mudar de tamanho
        this.setSize(1080, 720); // tamanho da tela
        this.getContentPane().setBackground(new Color(127, 127, 127)); // troca a cor do bg
        this.setLocationRelativeTo(null); // Centraliza na tela

        ImageIcon pacmanLogo = new ImageIcon("PacMan.png");
        this.setIconImage(pacmanLogo.getImage()); // troca o ícone do frame

        // Label de vidas
        livesLabel = new JLabel("Lives: 3");
        livesLabel.setBounds(20, 20, 100, 30); // posição no frame
        this.setLayout(null); // layout absoluto para usar setBounds
        this.add(livesLabel);

        this.setVisible(true); // mostra a tela, deixa por ULTIMO para evitar erros
    }

    // method para atualizar vidas
    public void updateLives(int lives) {
        livesLabel.setText("Lives: " + lives);
    }

}
