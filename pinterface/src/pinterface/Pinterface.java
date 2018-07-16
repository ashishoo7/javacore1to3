package pinterface;
interface  Pinterface 
{
      String name="Pandey";
void hobby();
void sports();
void food();
default void music()
{
    System.out.println("I love country music");
}
    static void run()
    {
        return;
    }
}
interface Dinterface
{
void color();
void skill();
}
class Self implements Pinterface , Dinterface
{
public void hobby()
{
    System.out.println("I love sleeping");
}
public void sports()
{
    System.out.println("I like tennis");
}
public void food()
{
    System.out.println("I like pizza");
}
public void color()
{
    System.out.println("I like black color!!");
}
public void skill()
{
    System.out.println("My skills is that i can charge my mobile");

}      

    public static void main(String[] args) 
    {
    Self ob= new Self();
    ob.food();
    ob.hobby();
    ob.sports();
    ob.music();
    ob.color();
    ob.skill();
        System.out.println("my name is " +name);
    }
}
