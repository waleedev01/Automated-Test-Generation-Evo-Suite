/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 24 16:05:47 GMT 2023
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SortBubble_ESTest extends SortBubble_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer[] integerArray0 = new Integer[3];
      Integer integer0 = new Integer((-3318));
      integerArray0[0] = integer0;
      Integer integer1 = new Integer((-1));
      integerArray0[1] = integer1;
      Integer integer2 = new Integer((-3318));
      integerArray0[2] = integer2;
      Integer integer3 = new Integer(1292);
      // Undeclared exception!
      try { 
        SortBubble.sort(integerArray0, integer3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("SortBubble", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer[] integerArray0 = SortBubble.sort((Integer[]) null, integer0);
      assertNull(integerArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SortBubble sortBubble0 = new SortBubble();
  }
}
