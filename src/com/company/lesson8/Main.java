package com.company.lesson8;



public class Main {
        public static void main(String[] args) {

                Actor catBob=new Cat("Bob",0,0);
                Actor catTom=new Cat("Tom",50,30);

                Actor humanIvan=new Human("Ivan",1,15);
                Actor humanSergey=new Human("Sergey",20,30);

                Actor robotCop=new Robot("Cop",0,20);
                Actor robotNik=new Robot("Nik",1,20);

                Actor[] actors={catBob,catTom,humanIvan,humanSergey,robotCop,robotNik};

                Obstacle wallOne= new Wall(1);
                Obstacle wallTwo=new Wall(8);

                Obstacle treadmillOne=new Treadmill(1);
                Obstacle treadmillTwo=new Treadmill(10);

                Obstacle[] obstacles={wallOne,wallTwo,treadmillOne,treadmillTwo};


                int count=0;
                for (Obstacle obstacle : obstacles) {
                        count++;
                        System.out.println( "\n  \n "+count + " круг препятствий ");
                        for (Actor actor : actors) {
                                {
                                        if (actor.getSuccess()){
                                                System.out.println(obstacle.check(actor));
                                        }
                                        if (!actor.getSuccess()){
                                                System.out.println( actor.getName()+"---выбыл ----" );
                                        }
                                }
                        }

                }
        }
}
