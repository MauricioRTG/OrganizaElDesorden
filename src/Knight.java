/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MauricioTenorio
 */
public class Knight extends Character{
    public Knight(){
        weapon = new SwordBehavior();
        movement = new RunBehavior();
    }
    
    @Override
    public void fight(){
        System.out.println("I am the Knight and I am fighting");
    }
}
