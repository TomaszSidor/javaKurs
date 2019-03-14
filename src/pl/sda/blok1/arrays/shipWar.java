package pl.sda.blok1.arrays;

public class shipWar {
    String[][] map = new String[10][10];

    public void setMap() {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                map[i][j] = "*  ";
            }
        }
    }
    public void printMap(){
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    public void shipVertical(int x, int y, int lenght) {
        for (int i = x; i < x + lenght && i < 10; i++) {
            map[i][y] = "O  ";
        }

    }
    public void shipHorizontal(int x, int y, int lenght){
        for (int i = y; i < y + lenght && i < 10; i++){
            map[x][i] = "O  ";
        }
    }

    public static void main(String[] args) {
        shipWar test = new shipWar();
        test.setMap();
        test.shipHorizontal(8,8,4);
        test.shipVertical(5,5,2);
        test.shipHorizontal(3,3,2);
        test.shipVertical(2,2,4);
        test.printMap();


    }
}
