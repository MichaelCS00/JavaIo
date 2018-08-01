import java.util.Scanner;



public class Main {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        class Fraction{
            private int a;
            private int b;

            public Fraction(int a1,int b1){
                a=a1;
                b=b1;
            }

            public double toDouble(){
                double t=a/b;
                return t;
            }

            public Fraction plus(Fraction r){
                Fraction newf= new Fraction(0,0);
                int pa=b*r.a+a*r.b;
                int pb=b*r.b;
                int re=0;
                int m=0;
                int n=0;
                while(n !=0)
                {
                    m=(pa>=pb)?pa:pb;
                    n=(pa<pb)?pa:pb;
                    re=m%n;
                    m=n;
                    n=re;
                }
                pa=pa/m;
                pb=pb/n;
                newf.a=pa;
                newf.b=pb;
                return newf;
            }
            public Fraction multiply(Fraction r){
                Fraction newf= new Fraction(0,0);
                int pa=a*r.a;
                int pb=b*r.b;
                int m=0;
                int n=0;
                int re=0;
                while(n !=0)
                {
                    m=(pa>=pb)?pa:pb;
                    n=(pa<pb)?pa:pb;
                    re=m%n;
                    m=n;
                    n=re;
                }
                pa=pa/m;
                pb=pb/n;
                newf.a=pa;
                newf.b=pb;
                return newf;
            }
            public void print(){
                if(a/b==1){
                    System.out.println("1");
                }
                System.out.println(a+"/"+b);
            }
        }


        Fraction a = new Fraction(in.nextInt(), in.nextInt());

        Fraction b = new Fraction(in.nextInt(),in.nextInt());

        a.print();

        b.print();

        a.plus(b).print();

        a.multiply(b).plus(new Fraction(5,6)).print();

        a.print();

        b.print();

        in.close();

    }



}