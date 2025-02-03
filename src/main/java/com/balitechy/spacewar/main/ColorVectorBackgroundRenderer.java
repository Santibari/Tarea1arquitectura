package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

public class ColorVectorBackgroundRenderer implements IBackgroundRenderer {
    @Override
    public void render(Graphics g, Canvas c) throws IOException {
        // Establece un fondo blanco
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());
    }
}
