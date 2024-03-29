/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 24 16:05:11 GMT 2023
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
      Integer integer0 = new Integer(0);
      integerArray0[0] = integer0;
      Integer[] integerArray1 = new Integer[9];
      integerArray1[0] = integerArray0[0];
      Integer integer1 = new Integer((-713));
      integerArray1[1] = integer1;
      Integer integer2 = new Integer(870);
      // Undeclared exception!
      try { 
        SortBubble.sort(integerArray1, integer2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer[] integerArray0 = new Integer[3];
      Integer integer0 = new Integer(0);
      integerArray0[0] = integer0;
      integerArray0[1] = integer0;
      Integer integer1 = new Integer(1578);
      // Undeclared exception!
      try { 
        SortBubble.sort(integerArray0, integer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer[] integerArray0 = SortBubble.sort((Integer[]) null, integer0);
      assertNull(integerArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SortBubble sortBubble0 = new SortBubble();
  }
}
