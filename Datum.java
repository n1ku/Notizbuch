
/**
 * Write a description of class Notiz here.
 *
 * @author (n1k)
 * @version (07062017)
 */

public class Datum
{
    private int tag;
    private int monat;
    private int jahr;

    /***
     *
     * @param tag
     * @param monat
     * @param jahr
     */
    public Datum(int tag, int monat, int jahr)
    {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }
    public int getTag()
    {
        return this.tag;
    }
    public int getMonat()
    {
        return this.monat;
    }
    public int getJahr()
    {
        return this.jahr;
    }
    public String gibDatumAlsText()
    {
        return ""+this.tag+"."+this.monat+"."+this.jahr;
    }
}