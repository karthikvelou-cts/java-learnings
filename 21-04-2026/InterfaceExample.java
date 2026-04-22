import java.lang.*;
import java.util.*;


class Phone{
    public void call(){
        System.out.println("I can make the call");
    }
    public void sms()
    {
        System.out.println("I can send the SMS");
    }
}

interface Camera{
    void click();
    void record();
}

interface MusicPlayer{
    void play();
    void pause();
}

public class InterfaceExample extends Phone implements Camera, MusicPlayer{
    @Override
    public void click(){
        System.out.println("I can click photos");
    }
    @Override
    public void record(){
        System.out.println("I can record videos");
    }
    @Override
    public void play(){
        System.out.println("I can play music");
    }
    @Override
    public void pause(){
        System.out.println("I can pause music");
    }
    public static void main(String[] args) {
        InterfaceExample myPhone = new InterfaceExample();
        myPhone.call(); // Output: I can make the call
        myPhone.sms(); // Output: I can send the SMS
        myPhone.click(); // Output: I can click photos
        myPhone.record(); // Output: I can record videos
        myPhone.play(); // Output: I can play music
        myPhone.pause(); // Output: I can pause music
    }
    
}
