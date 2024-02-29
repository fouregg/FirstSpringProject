package com.example.firstproject;

class MusicPlayer {
    private Music music;
    private int volume;

    private String name;

    public  MusicPlayer(Music music) {
        this.music = music;
    }
    public  void setMusic(Music music){ this.music = music; }
    public void setName(String name){ this.name = name; }
    public void setVolume(int volume){ this.volume = volume; }
    public void playMusic() {
        System.out.println("Playing:" + music.toString());
    }
    public void testInitMethod(){System.out.println("Init done");}
    public void testDestroyMethod(){System.out.println("Destroy done");}
    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + music +
                ", volume=" + volume +
                ", name=" + name +
                '}';
    }
}
