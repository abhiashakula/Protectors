import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//Main class for running all tests
public class TestRunner {
   public static void main(String[] args) {
	   //storing result after running all tests in tests.java file
      Result result = JUnitCore.runClasses(tests.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		//printing all the tests which are successful
      System.out.println(result.wasSuccessful());
   }
}
