package com.company;

public class HorseRunner {

    public static void main(String[] args) {
	// write your code here
        HorseBarn horse1 = new Mustang("Secretariat", 12000);
        HorseBarn horse2 = new Mustang("Dusty Trail", 22000);
        HorseBarn horse3 = new Mustang("Silver", 12000);

        HorseBarn horses = new HorseBarn[6];

        horses[1] = horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        HorseRunner barn = new HorseRunner(horses);

        System.out.println(barn);
        System.out.println(" Dusty Trail is in space: ") + barn.findHorseSpace("Dusty Trail");

        barn.consolidate();

        System.out.println(barn);
        System.out.println(" Dusty Trail is now in space: ") + barn.findHorseSpace("Dusty Trail");

    }
}
