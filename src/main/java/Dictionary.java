import java.util.ArrayList;

public class Dictionary {

  private static ArrayList<Dictionary> instances = new ArrayList<Dictionary>();

  private boolean mCompleted;
  private String mDescription;
  private String mWord;

  public Dictionary(String description) {
    mDescription = description;
    mWord = word;
    instances.add(this);
  }

  public String getDescription() {
    return mDescription;
  }

  public String getWord() {
    return mWord;
  }

}
