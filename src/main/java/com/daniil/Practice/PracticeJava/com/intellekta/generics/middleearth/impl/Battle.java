package com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.impl;

import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.*;

import java.util.*;



public class Battle extends Army {

    public static void fight() {

        Army mordor = new Army() {

        };
        Army middleEarth = new Army() {

        };
        Map<Integer, Unit> unitMap = new HashMap<>();
        unitMap.put(1, new CavalryOrc(CavalryOrc.class.getName()));
        unitMap.put(2, new Goblin(Goblin.class.getName()));
        unitMap.put(3, new InfantryOrc(InfantryOrc.class.getName()));
        unitMap.put(4, new UrukHai(UrukHai.class.getName()));
        unitMap.put(5, new CavalryHuman(CavalryHuman.class.getName()));
        unitMap.put(6, new Elf(Elf.class.getName()));
        unitMap.put(7, new InfantryHuman(InfantryHuman.class.getName()));
        unitMap.put(8, new Rohhirim(Rohhirim.class.getName()));
        unitMap.put(9, new Wizard(Wizard.class.getName()));
        unitMap.put(10, new WoodenElf(WoodenElf.class.getName()));
        unitMap.put(11, new Troll(Troll.class.getName()));

        double checkSizeMax;
        double checkSizeMin;
        do {
            mordor.setSize(new Random().nextInt(1, 100));
            middleEarth.setSize(new Random().nextInt(1, 100));

            checkSizeMax = Math.max(mordor.getSize(), middleEarth.getSize());
            checkSizeMin = Math.min(mordor.getSize(), middleEarth.getSize());
        }
        while ((checkSizeMax / checkSizeMin * 100 - 100) > 20);
        while (mordor.getSize() != mordor.getArmyList().size()) {
            Unit unit = unitMap.get(new Random().nextInt(1, 12));
            if (unit instanceof MordorUnit<?>) {
                mordor.recruit(unit);
            }
        }
        boolean checkForWizard = true;
        while (middleEarth.getSize() != middleEarth.getArmyList().size()) {
            Unit unit = unitMap.get(new Random().nextInt(1, 12));
            if (unit instanceof Wizard && checkForWizard) {
                middleEarth.recruit(unit);
                checkForWizard = false;
            } else if (unit instanceof MiddleEarthUnit<?>) {
                middleEarth.recruit(unit);
            }
        }

        System.out.println("Phase 1 \n");
        int phaseFirst = 1;
        int countFirstPhase = 0;
        while (mordor.getCavalry().size() != 0 && middleEarth.getCavalry().size() != 0) {
            System.out.println("Fight phase: " + phaseFirst + " at lap "   + countFirstPhase + "\n");

            AbstructUnit mordorRandomUnit = (AbstructUnit) mordor.getCavalry().get(new Random().nextInt(mordor.getCavalry().size()));
            AbstructUnit middleEarthRandomUnit = (AbstructUnit) middleEarth.getCavalry().get(new Random().nextInt(middleEarth.getCavalry().size()));

            int selectRandomToStart = new Random().nextInt(1, 3);
            boolean flagToQuit = true;
            do {
                if (selectRandomToStart == 1) {
                    mordorRandomUnit.strike(middleEarthRandomUnit);
                    System.out.println(mordorRandomUnit + " strikes " + middleEarthRandomUnit + " and " + middleEarthRandomUnit.consequence());
                    middleEarthRandomUnit.strike(mordorRandomUnit);
                    System.out.println(middleEarthRandomUnit + " strikes " + mordorRandomUnit + " and " + mordorRandomUnit.consequence());
                    flagToQuit = false;

                } else if (selectRandomToStart == 2) {
                    middleEarthRandomUnit.strike(mordorRandomUnit);
                    System.out.println(middleEarthRandomUnit + " strikes " + mordorRandomUnit + " and " + mordorRandomUnit.consequence());
                    mordorRandomUnit.strike(middleEarthRandomUnit);
                    System.out.println(mordorRandomUnit + " strikes " + middleEarthRandomUnit + " and " + middleEarthRandomUnit.consequence());
                    flagToQuit = false;
                }
            }





            while (mordorRandomUnit.isAlive() && middleEarthRandomUnit.isAlive() && flagToQuit);

            if (!mordorRandomUnit.isAlive()) {
                mordor.release(mordorRandomUnit);
                mordor.getArmyList().trimToSize();
                mordor.getCavalry().trimToSize();
                mordor.setSize(mordor.getSize() - 1);
            } else if (!middleEarthRandomUnit.isAlive()) {
                middleEarth.release(middleEarthRandomUnit);
                middleEarth.getArmyList().trimToSize();
                middleEarth.getCavalry().trimToSize();
                middleEarth.setSize(middleEarth.getSize() - 1);
            }
            countFirstPhase++;
        }

        if (mordor.getSize() > 0 && middleEarth.getSize() == 0 ) {
            System.out.println("Army of Mordor has won the phase 1 at score " + countFirstPhase + ".The winner list: \n");
            for(int i = 0; i < mordor.getSize(); i++) {
                System.out.println(mordor.getArmyList().get(i).toString());
            }
            System.out.println("\n");
        }
        else {
            System.out.println("Army of Middle Earth has won the phase 1 at score " + countFirstPhase + ".The winner list: \n");
            for(int i = 0; i < middleEarth.getSize(); i++) {
                System.out.println(middleEarth.getArmyList().get(i).toString());

            }
            System.out.println("\n");
        }


        System.out.println("Phase 2 \n");
        int countSecondPhase = 0;
        int phaseSecond = 2;
        while (mordor.getInfantry().size() != 0 && middleEarth.getInfantry().size() != 0) {
            System.out.println("\n");
            System.out.println("Fight phase: " + phaseSecond + " at lap "  + countSecondPhase + "\n");

            AbstructUnit mordorRandomUnit = (AbstructUnit) mordor.getInfantry().get(new Random().nextInt(mordor.getInfantry().size()));
            AbstructUnit middleEarthRandomUnit = (AbstructUnit) middleEarth.getInfantry().get(new Random().nextInt(middleEarth.getInfantry().size()));

            int selectRandomToStart = new Random().nextInt(1, 3);
            boolean flagToQuit = true;
            do {
                if (selectRandomToStart == 1) {
                    mordorRandomUnit.strike(middleEarthRandomUnit);
                    System.out.println(mordorRandomUnit + " strikes " + middleEarthRandomUnit + " and " + middleEarthRandomUnit.consequence());
                    middleEarthRandomUnit.strike(mordorRandomUnit);
                    System.out.println(middleEarthRandomUnit + " strikes " + mordorRandomUnit + " and " + mordorRandomUnit.consequence());
                    flagToQuit = false;
                } else if (selectRandomToStart == 2) {
                    middleEarthRandomUnit.strike(mordorRandomUnit);
                    System.out.println(middleEarthRandomUnit + " strikes " + mordorRandomUnit + " and " + mordorRandomUnit.consequence());
                    mordorRandomUnit.strike(middleEarthRandomUnit);
                    System.out.println(mordorRandomUnit + " strikes " + middleEarthRandomUnit + " and " + middleEarthRandomUnit.consequence());
                    flagToQuit = false;
                }
            }
            while (mordorRandomUnit.isAlive() && middleEarthRandomUnit.isAlive() && flagToQuit);
            if (!mordorRandomUnit.isAlive()) {
                mordor.release(mordorRandomUnit);
                mordor.getArmyList().trimToSize();
                mordor.getInfantry().trimToSize();
                mordor.setSize(mordor.getSize() - 1);
            } else if (!middleEarthRandomUnit.isAlive()) {
                middleEarth.release(middleEarthRandomUnit);
                middleEarth.getArmyList().trimToSize();
                middleEarth.getInfantry().trimToSize();
                middleEarth.setSize(middleEarth.getSize() - 1);
            }
            countSecondPhase++;
        }
        if (mordor.getSize() > 0 && middleEarth.getSize() == 0 ) {
            System.out.println("Army of Mordor has won the phase 2 at score " + countSecondPhase + ".The winner list: \n");
            for(int i = 0; i < mordor.getSize(); i++) {
                System.out.println(mordor.getArmyList().get(i).toString());
            }
            System.out.println("\n");
        }
        else {
            System.out.println("Army of Middle Earth has won the phase 2 at score " + countSecondPhase + ".The winner list: \n");
            for(int i = 0; i < middleEarth.getSize(); i++) {
                System.out.println(middleEarth.getArmyList().get(i).toString());

            }
            System.out.println("\n");
        }
        if (mordor.getArmyList().size() > 0 && middleEarth.getArmyList().size() > 0) {
            fight(mordor, middleEarth);
        }
    }


