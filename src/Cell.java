public class Cell {   //细胞类
    private int x,y;  //细胞位置
    private boolean isLive;  //细胞状态（true:存活  false:死亡）

    public Cell(){
        this.x=x;
        this.y=y;
        isLive=false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean getIsLive() {
        return isLive;
    }

    public void setIsLive(boolean live) {
        isLive = live;
    }
}