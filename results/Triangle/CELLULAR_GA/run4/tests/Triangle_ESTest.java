/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 24 18:21:49 GMT 2023
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
      int int0 = Triangle.classifyTriangle(2345, 2410, 973);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(3, 2, 2);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(3133, 3133, 890);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(2942, 2942, 2942);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(890, 0, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Triangle triangle0 = new Triangle();
  }
}
