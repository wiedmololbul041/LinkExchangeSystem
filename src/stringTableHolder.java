
/**
* stringTableHolder.java .
* Error reading Messages File.
* Error reading Messages File.
* niedziela, 26 sierpnia 2018 19:54:14 Czas środkowoeuropejski letni
*/

public final class stringTableHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public stringTableHolder ()
  {
  }

  public stringTableHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = stringTableHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    stringTableHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return stringTableHelper.type ();
  }

}
