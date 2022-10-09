package THEME03.HOMEWORK;

public class BoatRiverProblem {

    static int boat = 1;
    static int wolf = 1;
    static int goat = 1;
    static int cabbage = 1;
    static int counting = 0;
    static boolean moreObjects = false;

    public static void main(String[] args) {
        while(!(wolf == 10 && goat == 10 && cabbage == 10 && boat == 10)){
            for (int i = 1; i <= 3; i++) {

                boat *= 10;
                System.out.println("Boat to RIGHT");

                if (i == 1 && wolf == 1) {
                    wolf *= 10;
                    System.out.println("Wolf to RIGHT");
                }
                if (i == 2 && goat == 1) {
                    goat *= 10;
                    System.out.println("Goat to RIGHT");
                }
                if (i == 3 && cabbage == 1) {
                    cabbage *= 10;
                    System.out.println("Cabbage to RIGHT");
                }
                //Checking for conflicts on the left side of the river
                if ((wolf == 1 && goat == 1 && boat == 10) || (goat == 1 && cabbage == 1 && boat == 10)) {

                    boat /= 10;
                    System.out.println("Boat to LEFT");

                    if (i == 1 && !moreObjects) {
                        wolf /= 10;
                        System.out.println("BAD MOVE: RETURNING WOLF TO LEFT");
                        System.out.println();
                    } else if (i == 1 && moreObjects) {
                        goat *= 10;
                        System.out.println("Goat to LEFT");
                        onlyOneObject();
                    }
                    if (i == 2 && !moreObjects) {
                        goat /= 10;
                        System.out.println("BAD MOVE: RETURNING GOAT");
                        System.out.println();
                    }

                    if (i == 3 && !moreObjects) {
                        cabbage /= 10;
                        System.out.println("BAD MOVE: RETURNING CABBAGE");
                        System.out.println();
                    } else if (i == 3 && moreObjects) {
                        goat *= 10;
                        System.out.println("Goat to LEFT");
                        onlyOneObject();
                    }
                    //Checking for conflicts on the right side of the river
                } else if ((wolf == 10 && goat == 10 && boat == 1) || (goat == 10 && cabbage == 10 && boat == 1)) {
                    boat /= 10;
                    System.out.println("Boat to LEFT");

                    if (i == 1 && !moreObjects) {
                        wolf /= 10;
                        System.out.println("BAD MOVE: RETURNING WOLF");
                        System.out.println();
                    } else if (i == 1 && moreObjects) {
                        goat /= 10;
                        System.out.println("Goat to LEFT");
                        onlyOneObject();
                    }
                    if (i == 2 && moreObjects) {
                        goat /= 10;
                        System.out.println("BAD MOVE: RETURNING GOAT");
                        System.out.println();
                    }
                    if (i == 3 && !moreObjects) {
                        cabbage /= 10;
                        System.out.println("BAD MOVE: RETURNING CABBAGE");
                        System.out.println();
                    } else if (i == 3 && moreObjects) {
                        goat /= 10;
                        System.out.println("Goat to LEFT");
                        onlyOneObject();
                    }
                    //Check for potential conflicts if the boat happened to be absent on the right side
                } else if ((goat == 10 && wolf == 10 && boat == 10 && cabbage != 10) || (goat == 10 && cabbage == 10 && boat == 10 && wolf != 10)){
                    onlyOneObject();
                    boat /=10;
                    System.out.println("Boat to LEFT");
                    if(i == 1){
                        goat /= 10;
                        System.out.println("Goat ot LEFT");
                    }
                    if(i == 2 && wolf == 10){
                        wolf /= 10;
                        System.out.println("Wolf to LEFT");
                    } else if(i == 2 && cabbage == 10){
                        cabbage /= 10;
                        System.out.println("Cabbage to LEFT");
                    }
                    if (i == 3){
                        goat /= 10;
                        System.out.println("Goat to LEFT");
                    }
                    onlyOneObject();
                    //Check for potential conflicts if the boat happened to be absent on the left side
                } else if ((goat == 1 && wolf == 1 && boat == 1 && cabbage != 1) || (goat == 1 && cabbage == 1 && boat == 1 && wolf != 1)) {
                    onlyOneObject();
                    boat *=10;
                    System.out.println("Boat to RIGHT");
                    if(i == 1){
                        goat *= 10;
                        System.out.println("Goat ot LEFT");
                    }
                    if(i == 2 && wolf == 1){
                        wolf *= 10;
                        System.out.println("Wolf to LEFT");
                    } else if(i == 2 && cabbage == 1){
                        cabbage *= 10;
                        System.out.println("Cabbage to LEFT");
                    }
                    if (i == 3){
                        goat *= 10;
                        System.out.println("Goat to LEFT");
                    }
                    onlyOneObject();
                }else {
                    if(goat != 10 || wolf != 10 || cabbage != 10 || boat != 10){
                        onlyOneObject();
                        boat /= 10;
                        System.out.println("Boat to LEFT");
                    } else {
                        onlyOneObject();
                        i++;
                    }
                }
            }
        }
        System.out.println("Done in " + counting + " moves");
    }
    public static void onlyOneObject(){
        counting++;
        System.out.println();
        System.out.println("Wolf: " + wolf);
        System.out.println("Goat: " + goat);
        System.out.println("Cabbage: " + cabbage);
        System.out.println("Boat: " + boat);
        System.out.println();

        if((goat == 10 && wolf != 10 && cabbage != 10) || (wolf == 10 && goat != 10 && cabbage != 10) || (cabbage == 10 && wolf != 10 && goat != 10)){
            moreObjects = true;
        } else if ((goat == 1 && wolf != 1 && cabbage != 1) || (wolf == 1 && goat != 1 && cabbage != 1) || (cabbage == 1 && wolf != 1 && goat != 1)){
            moreObjects = true;
        } else {
            moreObjects = false;
        }
    }
}
