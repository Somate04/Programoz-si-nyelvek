public class Nemtom
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
        System.out.println(egy + ketto);
        System.out.println(egy - ketto);
        System.out.println(egy * ketto);
        if(ketto == 0)
        {
            System.out.println("NeM OstUnk NulLával!");
        }
        else
        {
            System.out.println(egy / ketto);
            System.out.println(egy % ketto);
        }
        
    }
}