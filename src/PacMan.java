// Classe do PacMan

public class PacMan {
    private int lives;
    private int speed;

    public PacMan() {
        this.lives = 3;
        this.speed = 5;
    }

    public int getLives() {
        return lives;
    }

    public int getSpeed() {
        return speed;
    }

    public void loseLife() {
        if (lives > 0) lives--;
    }

    public void gainLife() {
        lives++;
    }
}
