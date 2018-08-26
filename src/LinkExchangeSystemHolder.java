
/**
* LinkExchangeSystemHolder.java .
* Error reading Messages File.
* Error reading Messages File.
* niedziela, 26 sierpnia 2018 20:00:38 Czas środkowoeuropejski letni
*/

public final class LinkExchangeSystemHolder implements org.omg.CORBA.portable.Streamable
{
  public LinkExchangeSystem value = null;

  public LinkExchangeSystemHolder ()
  {
  }

  public LinkExchangeSystemHolder (LinkExchangeSystem initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LinkExchangeSystemHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LinkExchangeSystemHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LinkExchangeSystemHelper.type ();
  }

}
