/*
 * Client class used to test Adapter Pattern
 */
package org.thiagz.adapter;

import org.thiagz.adapter.hero.CowBoyHero;
import org.thiagz.adapter.hero.Hero;
import org.thiagz.adapter.hero.SciFiHero;
import org.thiagz.adapter.monster.CrawlingMonster;
import org.thiagz.adapter.monster.FlyingMonster;
import org.thiagz.adapter.monster.Monster;

/**
 *
 * @author Thiagz
 */
public class GameClient {
    public static void main(String args[]){
        Hero hero1 = new CowBoyHero();
        Hero hero2 = new SciFiHero();
        
        Monster monster1 = new CrawlingMonster();
        Monster monster2 = new FlyingMonster();
        Monster monster3 = new GameCharacterAdapter(hero1);
        Monster monster4 = new GameCharacterAdapter(hero2);
        
        monster1.action();
        monster2.action();
        monster3.action();
        monster4.action();
    }
}
