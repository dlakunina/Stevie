package com.javacore.steve.profile;

import com.javacore.steve.canvas.Canvas;

import java.util.ArrayList;
import java.util.List;

public class CompositeView extends BaseView {
    private List<BaseView> children = new ArrayList<>();

    @Override
    public void draw(Canvas canvas) {
        for (BaseView view : children) {
            view.draw(canvas);
        }
        //drawing commands
    }

    public void addChildView(BaseView view) {
        children.add(view);
    }
}
