public class Hello
{
    public static void main(String[] args)
    {
        if(args.length != 1)
        {
            System.err.println("Nincs argumentum!");
            System.exit(1);
        }
            System.console().printf("Szervusz %s!\n" ,args[0]);
            System.out.println("Viszlát " + args[0] +"!");
    }
}