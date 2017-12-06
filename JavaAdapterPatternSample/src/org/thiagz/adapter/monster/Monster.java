/*
 * This is the super class Monster
 * 
 * 
 */
package org.thiagz.adapter.monster;

/**
 *
 * @author Thiagz
 */
public abstract class Monster{
    
    private int positionX;
    private int positionY;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public abstract void action();
}
