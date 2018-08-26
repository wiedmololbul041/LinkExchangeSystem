
/**
* LinkExchangeSystemOperations.java .
* Error reading Messages File.
* Error reading Messages File.
* niedziela, 26 sierpnia 2018 19:09:20 Czas środkowoeuropejski letni
*/

public interface LinkExchangeSystemOperations 
{
  void register (String username, org.omg.CORBA.IntHolder userID);
  void addLink (int userID, String link, org.omg.CORBA.IntHolder linkID);
  boolean linkRemove (int userID, int linkID);
  boolean publishLink (int userID, int linkID);
  int getLinks (int userID, stringTableHolder links);
} // interface LinkExchangeSystemOperations
