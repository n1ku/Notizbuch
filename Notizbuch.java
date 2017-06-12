
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

    /**
     * Diese Methode erstellt ein neues Objekt der Klasse Notiz und speichert die Referenz in
     * einem Datenfeld, welches das Notizbuch besitzt. Die Methode erkennt, wenn drei Notizen
     * erstellt wurden und verweigert die Erstellung weiterer Notizen. Im Erfolgsfall gibt die
     * Methode «true» zurück, falls keine Notiz mehr gespeichert werden können, gibt sie den
     * Wert «false» zurück.
     */
    /**
     *
     * @param prioritaet
     * @param tag
     * @param monat
     * @param jahr
     * @param text
     *
     */
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

    /**
     * Liefert die Anzahl der bereits gespeicherten Notizen zurück, welche im Notizbuch
     * hinterlegt sind.
     *
     */
    public int gibAnzahlGespeicherterNotizen()
    {
        switch (count)
        {
            case 0: return 0;
            case 1: return 1;
            case 2: return 2;
            case 3: return 3;
            default: return 0;
        }
    }

    /**
     * Liefert die Objektreferenz eines Notiz-Objekts zurück, falls die Positionsnummer korrekt
     * eingegeben wurde. Falls unter der Nummer keine Notiz gefunden wird, oder eine falsche
     * Nummer übergeben wurde, liefert die Methode den Wert «null» zurück.
     */
    /**
     *
     * @param nummer
     * @return
     */
    public Notiz gibNotizMitNummer(int nummer)
    {
        switch (nummer)
        {
            case 1: return note0;
            case 2: return note1;
            case 3: return note2;
            default: return null;
        }
    }

    /**
     * Gibt alle Notizen mit sämtlichen Informationen der Notizen aus der Konsole aus. Falls
     * keine Notizen im Notizbuch vorhanden sind, gibt die Methode den Satz „Sorry, keine
     * Notizen vorhanden“ aus.
     */
    public void gibAlleNotizenAus()
    {
        if(this.note0 != null)
        {
            switch (count)
            {
                case 1: System.out.println(note0.gibNotizAlsText());
                        break;
                case 2: System.out.println(note0.gibNotizAlsText());
                        System.out.println(note1.gibNotizAlsText());
                        break;
                case 3: System.out.println(note0.gibNotizAlsText());
                        System.out.println(note1.gibNotizAlsText());
                        System.out.println(note2.gibNotizAlsText());
                        break;
            }
        }
        else { System.out.println("Sorry, keine Notizen vorhanden"); }
    }
}