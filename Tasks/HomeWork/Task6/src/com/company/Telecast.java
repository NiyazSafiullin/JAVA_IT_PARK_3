package com.company;

public class Telecast {

    String name_peredacha;
    String start_time;
    String end_time;




    public String getName_peredacha() {
        return name_peredacha;
    }

    public String getStart_time() {
        return start_time;
    }
    public String getEnd_time() {
        return end_time;
    }



    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
   public Telecast() {

name_peredacha="kvn";
start_time="18:00";
end_time="21:00";
    }
public void show() {

    System.out.println(name_peredacha);
    System.out.println(start_time);
    System.out.println(end_time);


}
public void raspisanie() {
    System.out.println("9:00-11:00" + " " + "Доброе утро");
}

    public Telecast(String name_channel,String name_peredacha, String start_time, String end_time) {

        this.name_peredacha=name_peredacha;
        this.end_time=end_time;
        this.start_time=start_time;
    }

}