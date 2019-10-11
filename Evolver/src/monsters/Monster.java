/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsters;

/**
 *
 * @author hieudbui
 */
public class Monster {
    public String name;
    private int MaxHP;
    private int CurrentHP;
    private int attackDamage;
    private int experience;
    private int level;

    public Monster() {
    }
    
    public Monster(String name, int maxHP, int attackDamage, int exp, int level) {
        this.name = name;
        this.MaxHP = maxHP;
        this.CurrentHP = maxHP;
        this.attackDamage = attackDamage;
        this.experience = exp;
        this.level = level;
    }

   public int getMaxHP() {
        return MaxHP;
    }

    public void setMaxHP(int MaxHP) {
        this.MaxHP = MaxHP;
    }

    public int getCurrentHP() {
        return CurrentHP;
    }

    public void setCurrentHP(int CurrentHP) {
        this.CurrentHP = CurrentHP;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }    

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    } 

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    
    
}
