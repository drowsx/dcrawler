package com.exodev.dcrawler;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;

public class Game extends ApplicationAdapter {
	public static int WIDTH,HEIGHT;
	public static GameWorld gameWorld;
	GestureHandler gH;
	public static enum STATE{
		GAME, INV;
	};
	public static STATE state;
	@Override
	public void create () {

		UpdateClass.init();
		RenderClass.init();
		TextureHandler.loadTextures();

		WIDTH=Gdx.graphics.getWidth();
		HEIGHT=Gdx.graphics.getHeight();

		gH=new GestureHandler();
		Gdx.input.setInputProcessor(gH);

		state=STATE.GAME;

		gameWorld=new GameWorld();
		gameWorld.fill();
	}

	public static void changeState() {
		if (state == STATE.GAME) {
			state = STATE.INV;
		} else state = STATE.GAME;
	}

	@Override
	public void render () {
		UpdateClass.update();
		RenderClass.render();
	}
	@Override
	public void dispose(){
		TextureHandler.dispose();
	}
}
