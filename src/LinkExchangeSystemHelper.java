
/**
* LinkExchangeSystemHelper.java .
* Error reading Messages File.
* Error reading Messages File.
* niedziela, 26 sierpnia 2018 19:54:14 Czas środkowoeuropejski letni
*/

abstract public class LinkExchangeSystemHelper
{
  private static String  _id = "IDL:LinkExchangeSystem:1.0";

  public static void insert (org.omg.CORBA.Any a, LinkExchangeSystem that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static LinkExchangeSystem extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (LinkExchangeSystemHelper.id (), "LinkExchangeSystem");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static LinkExchangeSystem read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_LinkExchangeSystemStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, LinkExchangeSystem value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static LinkExchangeSystem narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof LinkExchangeSystem)
      return (LinkExchangeSystem)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _LinkExchangeSystemStub stub = new _LinkExchangeSystemStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static LinkExchangeSystem unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof LinkExchangeSystem)
      return (LinkExchangeSystem)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _LinkExchangeSystemStub stub = new _LinkExchangeSystemStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
