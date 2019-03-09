import java.util.Date;

//Note: Comarable is java.lang class
public abstract class Item implements Comparable
{
    //You implement the compareTo method in Item and it's used for all subclasses of item to compare
    //The default sort function uses that method to sort
    //But you can pass another parameters to it which is a class that has the compare method from comparator implemented
    //Then it will use that method instead to sort

    private String id;
    private String title;
    private Date addedOn;

    public Item(String id, String title, Date addedOn)
    {
        this.id=id;
        this.title=title;
        this.addedOn=addedOn;
    }

    /*
    public int compareTo(String A, String B){

        //Override the Compareto function using comparator?
        //The compareTo compares id
        for (int i = 0; i < A.length() && i < B.length(); i++) {
            if ((int)A.charAt(i) == (int)B.charAt(i)) {
                continue;
            }
            else {
                return (int)A.charAt(i) - (int)B.charAt(i);
            }
        }

        // Edge case for strings like
        // String 1="Geeky" and String 2="Geekyguy"
        if (A.length() < B.length()) {
            return -1;
        }
        else if (A.length() > B.length()) {
            return 1;
        }

        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }
    */




}
