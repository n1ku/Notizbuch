
/**
 * Write a description of class Notiz here.
 *
 * @author (n1k)
 * @version (07062017)
 */
public class Notiz
{
    private int prioritaet;
    private Datum datum;
    private String text;

    /***
     *
     * @param prioritaet
     * @param tag
     * @param monat
     * @param jahr
     * @param text
     */
    public Notiz(int prioritaet, int tag, int monat, int jahr, String text)
    {
        this.prioritaet=prioritaet;
        this.datum=datum;
        this.text=text;
        datum = new Datum(tag, monat, jahr);
    }
    public int getPrioritaet()
    {
        return this.prioritaet;
    }
    public Datum getDatum()
    {
        return this.datum;
    }
    public String getText()
    {
        return this.text;
    }
    public String gibNotizAlsText()
    {
        String notiz=null;
        notiz += "Prioritaet: " + this.prioritaet;
        notiz += ", Datum: " + this.datum.gibDatumAlsText();
        notiz += ", Text: " + this.text;
        return notiz;
    }
}