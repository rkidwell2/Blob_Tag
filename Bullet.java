package globattack;

import processing.core.PApplet;

class Bullet extends GlobAttack {
    float x, y, vx, vy;
    public static void main(String[] args) {
        PApplet.main("globattack.Bullet");
    }

    Bullet(float x, float y, float vx, float vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    void drawBullet() {
        fill(0, 255, 0);
        ellipse(x, y, 10, 10);
    }
    void move() {
        x += vx;
        y += vy;
    }
}



