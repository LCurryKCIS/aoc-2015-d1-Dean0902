public class Advent
{
    public static void main(String[] args)
    {
        String str = "(())";
        int floor = 0; 
        for(int x=0; x<str.length(); x++)
        {
            if(str.substring(x,x+1).equals("("))
            {
                floor++; 
            }
            else 
            {
                floor--; 
            }
        }
        System.out.println(floor); 
    }
}