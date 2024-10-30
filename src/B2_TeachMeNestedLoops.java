public class B2_TeachMeNestedLoops extends World
{


   public void go()
   {  
plane.pausetime=1;
      
      System.out.println("This will be printed to the  window. ");
      plane.teleport(0,0);
   
      // This outer for loop begins on line 25 and ends on line 33

      for(int y=0; y<250; y=y+1) //sky
      {
         // This inner for loop begins on line 28 and ends on line 32
         for (int x = 0; x < 1000; x = x + 1) {

            plane.teleport(x, y+500);
            //  plane.setPixelColor(0,x/3,0); // Fills a pixel the red, green, blue (RGB) values you set

            plane.setPixelColor(0, 0, 250 - y); // Fills a pixel the red, green, blue (RGB) values you set
         }
      }
      for(int y=0; y<250; y=y+1) //sea
      {
         // This inner for loop begins on line 28 and ends on line 32
         for (int x = 0; x < 1000; x = x + 1) {

            plane.teleport(x, y);
            //  plane.setPixelColor(0,x/3,0); // Fills a pixel the red, green, blue (RGB) values you set

            plane.setPixelColor(250, x / 4, 250-y); // Fills a pixel the red, green, blue (RGB) values you set
         }
      }
      for(int y=0; y<250; y=y+1) //land
      {
         // This inner for loop begins on line 28 and ends on line 32
         for (int x = 0; x < 1000; x = x + 1) {

            plane.teleport(x, y+250);
            //  plane.setPixelColor(0,x/3,0); // Fills a pixel the red, green, blue (RGB) values you set

            plane.setPixelColor(0, y,0); // Fills a pixel the red, green, blue (RGB) values you set

         }
      }

         plane.trailWidth=(int)(Math.random()*50);// house
         plane.setColor((int)(Math.random()*50),250,150);
         plane.teleport(350,200);
         plane.house(300);
       for(int y=1; y < 10; y= y+1){ //bush loop
           plane.teleport(y*100,400);
           if(y<3||y>6){
               bush();
           }
       } //bushes
       for (int y = 1; y < 8; y = y +1) { //random fish
           plane.teleport((int)(Math.random()*500),650);
           fish(plane.random(30,50));
       } //loop for fish
       for(int y=1; y<10; y= y+2){
           plane.teleport(y*100,150);
            if(y<3.5||y>8) {
                star();
            }
       } //star
       for(int y=1; y < 20; y= y+1){
           plane.teleport(y*100,400);
            if(y<3.5||y>6) {
                flower();
            }
       } //flowers
       for (int a=1; a<20; a=a+1){
           plane.teleport(a*100,450);
           if(a<3.5||a>6) {
               florals();
           }
       } // middle flowers
       for (int a=1;a<20;a=a+1){
           plane.teleport(a*100,500);
           if(a<3.5||a>6) {
               roses();
           }
       } //bottom flowers
   }
    public void fish(int bla){
       plane.isTrail=true;
        plane.trailWidth=3;
       plane.setColor(200,0,0);
       plane.move(170);
       plane.turn(135);
       plane.move(100);
       plane.turn(75);
       plane.move(100);
        plane.move(bla);
    }
    public void bush(){
       plane.isTrail=true;
       plane.setColor(0,200,0);
       plane.trailWidth=6;
       plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
    }
    public void star(){
       plane.isTrail=true;
       plane.trailWidth=10;
       plane.setColor(255,250,250);
       plane.move(50);
       plane.turn(135);
       plane.move(50);
       plane.turn(-75);
       plane.move(50);
       plane.turn(135);
       plane.move(50);
       plane.turn(-75);
       plane.move(50);
       plane.turn(135);
       plane.move(50);
       plane.turn(-75);
       plane.move(50);
       plane.turn(135);
       plane.move(50);
       plane.turn(-75);
       plane.move(50);
       plane.turn(135);
       plane.move(50);
       plane.turn(-75);
       plane.move(50);
       plane.turn(135);
       plane.move(50);
    }
    public void flower (){
       plane.isTrail=true;
        plane.setColor(255,192,203);
       plane.square(10);
    } //top
    public void florals(){
       plane.isTrail=true;
       plane.setColor(255,242,250);
       plane.square(10);
    } //middle
    public void roses (){
        plane.isTrail=true;
        plane.setColor(255,200,200);
        plane.square(10);
    } //bottom
    //i made a change

}




/* 

// Below is a list of the variables in plane and how to set them:

   plane.anglefacing=90 ;     // Sets the angle the plane is facing
	plane.xpos=100;            // Sets the xposition of the plane
	plane.ypos=100;            // Sets the yposition of the plane
   plane.isTrail=false;       // Sets if the plane has a trail
   plane.trailWidth=1;        // Sets the width of the trail from the plane
   plane.pausetime=1;         // Sets how long the plane pauses each time it moves, 
                                 make this bigger to watch the drawing happen
   
// Below are all the methods the plane can use:

   System.out.println("fun" + variable);  // Prints text to the window + the value of the variable
   plane.drawWords("this is fun");  // Prints text to the applet at the location of the plane
   plane.circle(10);                // Draws a circle of radius 10
   plane.square(50);                // Draws a square with side length 50, 
                                      the plane finishes in the same direction it starts  
   plane.house(100);                // Draws a house with a bottom edge of 100
   plane.fillCircle(100);           // Draws a circle of radius 100 and fills it in
   plane.move(100);                 // Moves the plane forward (the direction it is facing) 100 pixels
   plane.teleport(111, 222);        // Relocates the plan to the x position 111 and the y position 222, 
                                      there is no trail with teleport
   plane.turn(90);                  // Turns the plan 90 degrees counterclockwise
   plane.setColor(255, 255, 255);   // Sets the trail color Red, Green, Blue; max value of 255, min 0
   plane.setPixelColor(255, 255, 255);  // Sets the pixel color at the plane's location to Red, Green, Blue; max value of 255, min 0
   plane.howMuchBlue();             // Returns a number between 0 and 255 describing how much blue there is
   plane.howMuchGreen();            // Returns a number between 0 and 255 describing how much green there is
   plane.howMuchRed();              // Returns a number between 0 and 255 describing how much red there is
   plane.random(0, 100);            // Returns an integer on the interval 0 to 99
   
*/