/*
 * Sub-class of Main Monster
 * This Monster can Crawl
 * 
 */
package org.thiagz.adapter.monster;

/**
 *
 * @author Thiagz
 */
public class CrawlingMonster extends Monster{
    
    @Override
    public void action(){
        //Have your own logic
        System.out.println("I believe I can Crawl..I'm a Crawling Monster");
    }
}
