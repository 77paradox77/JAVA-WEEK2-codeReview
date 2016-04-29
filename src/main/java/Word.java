import java.util.ArrayList;

public class Word {
  private static ArrayList<Word> instances = new ArrayList<Word>();
  private String mWord;
  private int mId;

  public Word(String word) {
    mWord = word;
    instances.add(this);
    mId = instances.size();
  }


  public String getWord() {
    return mWord;
  }


  public static ArrayList<Word> all() {
    return instances;
  }

  public int getId() {
    return mId;
  }

  public static void clear() {
    //This method is a built in method
    instances.clear();
  }

}
