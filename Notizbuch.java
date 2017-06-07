
/**
 * Write a description of class Notizbuch here.
 *
 * @author (n1k)
 * @version (07072017)
 */
public class Notizbuch
{
    private Notiz notes;

    public boolean erstelleNotiz( int prioritaet, int tag, int monat, int jahr, String text)
    {
        this.notes = new Notiz(prioritaet,tag,monat,jahr,text);
    }
}
