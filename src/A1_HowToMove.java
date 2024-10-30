public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        //methods have parentheses!
        plane.pausetime=1;
      for(int x=0;x<50;x=x+10){

          for(int y=100;y<600;y=y+100){

              System.out.println("x= "+x+"  y= "+y);
              plane.teleport(x*10,y);
              plane.square(100);

          }

      }


    }

public void square (){
    plane.move(100);
    plane.turn(90);
    plane.move(100);
    plane.turn(90);
    plane.move(100);
    plane.turn(90);
    plane.move(100);
    plane.turn(90);

}

}

/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/