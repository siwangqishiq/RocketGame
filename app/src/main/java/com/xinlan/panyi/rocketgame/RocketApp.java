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

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    throw new RuntimeException();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
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
