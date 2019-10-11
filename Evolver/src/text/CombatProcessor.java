/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

import java.util.List;
import java.util.Random;
import javax.swing.JTextArea;
import monsters.Monster;
import player.Player;

/**
 *
 * @author hieudbui
 */
public class CombatProcessor {
    private Monster monster;
    private Player player;

    public CombatProcessor() {
    }

    public CombatProcessor(Monster monster, Player player) {
        this.monster = monster;
        this.player = player;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public void defaultDamage(String command, JTextArea subArea){
        int damage = 1;
        subArea.append("\nYour bare fist do " + damage + " damage.");
        monster.setCurrentHP(monster.getCurrentHP() - damage); 
    }
    
    public void analyzeCombat(String command, JTextArea subArea){
        int COMMAND_LENGTH = command.length();      
            if (command.substring(0, Math.min(6, COMMAND_LENGTH)).equalsIgnoreCase("Attack")){
                String param = command.substring(Math.min(7, COMMAND_LENGTH));
                int damage;
                List<String> weaponInv = player.getWeapons();
                switch(param){
                    case "":
                        defaultDamage(command, subArea);
                        break;
                    case "with branch":
                        if (weaponInv.contains("branch")){
                            Random rand = new Random();
                            damage = (rand.nextInt(2) + 2);
                            subArea.append("\nYour " + command + " do " + damage + " damage.");
                            monster.setCurrentHP(monster.getCurrentHP() - damage);   
                        }
                        else{
                            defaultDamage(command, subArea);
                        }
                        break;
                    case "with axe": 
                        if (weaponInv.contains("axe")){
                            Random rand = new Random();
                            damage = (rand.nextInt(4) + 4);
                            subArea.append("\nYour " + command + " do " + damage + " damage.");
                            monster.setCurrentHP(monster.getCurrentHP() - damage);   
                        }
                        else{
                            defaultDamage(command, subArea);
                        }
                        break;
                    default:
                        defaultDamage(command, subArea);
                        break;
                }
            }       
    }
    
    public void monsterRetaliate(JTextArea subArea){
        Random rand = new Random();
        int mobDamage = monster.getAttackDamage();
        final int DAMAGE_DICE = mobDamage + rand.nextInt(monster.getLevel());        
        subArea.append("\n" + monster.name + " does " + DAMAGE_DICE + " damage.");
        player.setCurrentHP(player.getCurrentHP() - DAMAGE_DICE);
    }
}
