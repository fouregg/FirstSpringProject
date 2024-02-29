package com.example.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player);
        player.setVolume(1000);
        System.out.println(player);
        MusicPlayer player2 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player);
        System.out.println(player2);
        //SpringApplication.run(FirstProjectApplication.class, args);
        context.close();
    }

}
