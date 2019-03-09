import java.util.Date;

public class Textbook extends Item
{

    private String author;

    /*
    //Should these even be here?
    private String id;
    private String title;
    private Date addedOn;
    */

    public Textbook(String id,String title, Date addedOn, String author)
    {
        super(id,title,addedOn);
        this.author=author;
    }

    public int compareTo(String A, String B){

        //Override the Compareto function using comparator?
        //The compareTo compares id
        /*
        for (int i = 0; i < A.length() && i < B.length(); i++) {
            if ((int)A.charAt(i) == (int)B.charAt(i)) {
                continue;
            }
            else {
                return (int)A.charAt(i) - (int)B.charAt(i);
            }
        }
        */
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

}
