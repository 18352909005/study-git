package com.example.jenkins.test;

import java.applet.Applet;
import java.awt.*;

public class Picture extends Applet {

    Image myPicture;
    //Construct the applet
    public Picture(){
    }

    //Initialize the applet
    public void init() {
        setBackground(Color.red);
        myPicture = this.getImage(this.getCodeBase(),"4.png");
    }


    //draw the image
    public void paint(Graphics screen){
        screen.drawImage( myPicture,10,10,this);
    }

}
