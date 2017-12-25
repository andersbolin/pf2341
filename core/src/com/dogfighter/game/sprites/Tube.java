package com.dogfighter.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
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
    private Rectangle boundsTop, boundsBot;
    private Random rand;
    private boolean counted;

    public Tube(float x){
        counted = false;
        topTube = new Texture("toptube.png");
        bottomTube = new Texture("bottomtube.png");
        rand = new Random();

        posTopTube = new Vector2(x,rand.nextInt(FLUCTUATION) + TUBEGAP + LOWEST_OPENING);
        posBotTube = new Vector2(x, posTopTube.y - TUBEGAP - bottomTube.getHeight());

        boundsTop = new Rectangle(posTopTube.x, posTopTube.y, topTube.getWidth(), topTube.getHeight());
        boundsBot = new Rectangle(posBotTube.x, posBotTube.y, bottomTube.getWidth(), bottomTube.getHeight());
    }

    public void reposition(float x) {
        posTopTube.set(x,rand.nextInt(FLUCTUATION) + TUBEGAP + LOWEST_OPENING);
        posBotTube.set(x, posTopTube.y - TUBEGAP - bottomTube.getHeight());
        boundsTop.setPosition(posTopTube.x, posTopTube.y);
        boundsBot.setPosition(posBotTube.x,posBotTube.y);
    }

    public boolean collides(Rectangle player){
        return player.overlaps(boundsBot) || player.overlaps(boundsTop);
    }

    public void setCounted(boolean s) {
        this.counted = s;
    }

    public boolean getCounted() {
        return counted;
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

    public void dispose(){
        topTube.dispose();
        bottomTube.dispose();
    }
}
