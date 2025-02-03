package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class VectorPlayerRenderer implements IPlayerRenderer {
    @Override
    public void render(Graphics g, double x, double y) {
        g.setColor(Color.BLACK);

        // Definir las coordenadas del triángulo
        int[] xPoints = {(int) x, (int) x - 15, (int) x + 15}; // Base más ancha
        int[] yPoints = {(int) y, (int) y + 30, (int) y + 30};

        g.drawPolygon(xPoints, yPoints, 3); // Dibuja el contorno del triángulo

        // Agregar detalles internos para darle forma al jugador
        g.drawLine((int) x, (int) y, (int) x, (int) y + 20); // Línea central
        g.drawLine((int) x - 7, (int) y + 15, (int) x + 7, (int) y + 15); // Línea horizontal interna
    }
}
