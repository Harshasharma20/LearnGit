package test1.hibernate1;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration con = new Configuration();
        
        SessionFactory factory = con.buildSessionFactory();
        
        //Session session = factory.openSession();
        
        System.out.println(factory);
        
       // System.out.println(factory.isClosed());
    }
}
