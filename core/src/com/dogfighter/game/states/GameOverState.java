package com.dogfighter.game.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dogfighter.game.dogFighter;

/**
 * Created by Anders on 2017-12-03.
 */

public class GameOverState extends State{

    private Texture backGround;
    private Texture gameOver;

    public GameOverState(GameStateManager gsm) {
        super(gsm);
        backGround = new Texture("cavebg.png");
        gameOver = new Texture("gameover.png");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {


    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(backGround, 0, 0 , dogFighter.WIDTH, dogFighter.HEIGHT);
        sb.draw(gameOver, (dogFighter.WIDTH / 2) - (gameOver.getWidth() / 2), (dogFighter.HEIGHT / 2)-(gameOver.getHeight() / 2));
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
