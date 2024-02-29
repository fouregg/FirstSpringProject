package com.example.firstproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class RockMusic extends BaseMusic implements Music {
    public RockMusic()
    {
        song = "Wind cries";
    }

    public static RockMusic getRockMusic() throws Exception {
        RockMusic tmp = new RockMusic();
        if (false)
            throw new Exception("Нельязя создать две одинаковые песни");
        else
            return tmp;

    }
}
