package com.dogfighter.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dogfighter.game.dogFighter;
import com.dogfighter.game.sprites.Bird;

/**
 * Created by Anders on 2017-11-19.
 */

public class PlayState extends State {

   private Bird bird;


    public PlayState(GameStateManager gsm) {
        super(gsm);
        bird = new Bird(50,100);
        cam.setToOrtho(false, dogFighter.WIDTH / 2, dogFighter.HEIGHT / 2);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {
        handleInput();
        bird.update(dt);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bird.getTexture(), bird.getPosition().x, bird.getPosition().y);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
