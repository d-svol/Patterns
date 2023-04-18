package net.catalog.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        File file = new File();

        game.setLevelAndMs("Lvl 100", 99999999);
        file.setSave(game.save());
        System.out.println(game);

        System.out.println("===========");
        game.setLevelAndMs("Lvl 150", 999999999);
        file.setSave(game.save());
        System.out.println(game);

        System.out.println("===========");
        game.setLevelAndMs("Lvl 180", 1999999999);
        //Don't setSave it now
        System.out.println("Loading....");
        game.load(file.getSave());
        System.out.println(game);
    }
}
