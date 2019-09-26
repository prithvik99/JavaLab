import java.util.*;
class shapemain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        shape s1;
        rectangle r=new rectangle();
        triangle t=new triangle();
        circle c=new circle();
        
        System.out.println("MAIN MENU\n1.Area Of Rectangle\n2.Area Of Triangle\n3.Area Of Circle");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter length and breath");
                int l=sc.nextInt();
                int b=sc.nextInt();
                r.getdata(l,b);
                r.printArea();
                break;
                
            case 2:
              System.out.println("Enter base and heigth");
                int b1=sc.nextInt();
                int h=sc.nextInt();
                t.getdata(b1,h);
                t.printArea();
                break;
            case 3:
              System.out.println("Enter radius"); 
              int r1=sc.nextInt();
                c.getdata(r1);
                c.printArea();
                break;
                                default: System.out.println("INVALID INPUT");
            }
        }
    }
