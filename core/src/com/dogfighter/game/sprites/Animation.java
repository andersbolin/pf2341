package com.dogfighter.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

import javax.xml.soap.Text;

/**
 * Created by Anders on 2017-11-28.
 */

public class Animation {
    private Array<TextureRegion> frames;
    private float maxFrameTime;
    private float currentFrameTime;
    private int frameCount;
    private int frame;

    public Animation(TextureRegion region, int framecount, float cycletime) {
        frames = new Array<TextureRegion>();
        int framwidth = region.getRegionWidth() / framecount;
        for(int x = 0; x < framecount; x++){
            frames.add(new TextureRegion(region,x * framwidth,0,framwidth,region.getRegionHeight()));
        }
        this.frameCount = framecount;
        maxFrameTime = cycletime / framecount;
        frame = 0;
    }

    public void update(float dt) {
        currentFrameTime += dt;
        if(currentFrameTime > maxFrameTime){
            frame++;
            currentFrameTime = 0;
        }
        if(frame >= frameCount){
            frame = 0;
        }
    }

    public TextureRegion getFrame() {
        return frames.get(frame);
    }
}
