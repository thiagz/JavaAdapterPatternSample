/*
 * Sub-class of Main Hero
 * This Hero is a cowboy
 *
 */
package org.thiagz.adapter.hero;

/**
 *
 * @author Thiagz
 */
public class CowBoyHero extends Hero {

    @Override
    public void combatTechnique() {
        System.out.println("I'll use my Pistol");
    }
}
