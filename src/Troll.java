/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MauricioTenorio
 */
public class Troll extends Character{
    public Troll(){
        weapon = new AxeBehavior();
        movement = new CrawlBehavior();
    }
    
    @Override
    public void fight(){
        System.out.println("I am the troll and I am fighting");
    }
}
