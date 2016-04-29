import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {
  @After
  public void tearDown() {
    Definition.clear();
    Word.clear();
  }

  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("Define");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void getName_definitionInsantiatesWithName_Home() {
    Definition testDefinition = new Definition("Define");
    assertEquals("Define", testDefinition.getName());
  }

  @Test
  public void all_returnsAllArrayObjectsOfDefinition_true() {
    Definition firstDefinition = new Definition("Define");
    Definition secondDefinition = new Definition("Define2");
    assertTrue(Definition.all().contains(firstDefinition));
    assertTrue(Definition.all().contains(secondDefinition));
  }

  @Test
  public void clear_definitionInstantiatesWithanId_1() {
    Definition testDefinition = new Definition("Define");
    assertEquals(1, testDefinition.getId());
  }

  @Test
  public void clear_emptiesAllDefinitionFromList_0() {
    Definition testDefinition = new Definition("Define");
    assertEquals(Definition.all().size(), 1);
  }


}
