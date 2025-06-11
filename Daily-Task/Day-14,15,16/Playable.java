public interface Playable {
    void play();
}

class Football implements Playable{

    @Override
    public void play() {
        System.out.println("Football");
    }
    static class Cricket implements Playable{

        @Override
        public void play() {
            System.out.println("cricket");
        }
    }
    static class Tennis implements Playable{

        @Override
        public void play() {
            System.out.println("Tennis");
        }
    }

    static class PlayGame{
        public static void main(String[] args) {
            Playable game1 = new Football();
            Playable game2 = new Cricket();
            Playable game3 = new Tennis();

            game1.play();
            game2.play();
            game3.play();
        }
    }
}
