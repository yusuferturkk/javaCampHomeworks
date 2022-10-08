public class Main {
    public static void main(String[] args) {
        GamerCalculator womanGamer = new WomanGamerCalculator();
        womanGamer.hesapla();

        GamerCalculator olderGamer = new OlderGamerCalculator();
        olderGamer.gameOver();
    }
}