    public static void fight(Army mordor, Army middleEarth) {
        System.out.println("Phase 3 \n");
        int countThirdPhase = 0;
        int phaseThird = 3;
        while (mordor.getSize() != 0 && middleEarth.getSize() != 0) {
            System.out.println("\n");
            System.out.println("Fight phase: " + phaseThird + " at lap "  + countThirdPhase + "\n");

            Unit unitMordorUnit = mordor.getRandomUnit();
            Unit middleEarthUnit = middleEarth.getRandomUnit();

            if (unitMordorUnit instanceof AbstractCavalryUnit<?>) {
                ((AbstractCavalryUnit<?>) unitMordorUnit).strike((AbstructUnit) middleEarthUnit);
                if (!((AbstructUnit) middleEarthUnit).isAlive()) {
                    middleEarth.release(middleEarthUnit);
                }


            }
            else if (middleEarthUnit instanceof AbstractCavalryUnit<?>) {
                ((AbstractCavalryUnit<?>) middleEarthUnit).strike((AbstructUnit) unitMordorUnit);
                if(!((AbstructUnit) unitMordorUnit).isAlive()) {
                    mordor.release(unitMordorUnit);
                    mordor.setSize(mordor.getSize() - 1);
                }
            }
            else {
                ((AbstructUnit) unitMordorUnit).strike((AbstructUnit)middleEarthUnit);
                if (!((AbstructUnit) middleEarthUnit).isAlive()) {
                    middleEarth.release(middleEarthUnit);
                    middleEarth.setSize(middleEarth.getSize() - 1);

                }
            }
            countThirdPhase++;

            if (mordor.getSize() > 0 && middleEarth.getSize() == 0 ) {
                System.out.println("Army of Mordor has won the battle at " + countThirdPhase + ".The winner list: \n");
                for(int i = 0; i < mordor.getSize(); i++) {
                    System.out.println(mordor.getArmyList().get(i).toString());
                }
                System.out.println("\n");
            }
            else {
                System.out.println("Army of Middle Earth has won the battle at  " + countThirdPhase + ".The winner list: \n");
                for(int i = 0; i < middleEarth.getSize(); i++) {
                    System.out.println(middleEarth.getArmyList().get(i).toString());

                }
                System.out.println("\n");
            }

        }
    }
}
