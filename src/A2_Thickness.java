public class A2_Thickness extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        // setup
        System.out.println("This message will be printed to the window below.");
        System.out.println("A2 Thickness");
        plane.teleport(500,400);
        plane.isTrail = true;
        Crown();

    } //end of go method
    public void drawing() {
        //drawing
        plane.startingAngle(360);
        plane.trailWidth = 10; //integer variable
        plane.setColor(65,245,215);
        plane.move(100);
        plane.trailWidth = 10; //integer variable
        plane.setColor(115,0,255);
        plane.turn(120);
        plane.move(100);
        plane.trailWidth = 10; //integer variable
        plane.setColor(245,66,135);
        plane.turn(120);
        plane.move(100);
        plane.turn(30);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
    }//end of drawing method
    public void Crown(){
        plane.startingAngle(360);
        plane.teleport(500,400);
        plane.trailWidth = 10;
        plane.move(200);
        plane.turn(90);
        plane.move(150);
        plane.turn(140);
        plane.move(100);
        plane.turn(250);
        plane.move(100);
        plane.turn(110);
        plane.move(100);
        plane.turn(260);
        plane.move(100);
        plane.turn(140);
        plane.move(160);
        plane.turn(90);
        plane.move(40);

    }
} //end of whole program

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
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/