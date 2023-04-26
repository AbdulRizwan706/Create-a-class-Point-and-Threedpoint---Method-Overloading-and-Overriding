public class ThreedPoint extends Point{
    // write the code of Threedpoint class here
    // t should have the following data members: z:int
    // It should have a display method to override the parent’s
    // display method which prints in following format - “[<<x>>, <<y>>, <<z>>]”
    // z should be private and display should be public.
    int z;
    Point p = new Point();
    public void display(){
        System.out.println("“[<<" + p.x + ">>, <<" + p.y + ">>, <<" + this.z + ">>]”");
    }
}
