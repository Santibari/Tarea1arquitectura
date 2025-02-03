package com.balitechy.spacewar.main;

import java.awt.image.BufferedImage;

public class VectorRendererFactory extends AbstractVectorRendererFactory {
    @Override
    public IPlayerRenderer createPlayerRenderer(BufferedImage image) {
        return new VectorPlayerRenderer(); // Usa la clase corregida
    }

    @Override
    public IBulletRenderer createBulletRenderer(BufferedImage image) {
        return new VectorBulletRenderer(); // Usa la clase corregida
    }

    @Override
    public IBackgroundRenderer createBackgroundRenderer(BufferedImage image) {
        return new VectorBackgroundRenderer(); // Usa la clase corregida
    }

    @Override
    protected IPlayerRenderer createVectorPlayerRenderer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected IBulletRenderer createVectorBulletRenderer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected IBackgroundRenderer createVectorBackgroundRenderer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
