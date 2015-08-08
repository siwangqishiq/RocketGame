package com.xinlan.panyi.rocketgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.FPSLogger;
import com.xinlan.panyi.rocketgame.screen.GameScreen;

/**
 * Created by panyi on 2015/6/5.
 */
public class RocketApp extends Game {
    FPSLogger fps;

    @Override
    public void create() {
        fps = new FPSLogger();
        this.setScreen(new GameScreen(this));
    }

    @Override
    public void render() {
        super.render();
        fps.log();
    }

    @Override
    public void dispose() {
        super.dispose();
        getScreen().dispose();
    }
}//end class
