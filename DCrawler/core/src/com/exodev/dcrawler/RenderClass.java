package com.exodev.dcrawler;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RenderClass {
    static SpriteBatch batch;
    public static void init() {
        batch = new SpriteBatch();

    }

    public static void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();

        Game.gameWorld.render(batch);

        batch.end();

    }
}
