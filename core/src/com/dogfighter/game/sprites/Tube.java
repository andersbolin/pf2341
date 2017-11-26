package com.dogfighter.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

/**
 * Created by Anders on 2017-11-26.
 */

public class Tube {

    public static final int TUBE_WIDTH = 52;
    private static final int FLUCTUATION = 130;
    private static final int TUBEGAP = 100;
    private static final int LOWEST_OPENING = 120;
    private Texture topTube, bottomTube;
    private Vector2 posBotTube, posTopTube;
    private Random rand;

    public Tube(float x){
        topTube = new Texture("toptube.png");
        bottomTube = new Texture("bottomtube.png");
        rand = new Random();

        posTopTube = new Vector2(x,rand.nextInt(FLUCTUATION) + TUBEGAP + LOWEST_OPENING);
        posBotTube = new Vector2(x, posTopTube.y - TUBEGAP - bottomTube.getHeight());
    }

    public void reposition(float x) {
        posTopTube.set(x,rand.nextInt(FLUCTUATION) + TUBEGAP + LOWEST_OPENING);
        posBotTube.set(x, posTopTube.y - TUBEGAP - bottomTube.getHeight());
    }

    public static int getFLUCTUATION() {
        return FLUCTUATION;
    }

    public Texture getTopTube() {
        return topTube;
    }

    public Texture getBottomTube() {
        return bottomTube;
    }

    public Vector2 getPosBotTube() {
        return posBotTube;
    }

    public Vector2 getPosTopTube() {
        return posTopTube;
    }
}
