
/**
* _LinkExchangeSystemStub.java .
* Error reading Messages File.
* Error reading Messages File.
* niedziela, 26 sierpnia 2018 19:54:14 Czas środkowoeuropejski letni
*/

public class _LinkExchangeSystemStub extends org.omg.CORBA.portable.ObjectImpl implements LinkExchangeSystem
{

  public void register (String username, org.omg.CORBA.IntHolder userID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("register", true);
                $out.write_string (username);
                $in = _invoke ($out);
                userID.value = $in.read_long ();
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                register (username, userID        );
            } finally {
                _releaseReply ($in);
            }
  } // register

  public void addLink (int userID, String link, org.omg.CORBA.IntHolder linkID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("addLink", true);
                $out.write_long (userID);
                $out.write_string (link);
                $in = _invoke ($out);
                linkID.value = $in.read_long ();
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                addLink (userID, link, linkID        );
            } finally {
                _releaseReply ($in);
            }
  } // addLink

  public boolean linkRemove (int userID, int linkID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("linkRemove", true);
                $out.write_long (userID);
                $out.write_long (linkID);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return linkRemove (userID, linkID        );
            } finally {
                _releaseReply ($in);
            }
  } // linkRemove

  public boolean publishLink (int userID, int linkID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("publishLink", true);
                $out.write_long (userID);
                $out.write_long (linkID);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return publishLink (userID, linkID        );
            } finally {
                _releaseReply ($in);
            }
  } // publishLink

  public int getLinks (int userID, stringTableHolder links)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getLinks", true);
                $out.write_long (userID);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                links.value = stringTableHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getLinks (userID, links        );
            } finally {
                _releaseReply ($in);
            }
  } // getLinks

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:LinkExchangeSystem:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _LinkExchangeSystemStub
