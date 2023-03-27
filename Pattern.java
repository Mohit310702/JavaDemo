import java.util.*;

class Pattern
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
       
        /*Pattern 1*/
        // int row = scan.nextInt();
        // int col = scan.nextInt();

        // for(int i = 0;i<row;i++)
        // {
        //     for(int j = 0;j<col;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*Pattern 2*/
        // for(int i =0;i<4;i++)
        // {
        //     for(int j =0;j<4;j++)
        //     {
        //         if(i==0 || j==0 || i==3 || j==3)
        //         {
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }

        //     System.out.println();
        // }

        /*Pattern 3*/
        // for(int i =0;i<5;i++)
        // {
        //     for(int j =0;j<5;j++)
        //     {
        //         if(j ==0 || j==4)
        //         {
        //             System.out.print("|");
        //         }
        //         else if( i ==2)
        //         {
        //             System.out.print("-");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // /*Pattern 4*/
        // int n =19;
        // for(int i =0;i<n;i++)
        // {
        //     for(int j =0;j<n;j++)
        //     {
        //         if(i==j || i+j == 18 || i+j ==9 || i-j == 9|| j-i ==9 || i+j == n-1 + (n-1)/2 || i == 0 || i==18 || j==0|| j==18)
        //         {
        //             System.out.print("*");
        //         }
        //         // else if( i ==2)
        //         // {
        //         //     System.out.print("-");
        //         // }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

         /*Pattern M*/
        int n =10;
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(j==0 || j==n-1 || i==j && j<=(n-1)/2 || j>=(n-1)/2 && i+j == n-1)
                {
                    System.out.print("*");
                }
                // else if( i ==2)
                // {
                //     System.out.print("-");
                // }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}