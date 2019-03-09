import java.util.Date;

public abstract class MultiMediaItem extends Item
{
    private static int playingTime;

    /*
    //Should these even be here?
    private String id;
    private String title;
    private Date addedOn;

    */

    public MultiMediaItem(String id,String title, Date addedOn, int playingTime)
    {
        super(id,title,addedOn);

        this.playingTime=playingTime;

        /*
        id=id1;
        title=title1;
        addedOn=addedOn1;
        playingTime=playingTime1;
        */
    }

}
