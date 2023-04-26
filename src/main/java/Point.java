public class Point {
    // write the code of point class here
    // i. It should have two data members
    // x:int
    // y: int
    // It should have a display method that prints in following format - “[<<x>>, <<y>>]”
    // x and y should be protected and display should be public
    protected int x;
    protected int y;
    public void display(){
        System.out.println("[<<" + this.x +">>, <<"+ this.y + ">>]");
    }
}
