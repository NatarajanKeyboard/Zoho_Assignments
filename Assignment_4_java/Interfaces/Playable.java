package Interfaces;

import java.util.Scanner;

public interface Playable {
    public void play();
    public void pause();
    public void stop();
}
class MP3Player implements Playable
{
    @Override
    public void play() {
        System.out.println("Playing Media in MP3 player...");
        
    }
    @Override
    public void pause() {
        System.out.println("Pausing Media in MP3 player...");
        
    }
    @Override
    public void stop() {
        System.out.println("Stoping Media in MP3 player...");
        
    }
    

}
class CDPlayer implements Playable
{
    @Override
    public void play() {
        System.out.println("Playing Media in CD player...");
        
    }
    @Override
    public void pause() {
        System.out.println("Pausing Media in CD player...");
        
    }
    @Override
    public void stop() {
        System.out.println("Stoping Media in CD player...");
        
    }
}
class StreamingPlayer implements Playable
{
    @Override
    public void play() {
        System.out.println("Playing Media in Streaming player...");
        
    }
    @Override
    public void pause() {
        System.out.println("Pausing Media in Streaming player...");
        
    }
    @Override
    public void stop() {
        System.out.println("Stoping Media in Streaming player...");
        
    }
}


class Main {        // for UI
    static Scanner sc=new Scanner(System.in);
    public static void showOption(Playable playable)
    {
        subOption:do{
        System.out.println("Choose the option\n1. play\n2. pause \n3. stop\n4.back");
        switch(sc.nextInt())
        {
            case 1:
                    playable.play();

                break;

            case 2:
                    playable.pause();

                break;

            case 3:
                    playable.stop();
                break;

            case 4:
                    playable.stop();
                    System.out.println("back to main option...");
                break subOption;

            default:
                    System.out.println("Choose the correct option");

                break;
        }
        }while(true);
    }
    public static void main(String[] args) {
        System.out.println("***** Welcome to Muzic world  *****");
        
        mainOption: do{
            System.out.println("Choose the music player\n1. MP3 player\n2. CD player \n3. Streaming player\n4  exit");
            switch(sc.nextInt())
            {
                case 1:
                    System.out.println("Thank you for choosing MP3 player...");
                    showOption(new MP3Player());

                break;

                case 2:
                    System.out.println("Thank you for choosing CD player...");
                    showOption(new CDPlayer());

                break;

                case 3:
                    System.out.println("Thank you for choosing Streaming player...");
                    showOption(new StreamingPlayer());
                break;

                case 4:
                System.out.println("bye bye...");
                break mainOption;

                default:
                    System.out.println("Choose the correct option");

                break;

            }

        }while(true);

    }

    
}

