package com.hillel.klysenko.lesson13.task2;

public class Main {
    public static void main(String[] args) {
   ClassicMusic antonioVivaldi = new ClassicMusic();
   PopMusic kazka = new PopMusic();
   RockMusic thirtySecondsToMars = new RockMusic();

        MusicStyles[] musicStyles = {
                new ClassicMusic(), new PopMusic(), new RockMusic()};

        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }

}
