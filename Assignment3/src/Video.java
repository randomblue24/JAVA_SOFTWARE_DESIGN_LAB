import java.util.Date;

public class Video extends MultiMediaItem
{
    private String director;

    public Video(String id,String title, Date addedOn, int playingTime,String director){
        super(id,title,addedOn,playingTime);
        this.director=director;

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
