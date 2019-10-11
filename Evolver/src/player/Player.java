/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hieudbui
 */
public class Player {
    private int MaxHP;
    private int CurrentHP;
    private int maxXP;
    private int currentXP;
    private int level;
    private List<String> weapons;

    public Player() {
        this.level = 1;
    }

    public Player(int MaxHP, int maxXP) {
        this.MaxHP = MaxHP;
        this.CurrentHP = MaxHP;
        this.maxXP = maxXP;
        this.currentXP = 0;
        this.level = 1;
        weapons = new ArrayList<>(100);
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

    public int getMaxXP() {
        return maxXP;
    }

    public void setMaxXP(int maxXP) {
        this.maxXP = maxXP;
    }

    public int getCurrentXP() {
        return currentXP;
    }

    public void setCurrentXP(int currentXP) {
        this.currentXP = currentXP;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setBothHP(int HP) {
        this.MaxHP = HP;
        this.CurrentHP = HP;
    }

    public void setWeapons(List<String> weapons) {
        this.weapons = weapons;
    }

    public List<String> getWeapons() {
        return weapons;
    }
    
    
}
