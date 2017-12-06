/*
 * Sub-class of Main Monster
 * This Monster can Fly
 * 
 */
package org.thiagz.adapter.monster;

/**
 *
 * @author Thiagz
 */
public class FlyingMonster extends Monster{
    
    @Override
    public void action(){
        //Have your own logic
        System.out.println("I believe I can Fly..I'm a Flying Monster");
    }
}
