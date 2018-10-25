package com.company;

public class HorseBarn {
    private Horse[] spaces;
    public HorseBarn(Horse[] spaces){
        this.spaces = spaces;
    }
    public int findHorseSpace(String name){
        for(int i = 0;i < this.spaces.length; i++){
            if(this.spaces[i] != null && name.equals(this.spaces[i].getName())){
                return i;
            }
        }
        return -1;
    }
    public void consolidate(){
        int j = 0;
        Horse[] newSpace = new Horse[this.spaces.length];
        for(int i = 0; i < newSpace.length; i++){
            if(this.spaces[i] != null){
                newSpace[j] = this.spaces[i];
                j++;
            }
        }
        this.spaces = newSpace;
    }
}
