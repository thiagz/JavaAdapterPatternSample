/*
 * Sub-class of Main Hero
 * This Hero is a SciFi Hero
 *
 */
package org.thiagz.adapter.hero;

/**
 *
 * @author Thiagz
 */
public class SciFiHero extends Hero{
    
    @Override
    public void combatTechnique(){
        System.out.println("I'll use my Lightsaber");
    }
    
}
