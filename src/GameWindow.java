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


    JLabel livesLabel; // cria fora pq vai ser usado em outros metodos
    JLabel pointsLabel;

    // Construtor
    GameWindow() {

        ImageIcon pacmanLogo = new ImageIcon("PacMan.png");

        ImageIcon lifeLogo = new ImageIcon("life.png");
        // Pega a imagem original e define um novo tamanho (exemplo: 30x30 pixels)
        Image lifeLogoSmall = lifeLogo.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        // Cria novo ImageIcon com a imagem redimensionada
        ImageIcon resizedLifeLogo = new ImageIcon(lifeLogoSmall);

        this.setTitle("PacMan"); // Muda o titulo do programa
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // quando clica em sair, fecha o programa
        this.setResizable(false); // não pode mudar de tamanho a tela
        this.setSize(720, 480); // tamanho da tela
        this.getContentPane().setBackground(new Color(127, 127, 127)); // troca a cor do bg
        this.setLocationRelativeTo(null); // Centraliza a tela
        /* this.setLayout(null); layout absoluto faz com que tudo o que for criado tenha que ser especificado pelo setBounds(x,y,width,height)
         Ou seja, por padrão, o texto/ imagem vem com um tamanho e posição, agora vem sem nada, devendo especificar sua posição inicial
         fazendo isso, deveria especificar: livesLabel.setBounds(20, 15, 80, 40);*/
        this.setIconImage(pacmanLogo.getImage()); // troca o ícone do frame

        /* FlowLayout (layout de fluxo), que organiza os componentes como se fossem “palavras em uma frase”: um ao lado
        do outro, na horizontal, e quebra a linha quando não cabe mais */
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

        // Label de vidas
        livesLabel = new JLabel("Lives: 3");

        livesLabel.setFont(new Font("Arial", Font.BOLD, 24));
        livesLabel.setIcon(resizedLifeLogo);

        // Label de pontos
        pointsLabel = new JLabel("Score: 0");
        pointsLabel.setFont(new Font("Arial", Font.BOLD, 24));


        // Add os componentes ao frame
        this.add(livesLabel);
        this.add(pointsLabel);

        this.setVisible(true); // mostra a tela, deixa por ULTIMO para evitar erros
    }

    // method para atualizar vidas
    public void updateLives(int lives) {
        livesLabel.setText("Lives: " + lives);
    }
    public void updatePoints(int points) { pointsLabel.setText("Points: " + points); }

}
