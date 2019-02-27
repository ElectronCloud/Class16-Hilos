/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author jcarrero
 */
public class Tortuga2 extends Thread{
     private Turtle tortuga;

    public Tortuga2(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
      //this.tortuga.forward(10);
      this.tortuga.setPos(100, 100);
      for (int i=0; i<3; i++){
          
          this.tortuga.right(60);
          this.tortuga.forward(50);
          
          if(i==2){
          this.tortuga.right(130);
          this.tortuga.forward(50);
          }
          
      }
    }
}
