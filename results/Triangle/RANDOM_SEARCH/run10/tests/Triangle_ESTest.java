/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 24 18:02:24 GMT 2023
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
      int int0 = Triangle.classifyTriangle(4636, 1379, 3525);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(658, 658, 1207);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(1379, 1379, 1379);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = Triangle.classifyTriangle((-3193), (-936), (-936));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(3525, 3525, 1379);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Triangle triangle0 = new Triangle();
  }
}
