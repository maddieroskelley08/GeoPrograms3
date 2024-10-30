public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        //  square();
        for (int x = 1; x < 60; x = x + 10) {
            plane.teleport(x * 10, plane.random(100, 200));
            square(plane.random(100, 200));

        }
//        for (int x =100; x<500; x = x +100){
//            square(x);
//
//        }
        for (int l = 1; l < 60; l = l + 10) {
            plane.teleport(l * 10, plane.random(100, 200));
            triangle(plane.random(10, 100));
        }
        for (int z = 1; z < 60; z = z + 10) {
            plane.teleport(z * 10, plane.random(100, 200));
            rectangle(plane.random(100, 200));
        }


//        {
//            for (int x = 10; x > 0; x = x -1) {
//                System.out.println(x);
//                plane.teleport(x * 100, 25);
//                plane.setColor(190, 1 * x, 1 * x);
//                square();
//
//
//            }
//            System.out.println("**");
//            for(int x=10;x>0;x=x-1) {
//                System.out.print(x + ",");
//            }


    }

    public void square(int size) {
        System.out.println(size);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);

    }

    public void triangle(int shape) {
        plane.startingAngle(315);
        plane.move(shape);
        plane.turn(315);
        plane.move(shape);
        plane.turn(shape);


    }

    public void rectangle(int look) {
        plane.move(look);
        plane.turn(90);
        plane.move(look);
        plane.turn(90);
        plane.move(look);
        plane.turn(90);
        plane.move(look);
        plane.turn(90);
    }


}
