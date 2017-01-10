package com.tanc.designPattern.facade;

/**
 * 外观模式：影院系统
 * Created by tanc on 2017/1/10.
 */
public class Cinema {

    private LightSystem lightSystem;
    private MovieSystem movieSystem;
    private MusicSystem musicSystem;

    public Cinema() {
        lightSystem = new LightSystem();
        movieSystem = new MovieSystem();
        musicSystem = new MusicSystem();
    }

    public Cinema(LightSystem lightSystem, MovieSystem movieSystem, MusicSystem musicSystem) {
        this.lightSystem = lightSystem;
        this.musicSystem = musicSystem;
        this.movieSystem = movieSystem;
    }

    public void play() {
        System.out.println("电影即将开始。");
        lightSystem.lightOff();
        musicSystem.music();
        movieSystem.show();
    }

    public void end() {
        System.out.println("电影放映结束。");
        lightSystem.lightOn();
        movieSystem.off();
        musicSystem.off();
    }
}
