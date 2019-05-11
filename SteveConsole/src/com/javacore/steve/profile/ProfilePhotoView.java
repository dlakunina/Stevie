package com.javacore.steve.profile;

import com.javacore.steve.canvas.Canvas;

public class ProfilePhotoView extends BaseView {
    private int x;
    private int y;
    private int size;

    public ProfilePhotoView(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;

    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(x + 5, y + 5, 5);
        canvas.drawSquare(x + 10, y, 10);
    }

}
