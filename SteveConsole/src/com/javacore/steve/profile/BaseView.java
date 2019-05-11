package com.javacore.steve.profile;

import com.javacore.steve.canvas.Canvas;

public abstract class BaseView {
    protected BaseModel model;

    public void draw(Canvas canvas) {
        System.out.println("Drawing on canvas should be implemented...");
    }

    public void setModel(BaseModel model) {
        this.model = model;
    }
}
