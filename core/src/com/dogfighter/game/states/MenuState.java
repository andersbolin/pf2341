package com.dogfighter.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dogfighter.game.dogFighter;

/**
 * Created by Anders on 2017-11-19.
 */

public class MenuState extends State {

    private Texture backGround;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        backGround = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(backGround, 0, 0 , dogFighter.WIDTH, dogFighter.HEIGHT);
        sb.draw(playBtn, (dogFighter.WIDTH / 2) - (playBtn.getWidth() / 2), (dogFighter.HEIGHT / 2)-(playBtn.getHeight() / 2));
        sb.end();
    }

    @Override
    public void dispose() {
        backGround.dispose();
        playBtn.dispose();
    }
}
