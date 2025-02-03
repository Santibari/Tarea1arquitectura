/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

public abstract class AbstractVectorRendererFactory extends RendererFactory {
    @Override
    public IPlayerRenderer createPlayerRenderer(java.awt.image.BufferedImage image) {
        return createVectorPlayerRenderer();
    }

    @Override
    public IBulletRenderer createBulletRenderer(java.awt.image.BufferedImage image) {
        return createVectorBulletRenderer();
    }

    @Override
    public IBackgroundRenderer createBackgroundRenderer(java.awt.image.BufferedImage image) {
        return createVectorBackgroundRenderer();
    }

    protected abstract IPlayerRenderer createVectorPlayerRenderer();
    protected abstract IBulletRenderer createVectorBulletRenderer();
    protected abstract IBackgroundRenderer createVectorBackgroundRenderer();
}

