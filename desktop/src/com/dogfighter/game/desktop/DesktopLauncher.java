package com.dogfighter.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dogfighter.game.dogFighter;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = dogFighter.WIDTH;
		config.height = dogFighter.HEIGHT;
		config.title = dogFighter.TITLE;
		new LwjglApplication(new dogFighter(), config);
	}
}
