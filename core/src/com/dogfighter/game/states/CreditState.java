package com.dogfighter.game.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dogfighter.game.dogFighter;

/**
 * Created by Anders on 2017-12-03.
 */

public class CreditState extends State {

    private Texture backGround;
    private Texture credits;
    private Fonts font;

    public CreditState(GameStateManager gsm) {
        super(gsm);
        backGround = new Texture("cavebg.png");
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
        sb.draw(backGround, 0, 0 , (dogFighter.WIDTH / 2) + 80, dogFighter.HEIGHT / 2);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
