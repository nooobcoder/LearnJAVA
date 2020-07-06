package Polymorphism;

class Movie {
    private String movieName;

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return super.plot();
    }
}

class IndependenceDay extends Movie {
    IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie {
    StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgettable extends Movie {
    Forgettable() {
        super("Forgettable");
    }

    // No plot method
}

public class Main {
    public static void main(String[] args) {
        for (int a = 1; a < 11; a++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + a +
                    ": " + movie.getMovieName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random Number generated: " + randomNumber);
        switch (randomNumber) {
            case 1 -> {
                return new Jaws();
            }
            case 2 -> {
                return new IndependenceDay();
            }
            case 3 -> {
                return new MazeRunner();
            }
            case 4 -> {
                return new StarWars();
            }
            case 5 -> {
                return new Forgettable();
            }
        }
        return null;
    }
}
