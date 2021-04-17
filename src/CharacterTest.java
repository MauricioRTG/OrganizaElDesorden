/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MauricioTenorio
 */
public class CharacterTest {
    public static void main (String args []){
        Character character1, character2, character3, character4;
        
        character1 = new King();
        character2 = new Troll();
        character3 = new Queen();
        character4 = new Knight();
        
        character1.showCharacter();
        character2.setWeaponBehavior(new KnifeBehavior());
        character2.setMovementBehavior(new RunBehavior());
        character2.showCharacter();
        character3.showCharacter();
        character4.showCharacter();
    }
}
