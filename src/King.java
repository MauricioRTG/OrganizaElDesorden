/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MauricioTenorio
 */
public class King extends Character {
    
    public King(){
        weapon = new BowAndArrowBehavior();
        movement = new SprintBehavior();
    }
    
    @Override
    public void fight(){
        System.out.println("I am the king and I am fighting");
    }
}
