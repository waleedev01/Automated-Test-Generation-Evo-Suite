/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 24 17:35:17 GMT 2023
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Triangle_ESTest extends Triangle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(1645, 2917, 1414);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(682, 446, 446);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(1, 1, 1);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(1697, 767, 1697);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(112, 112, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Triangle triangle0 = new Triangle();
  }
}
