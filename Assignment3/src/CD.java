import java.util.Date;

public class CD extends MultiMediaItem
{

    private String artist;

    /*
    //Should these even be here?
    private String id;
    private String title;
    private Date addedOn;
    private int playingTime;
    */

    public CD(String id,String title, Date addedOn, int playingTime, String artist)
    {

        //super is used to call the constructor, methods and properties of parent class.
        //You may also use the super keyword in the sub class when you want to invoke a method from the parent class when you have overridden it in the subclass.
        super(id,title,addedOn,playingTime);

        this.artist=artist;

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
