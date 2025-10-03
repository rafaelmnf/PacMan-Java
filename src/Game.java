
public class Game {

    public static void main(String[] args){
        GameWindow window = new GameWindow(); // cria a janela
        PacMan pacman = new PacMan(); // cria o pacman

        // Exemplo de atualização do JLabel
        window.updateLives(pacman.getLives()); // mostra vidas iniciais
        window.updatePoints(pacman.getPoints()); // ganha pontos
    }
}
