/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

/**
 *
 * @author hieudbui
 */
public class TextTypeProcessor {
    private final int NEXT_STEP = 1;
    private final int COMBAT_STEP = 3;
    private final int NEXT_ALTERNATE_STEP = 2;
    private final int COMBAT_ALT_STEP = 4;
    private final int BACK_STEP = -1;
    private final int NOTHING = 0;
    
    private String command;
    private int storyStep;

    public TextTypeProcessor() {
    }

    public TextTypeProcessor(String command, int storyStep) {
        this.command = command;
        this.storyStep = storyStep;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public int getStoryStep() {
        return storyStep;
    }

    public void setStoryStep(int storyStep) {
        this.storyStep = storyStep;
    }
    
    public int analyzeCommand(){
        int COMMAND_LENGTH = command.length();
        switch(storyStep){
            case 0:    
                if (command.substring(0, Math.min(4, COMMAND_LENGTH)).equalsIgnoreCase("move")){
                    String param = command.substring(Math.min(5, COMMAND_LENGTH));
                    if (param.trim().equalsIgnoreCase("forward")){
                        return NEXT_STEP;
                    }else return NOTHING;
                }
                break;
            case 1:   
                if (command.substring(0, Math.min(6, COMMAND_LENGTH)).equalsIgnoreCase("attack")){
                    return COMBAT_STEP;
                }else if (command.substring(0, Math.min(3, COMMAND_LENGTH)).equalsIgnoreCase("run")){
                    
                }
                break;
            case 2:
                if (command.substring(0, Math.min(4, COMMAND_LENGTH)).equalsIgnoreCase("move")){
                    String param = command.substring(Math.min(5, COMMAND_LENGTH));
                    if (param.trim().equalsIgnoreCase("left")){
                        return NEXT_STEP;
                    }else if (param.trim().equalsIgnoreCase("right")){
                        return NEXT_ALTERNATE_STEP;
                    }
                }else return NOTHING;
                break;
             // SPLIT CASE
            case 3:  
            case 6:   
                if (command.substring(0, Math.min(6, COMMAND_LENGTH)).equalsIgnoreCase("attack")){
                    return COMBAT_ALT_STEP;
                }else if (command.substring(0, Math.min(3, COMMAND_LENGTH)).equalsIgnoreCase("run")){
                    
                }
                break;
            case 4:    
                if (command.substring(0, Math.min(4, COMMAND_LENGTH)).equalsIgnoreCase("move")){
                    String param = command.substring(Math.min(5, COMMAND_LENGTH));
                    if (param.trim().equalsIgnoreCase("forward")){
                        return NEXT_ALTERNATE_STEP;
                    }else return NOTHING;
                }
                break;
        }
        return -99;
    }
}
