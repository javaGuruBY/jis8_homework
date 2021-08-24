package com.tutrit.java.quickstart.bean;

import java.time.LocalDateTime;

public interface ClientObserver {
    void update(LocalDateTime time);
}
