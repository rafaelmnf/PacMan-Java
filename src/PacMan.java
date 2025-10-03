// Classe do PacMan

public class PacMan {
    private int lives;
    private int speed;
    private int points;

    public PacMan() {
        this.lives = 3;
        this.speed = 5;
        this.points = 0;
    }

    public int getLives() {
        return lives;
    }
    public int getSpeed() {
        return speed;
    }
    public int getPoints() { return points; }


    public void loseLife() {
        if (lives > 0) lives--;
    }

    public void gainLife() {
        lives++;
    }

    public void gainPoints() { points++;}
}
