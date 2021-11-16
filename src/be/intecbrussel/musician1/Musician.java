package be.intecbrussel.musician1;

public class Musician {
    private String nameMusician = "Jean-bernard Roger-Baptiste";

    public void play(){
        int a = 5;

        class Instrument{
            private String name = "bob";

            public void makeSound(){
                System.out.println(nameMusician + " plays an instrument");
                System.out.println(a);
            }

        }



        Instrument messedUpPiano = new Instrument();
        messedUpPiano.makeSound();

    }


}


