import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    /* to be implemented in part (a) */
    for(int i=0; i<myList.size(); i++){
      if(myList.get(myList.get((i).size()))==len){
        num++;
      }
    }
    
  }

  public void removeWordsOfLength(int len)
  {
    /* to be implemented in part (b) */
    ArrayList <String> Aa = new ArrayList <String>();
    int n=0;
    for(int i=0; i<myList.size(); i++){
      if(myList.get(myList.get((i).size()))!=len){
        Aa[n]=myList.get(i);
        n++;
      }
    }
}
