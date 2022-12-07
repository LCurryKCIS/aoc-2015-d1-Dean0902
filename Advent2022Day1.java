import java.util.*;
import java.io.*; 

    public class Advent2022Day1
    {
        public static void main(String[] args) throws FileNotFoundException
        {
            Scanner inp = new Scanner(new File("C:\\Users\\Dlm01\\OneDrive\\桌面\\Test.txt")); 
            Scanner inp2 = new Scanner(new File("C:\\Users\\Dlm01\\OneDrive\\桌面\\Test.txt")); 
            Scanner inp3 = new Scanner(new File("C:\\Users\\Dlm01\\OneDrive\\桌面\\Test.txt")); 

            int max1 = 0; 
            int max2 = 0; 
            int max3 = 0; 

            int save = 0;

            while(inp.hasNextLine())
            {
                String input = inp.nextLine();
                if(input.length() == 0)
                {
                    max1 = Math.max(max1, save);
                    save = 0;
                }
                else
                {
                    save += Integer.parseInt(input);
                }
            }

            save = 0;
            while(inp2.hasNextLine())
            {
                String input = inp2.nextLine();
                if(input.length() == 0)
                {
                    max2 = Math.max(max2, save);
                    save = 0;
                    
                }
                else
                {
                    save += Integer.parseInt(input);
                    if(save >= max1)
                    {
                        save = 0;
                    }
                }
            }

            save = 0;
            while(inp3.hasNextLine())
            {
                String input = inp3.nextLine();
                if(input.length() == 0)
                {
                    max3 = Math.max(max3, save);
                    save = 0;
                    
                }
                else
                {
                    save += Integer.parseInt(input);
                    if(save >= max2)
                    {
                        save = 0;
                    }
                }
            }

            System.out.println(max1+max2+max3);
            System.out.println(max1);
            System.out.println(max2);
            System.out.println(max3);
            }
    }

