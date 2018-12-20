package CarlsonProject2;

import CarlsonProject.*;

public class NewWindow extends Window{
    private boolean RobberFlag;

    public NewWindow(Color clr, boolean RF){
        super(clr);
        this.RobberFlag = RF;
    }

    public boolean isRobberFlag() {
        return RobberFlag;
    }
}
