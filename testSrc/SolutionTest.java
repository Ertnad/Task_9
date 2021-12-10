import ru.vsu.sc.tretyakov_d_s.Solution;
import ru.vsu.sc.tretyakov_d_s.Utils.ArrayAndListUtils;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testFirst() {
    List<Integer> input = ArrayAndListUtils.readListFromFile("testFiles/test1.txt");
    List<Integer> output = ArrayAndListUtils.readListFromFile("testFiles/answer1.txt");

    assert input != null;
    int n = 2;
    List<Integer> testResult = solution.createNewList(input, n);

    Assert.assertEquals(output, testResult);
  }
  @Test
  public void testSecond() {
    List<Integer> input = ArrayAndListUtils.readListFromFile("testFiles/test2.txt");
    List<Integer> output = ArrayAndListUtils.readListFromFile("testFiles/answer2.txt");

    assert input != null;
    int n = 2;
    List<Integer> testResult = solution.createNewList(input, n);

    Assert.assertEquals(output, testResult);
  }
  @Test
  public void testThird() {
    List<Integer> input = ArrayAndListUtils.readListFromFile("testFiles/test3.txt");
    List<Integer> output = ArrayAndListUtils.readListFromFile("testFiles/answer3.txt");

    assert input != null;
    int n = 2;
    List<Integer> testResult = solution.createNewList(input, n);

    Assert.assertEquals(output, testResult);
  }
  @Test
  public void testFourth() {
    List<Integer> input = ArrayAndListUtils.readListFromFile("testFiles/test4.txt");
    List<Integer> output = ArrayAndListUtils.readListFromFile("testFiles/answer4.txt");

    assert input != null;
    int n = 2;
    List<Integer> testResult = solution.createNewList(input, n);

    Assert.assertEquals(output, testResult);
  }
  @Test
  public void testFifth() {
    List<Integer> input = ArrayAndListUtils.readListFromFile("testFiles/test5.txt");
    List<Integer> output = ArrayAndListUtils.readListFromFile("testFiles/answer5.txt");

    assert input != null;
    int n = 2;
    List<Integer> testResult = solution.createNewList(input, n);

    Assert.assertEquals(output, testResult);
  }
  @Test
  public void testSixth() {
    List<Integer> input = ArrayAndListUtils.readListFromFile("testFiles/test6.txt");
    List<Integer> output = ArrayAndListUtils.readListFromFile("testFiles/answer6.txt");

    assert input != null;
    int n = 2;
    List<Integer> testResult = solution.createNewList(input, n);

    Assert.assertEquals(output, testResult);
  }
  @Test
  public void testSeventh() {
    List<Integer> input = ArrayAndListUtils.readListFromFile("testFiles/test7.txt");
    List<Integer> output = ArrayAndListUtils.readListFromFile("testFiles/answer7.txt");

    assert input != null;
    int n = 4;
    List<Integer> testResult = solution.createNewList(input, n);

    Assert.assertEquals(output, testResult);
  }
  @Test
  public void testEighth() {
    List<Integer> input = ArrayAndListUtils.readListFromFile("testFiles/test8.txt");
    List<Integer> output = ArrayAndListUtils.readListFromFile("testFiles/answer8.txt");

    assert input != null;
    int n = 2;
    List<Integer> testResult = solution.createNewList(input, n);

    Assert.assertEquals(output, testResult);
  }
  @Test
  public void testNinth() {
    List<Integer> input = ArrayAndListUtils.readListFromFile("testFiles/test9.txt");
    List<Integer> output = ArrayAndListUtils.readListFromFile("testFiles/answer9.txt");

    assert input != null;
    int n = 2;
    List<Integer> testResult = solution.createNewList(input, n);

    Assert.assertEquals(output, testResult);
  }
  @Test
  public void testTenth() {
    List<Integer> input = ArrayAndListUtils.readListFromFile("testFiles/test10.txt");
    List<Integer> output = ArrayAndListUtils.readListFromFile("testFiles/answer10.txt");

    assert input != null;
    int n = 10;
    List<Integer> testResult = solution.createNewList(input, n);

    Assert.assertEquals(output, testResult);
  }
}