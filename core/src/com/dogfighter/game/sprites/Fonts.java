package com.dogfighter.game.sprites;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Anders on 2017-12-10.
 */

public class Fonts {

    private Texture tw;
    private String word;
    private Pixmap pm;
    private char[] letterArray = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0','.'};

    public Fonts(String word) {
        this.word = word;
        tw = new Texture(300,44,Pixmap.Format.RGB888);
        pm = new Pixmap(300,44,Pixmap.Format.RGB888);
        createStringTexture();
    }

    //Create texture word from string with texture map
    private void createStringTexture() {
        char[]  caps = (word.toUpperCase()).toCharArray();
        for(char l : caps){
            
        }
    }
    //return created word in texture format

    public Texture getWord() {
        return tw;
    }
}
