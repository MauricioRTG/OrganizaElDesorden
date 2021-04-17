/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MauricioTenorio
 */
public abstract class Character {
    WeaponBehavior weapon;
    MovementBehavior movement; 
  
    public abstract void fight();
    
    public void showCharacter(){
        fight();
        weapon.useWeapon();
        movement.move();
    }
  
    public void setWeaponBehavior(WeaponBehavior wB){
  	weapon = wB;
    }
    public void setMovementBehavior(MovementBehavior mB){
  	movement = mB;
    }
    //public abstract void performMovement();
}
