public class Parse
{
    public static void main(String[] args)
    {
        if(args.length != 2)
        {
            System.err.println("NEm jÓ!");
            System.exit(1);
        }
        int egy;
        int ketto;
        egy = Integer.parseInt(args[0]);
        ketto = Integer.parseInt(args[1]);
        for(int i = egy; i <= ketto; i++)
        {
            System.out.println(i/2.0);
        }
    }
}