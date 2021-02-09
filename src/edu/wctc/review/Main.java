package edu.wctc.review;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Lego> legoSet = new HashSet<>();

        legoSet.add(new Lego(6301629, "large base plate", 1));
        legoSet.add(new Lego(6308875, "small base plate", 2));
        legoSet.add(new Lego(4569382, "two dot block", 3));

        List<Instruction> legoMarioKit = new ArrayList<>();
        Lego temp = getLegoPiece(6301629, legoSet);
        legoMarioKit.add(new Instruction(temp, temp.getColorCode(), 1,
                "Place piece down in front of you."));
        temp = getLegoPiece(4569382, legoSet);
        legoMarioKit.add(new Instruction(temp, temp.getColorCode(), 4,
                "Place each piece in the center two dots of each line of four on the blue base plate."));
        temp = getLegoPiece(6308875, legoSet);
        legoMarioKit.add(new Instruction(temp, temp.getColorCode(), 1,
                "Place piece down on top of the four brown two dot blocks."));

        int count = 0;

        for(Instruction i : legoMarioKit) {
            count++;
            System.out.println("Step #" + count);
            System.out.println(i);
            System.out.println(i.interactWithThing());
        }

    }

    public static Lego getLegoPiece(int id, Set<Lego> set) {
        for(Lego lego : set) {
            if(lego.getValue() == id) {
                return lego;
            }
        }

        return null;
    }
}
