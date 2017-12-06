/*
 * This is the super class Heroes
 */
package org.thiagz.adapter.hero;

/**
 *
 * @author Thiagz
 */
public abstract class Hero {
    private int id;
    private String name;
    private String weapon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    
    public abstract void combatTechnique();
}
