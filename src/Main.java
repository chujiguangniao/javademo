public class Main {
    private static GameGUI Game;
    private static World world;

    //操作界面
    public static void main(String arg[]){
        world=new World(20,30);
        Game=new GameGUI("Game of Life",world);
    }
}