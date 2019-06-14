package globattack;
import processing.core.PApplet;


class Enemy extends GlobAttack {
    float x, y, vx, vy;
    public static void main(String[] args) {
        PApplet.main("globattack.Enemy");
    }

    Enemy(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void drawEnemy() {
        rectMode(CENTER);
        fill(255, 102, 102);
        rect(x, y, 25, 25);
    }

    public void move(float px, float py) {
        float angle = atan2(py - y, px - x);
        vx = cos(angle);
        vy = sin(angle);
        x += vx * enemySpeed;
        y += vy * enemySpeed;
    }
}
  