package week_10;

public class InterfaceTaskk {
    
}
/*
 * Task
 * Make an interface Media
 * make the following functions
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String nowPlaying()
 * 
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current)
 * 
 * Make an interface OnlineAsset
 * make the following functions
 * void download()
 * 
 * Make a class Spotify and implement DigitalMedia and OnlineAsset
 */ 

 interface Media {
    public void play();
    public void pause();
    public void next();
    public void previous();
    String nowPlaying();
 }

 interface DigitalMedia extends Media{
    double size();
    double remaining();
 }
 interface OnlineAsset{
    void download();
 }

 class Spotify implements DigitalMedia,OnlineAsset{
    @Override
    public void play(){
        System.out.println("Playing");
    }
    @Override
    public void pause(){
        System.out.println("Paused");
    }
    @Override
    public void next(){
        System.out.println("Playing another song ");
    }
    @Override
    public void previous(){
        System.out.println("Playing previous");
    }
    @Override
    public String nowPlaying(){
        return "Music";
    }
    @Override
    public double size(){
        return 4;
    }
    @Override
    public double remaining(){
        return size();
    }
    @Override
    public void download(){
        System.out.println("download song");
    }
 }