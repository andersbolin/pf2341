package com.dogfighter.game.sprites;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Anders on 2017-12-10.
 */

public class Fonts {

    private Texture tw;
    private String word;

    public Fonts(String word) {
        this.word = word;
    }

    //Create texture word from string with texture map

    //return created word in texture format

    public Texture getWord() {
        return tw;
    }
}
