/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 24 16:05:16 GMT 2023
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
      Integer[] integerArray0 = new Integer[8];
      Integer integer0 = new Integer(1941);
      integerArray0[0] = integer0;
      Integer integer1 = new Integer(2251);
      integerArray0[1] = integer1;
      integerArray0[2] = integerArray0[0];
      // Undeclared exception!
      try { 
        SortBubble.sort(integerArray0, integerArray0[0]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer[] integerArray0 = new Integer[1];
      Integer integer0 = new Integer(1);
      Integer[] integerArray1 = SortBubble.sort(integerArray0, integer0);
      assertSame(integerArray0, integerArray1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SortBubble sortBubble0 = new SortBubble();
  }
}
