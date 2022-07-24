package proxy;

public class Client
{
    public static void main (String[] args)
    {
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("twitter.com");
            internet.connectTo("facebook.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}