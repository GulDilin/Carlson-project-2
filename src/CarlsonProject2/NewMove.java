package CarlsonProject2;

import CarlsonProject.*;

public class NewMove{
    private Nurse nurse;
    private NewCarlson carlson;
    private NewBaby baby;
    private Move move;
    private NewWindow[] windows;

    public NewMove(NewCarlson carlson, NewBaby baby, Nurse nurse) {
        this.nurse = nurse;
        this.carlson = carlson;
        this.baby = baby;
        this.move = new Move(carlson, baby);
        windows = new NewWindow[move.getWindows().length];
        for (int i = 0; i < move.getWindows().length; i++){
            windows[i] = new NewWindow(move.getWindows()[i].getColor(), (Math.random() < 0.5D ));
        }
    }

    public Nurse getNurse() {
        return nurse;
    }

    public NewCarlson getCarlson() {
        return carlson;
    }

    public NewBaby getBaby() {
        return baby;
    }

    Calculateable average = (carl, bab) -> (carlson.getSpeakVolume() + baby.getSpeakVolume()) / 2;

    public void go() {
        if (Nurse.hear(average.calculate(this.getCarlson(), this.getBaby()))){
            Nurse.hide();
        }
        //если она не спряталась, а карлсон и малыш входял, кидает исключение
        move.go();
        //если Карлсон не сказал о
    }

    public static class RobberMove {
        //private Robber robber1;
        //private Robber robber2;

        public class Robber {
            private String name;
            private ColorDress color;
            public String getName() {
                return this.name;
            }
        }

        public enum ColorDress{
            //  GREEN, BLACK, BLUE, RED;
        }
    }
}

@FunctionalInterface
interface Calculateable {
    public double calculate(NewCarlson carl, NewBaby baby);
}




