package com.dogfighter.game.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.dogfighter.game.dogFighter;

/**
 * Created by Anders on 2017-12-03.
 */

public class GameOverState extends State{

    private Texture backGround;
    private Texture gameOver;
    private int restarttime = 0;

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
        handleInput();
        //cam.position.x =  bird.getPosition().x + 80;
        cam.position.set(new Vector3(dogFighter.WIDTH, dogFighter.HEIGHT, 0));
        this.
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        //sb.draw(bg,cam.position.x - (cam.viewportWidth / 2), 0);
        sb.draw(backGround, 0, 0 , (dogFighter.WIDTH / 2) + 80, dogFighter.HEIGHT / 2);
        sb.draw(gameOver, (dogFighter.WIDTH / 2) - gameOver.getWidth(), (dogFighter.HEIGHT / 2)-(gameOver.getHeight() / 2) - 200);
        sb.end();

        cam.update();


    }

    @Override
    public void dispose() {

    }
}
