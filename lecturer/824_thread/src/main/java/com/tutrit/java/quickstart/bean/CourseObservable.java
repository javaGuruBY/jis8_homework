package com.tutrit.java.quickstart.bean;

import java.time.LocalDateTime;

public interface CourseObservable {
    void addClient(ClientObserver client);

    void removeClient(ClientObserver client);

    void notifyClient(LocalDateTime time);
}
