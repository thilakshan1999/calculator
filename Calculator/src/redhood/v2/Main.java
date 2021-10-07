package redhood.v2;

public class Main
{
    public static void main(String[] args) {
        if(args.length==0)
        {
            System.out.println("Please provide the operation as argument");
            return;
        }
        String operator=args[0];
        if(!(operator.equals("add")||operator.equals("sub")||operator.equals("mul")))
        {
            System.out.println("Plese provide add ,sub or mul as operational argument");
            return;
        }
        System.out.println(args[0]);

    }
}
