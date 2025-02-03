package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class ColorVectorBulletRenderer implements IBulletRenderer {
    @Override
    public void render(Graphics g, double x, double y) {
        g.setColor(Color.BLACK);
        g.drawLine((int) x, (int) y, (int) x, (int) y - Bullet.HEIGHT);
    }
}
