package lambda;

public class Lambdas
{

    public static void main(String[] args)
    {
        Lambdas ll = new Lambdas();

        ll.execute();
    }

    class   ABC
    {

        public void printMe()
        {
            System.out.println("Hello from ABC::orintMe()");
        }
    }

    class XYZ extends ABC {
        @Override
        public void printMe(){
            System.out.printf("Hello from XYZ: sprintMe()");
        }

    }

    interface Callback{
        void execute();
    }

    public void execute()
    {
        XYZ xyz = new XYZ();
        xyz.printMe();

        ABC abc = new ABC(){
            @Override
            public void printMe(){

                System.out.printf("Hello from Child: sprintMe()");
                super.printMe();

            }
        };
        abc.printMe();

        Callback cc = new Callback(){
            @Override
            public void execute(){
                System.out.printf("Hello from callback; execute");
            }
        };
        cc.execute();

        Callback cc2 =()->{
            System.out.printf("Hello from callback; execute; cc2");
    };
        cc2.execute();
    }
}