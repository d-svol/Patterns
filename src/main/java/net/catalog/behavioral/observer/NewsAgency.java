package net.catalog.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel) {
        if (channel == null)
            throw new NullPointerException();
        this.channels.add(channel);
    }

    public void removeObserver(NewsChannel channel) {
        this.channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for (Channel channel : this.channels){
            channel.update(this.news);
        }
    }


    public String printNews() {
        String text = "";
        for (Channel s : channels){
            text += s.toString();
        }
        return text;
    }
}