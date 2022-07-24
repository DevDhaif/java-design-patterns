package proxy;

import java.util.ArrayList;
import java.util.List;
  
  
public class ProxyInternet implements Internet
{
	private Internet internet = new RealInternet();
    private static List<String> bannedSites;
      
    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("facebook.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }
      
    @Override
    public void connectTo(String url) throws Exception
    {
        if(bannedSites.contains(url.toLowerCase()))
        {
            throw new Exception("Access to "+url.toLowerCase()+" was Denied");
        }
          
        internet.connectTo(url);
    }
  
}