/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MauricioTenorio
 */
public class Queen extends Character{
    
    public Queen(){
        weapon = new KnifeBehavior();
        movement = new WalkBehavior();
    }
    
    @Override
    public void fight(){
        System.out.println("I am the Queen and I am fighting");
    }
}
