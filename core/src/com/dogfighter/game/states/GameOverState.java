package com.dogfighter.game.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Anders on 2017-12-03.
 */

public class GameOverState extends State{

    private Texture backGround;
    private Texture gameOver;

    public GameOverState(GameStateManager gsm) {
        super(gsm);
        backGround = new Texture("cavebg.png");
        //gameOver = new Texture("");
    }

    @Override
    protected void handleInput() {
        
    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {

    }

    @Override
    public void dispose() {

    }
}
