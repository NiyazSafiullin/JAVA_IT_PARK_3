package com.company;

public class Sport {
    String name_channel;
    String name_peredacha;
    String start_time;
    String end_time;


    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public void setName_channel(String name_channel) {
        this.name_channel = name_channel;
    }

    public void setName_peredacha(String name_peredacha) {
        this.name_peredacha = name_peredacha;
    }
    public void show() {
        System.out.println(name_channel);
        System.out.println(name_peredacha);
        System.out.println(start_time);
        System.out.println(end_time);

    }

    public Sport(String name_channel, String name_peredacha, String start_time, String end_time) {
        this.name_channel=name_channel;
        this.name_peredacha=name_peredacha;
        this.start_time=start_time;
        this.end_time=end_time;
    }
}
