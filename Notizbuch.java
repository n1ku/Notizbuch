
/**
 * Write a description of class Notizbuch here.
 *
 * @author (n1k)
 * @version (07062017)
 */
public class Notizbuch
{
    private Notiz note0;
    private Notiz note1;
    private Notiz note2;
    private int count;
    private int max;

    public Notizbuch()
    {
        this.note0 = null;
        this.note1 = null;
        this.note2 = null;
        this.count = 0;
        this.max = 3;
    }

    public boolean erstelleNotiz( int prioritaet, int tag, int monat, int jahr, String text)
    {
        if(count < 3)
        {
            Notiz note = new Notiz(prioritaet,tag,monat,jahr,text);
            switch (count)
            {
                case 0: this.note0 = note;
                        this.count++;
                        return true;

                case 1: this.note1 = note;
                        this.count++;
                        return true;
                case 2: this.note2 = note;
                        this.count++;
                        return true;
                default: return false;
            }
        }
        return false;

    }
}