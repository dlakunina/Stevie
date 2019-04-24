package com.javacore.steve.profile;


import com.javacore.steve.canvas.Canvas;

public class ProfileView extends CompositeView {

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.drawText(0, "Criminal profile view ");
        canvas.drawText(1, "ID: " + ((ProfileModel) model).getId());
        canvas.drawText(2, "Name: " + ((ProfileModel) model).getName());
        //canvas.drawText(3,"Active: " + ((ProfileModel) model).isActive());

        canvas.finalizeDraw();
    }

    public void init() {
        ProfilePhotoView photoView = new ProfilePhotoView(0, 30, 10);
        addChildView(photoView);
    }


}
