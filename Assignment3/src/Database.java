import java.util.ArrayList;
import java.util.Iterator;


public class Database {

    private ArrayList <Item> item = new ArrayList <Item>(10 );

    public Database()
    {

    }

    public void addItem(Item item1)
    {
        item.add(item1);

    }
    public void list()
    {
        Iterator it = item.iterator( );

        while ( it.hasNext( ) ) {
            System.out.println( it.next( ) );
        }
    }

}
