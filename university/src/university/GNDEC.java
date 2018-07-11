package university;
public class GNDEC extends University 
{
   @Override
   public void college()
   {
       System.out.println("Name of college is GNDEC");
   }
   @Override
   public void type()
   {
       System.out.println("College is B.tech Type");
   }
}
class edu
{
public static void main(String args[])
{
GNDEC g=new GNDEC();
g.branch();
g.college();
g.type();
}
}
