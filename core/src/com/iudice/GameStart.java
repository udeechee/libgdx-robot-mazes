package com.iudice;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.iudice.controller.AssetLoader;
import com.iudice.model.meta.GameManager;
import com.iudice.model.meta.LevelManager;

/**
 * https://www2.stetson.edu/~efriedma/puzzle/robot/
 */
public class GameStart extends Game {
	public SpriteBatch batch;

	private GameManager gameManager;
	private LevelManager levelManager;

	@Override
	public void create () {
		batch = new SpriteBatch();

		AssetLoader.loadAssets();

		if (GameManager.instance != null) {
			gameManager = GameManager.instance;
		}
		else {
			gameManager = new GameManager();
		}

		if (LevelManager.instance != null)
		{
			levelManager = LevelManager.instance;
		}
		else{
			levelManager = new LevelManager();
		}

		LevelManager.loadCurrentLevel( this );
	}

	@Override
	public void render () {
		super.render();
	}


	@Override
	public void dispose() {
		super.dispose();
		gameManager.dispose();
	}

}
