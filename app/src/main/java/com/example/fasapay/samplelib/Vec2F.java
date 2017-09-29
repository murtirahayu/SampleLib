package com.example.fasapay.samplelib;

/**
 * Created by fasapay on 9/29/17.
 */

public class Vec2F {

    public float x, y;

    public Vec2F(Vec2F vec){
        this.x = vec.x;
        this.y = vec.y;
    }

    public Vec2F(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Vec2F copy(){
        return new Vec2F(this);
    }

    public void debug(){
        System.out.println("{"+x+", "+y+"}");
    }

}
