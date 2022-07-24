package proxy.pattern;

public class Client
{
    public static void main (String[] args)
    {
        ICollege  college= new ProxyCollege();
        try
        {
        	college.studyingInCollege(8000);
        	college.studyingInCollege(7500);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}