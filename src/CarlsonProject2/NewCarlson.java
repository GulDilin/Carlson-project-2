package CarlsonProject2;
import CarlsonProject.*;

public class NewCarlson extends Carlson{
    private double speakVolume;

    public NewCarlson(String name, double volume){
        super(name);
        this.speakVolume = volume;
    }

    public NewCarlson(String name){
        this(name, Math.random() * 100);
    }

    public double getSpeakVolume(){
        return this.speakVolume;
    }
}
