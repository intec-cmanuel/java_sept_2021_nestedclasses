package be.intecbrussel.importantstuffinhere;

public class Musician {
    public void play() {
        Instrument myInstrument = new Instrument() {
            @Override
            public void makeSound(String sound) {
                System.out.println("Piano says: " + sound);
            }
        };

        Instrument myGuitare = new Instrument() {
            @Override
            public void makeSound(String sound) {
                System.out.println("guitare says: " + sound);
            }
        };

        myInstrument.makeSound("dododododooooo");
        myGuitare.makeSound("lalalalalalaaaaa");
    }
}
