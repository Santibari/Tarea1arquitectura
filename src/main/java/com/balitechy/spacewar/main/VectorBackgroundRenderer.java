package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

public class VectorBackgroundRenderer implements IBackgroundRenderer {
    @Override
    public void render(Graphics g, Canvas c) throws IOException {
        // Asegurar el fondo blanco
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());

        // Dibujar un círculo negro en la parte superior izquierda
        g.setColor(Color.BLACK);
        g.drawOval(50, 50, 80, 80); // Ajusta el tamaño y la posición si es necesario
    }
}
