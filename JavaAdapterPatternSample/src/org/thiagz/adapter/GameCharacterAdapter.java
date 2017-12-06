/*
 * Adapter class which extends Monster and takes a Hero object as parameter
 * for the constructor
 */
package org.thiagz.adapter;

import org.thiagz.adapter.hero.Hero;
import org.thiagz.adapter.monster.Monster;

/**
 *
 * @author Thiagz
 */
public class GameCharacterAdapter extends Monster {

    private Hero hero;

    public GameCharacterAdapter(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void action() {
        hero.combatTechnique();
    }
}
