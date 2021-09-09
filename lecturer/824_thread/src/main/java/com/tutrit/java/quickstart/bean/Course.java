package com.tutrit.java.quickstart.bean;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Course implements CourseObservable {

    private static List<ClientObserver> clients = new ArrayList<>();

    @Override
    public  void addClient(ClientObserver client){
        clients.add(client);
    }
    @Override
    public  void removeClient(ClientObserver client){
        clients.remove(client);
    }

    @Override
    public void notifyClient(LocalDateTime time){
        for (ClientObserver client : clients) {
            client.update(time);
        }
    }
}
