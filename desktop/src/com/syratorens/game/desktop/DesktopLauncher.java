package com.syratorens.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.syratorens.game.application.Elesmera;

public class DesktopLauncher {
	/*
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Elesmera(), config);
	}
	*/
	public static void main(String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Drop";
		config.width = 1000;
		config.height = 680;
		new LwjglApplication(new Elesmera(), config);
	}
}
