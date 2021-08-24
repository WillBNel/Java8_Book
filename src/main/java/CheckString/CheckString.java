package CheckString;

	public class CheckString {
	
	private static final String CHECK = "Who are you?!?";
	CheckString() {};
	public boolean GuessAgain(String guess) {
		if (guess.equals(CHECK)) return true; else return false;
	}
	public boolean Compare(String str1, String str2) {
		if (str1.equals(str2)) return true; else return false;
	}
}
//
//	
//	package cs;
//	import static org.junit.Assert.assertEquals;
//	import org.junit.Test;
//	public class CheckStringTest {
//		@Test
//		public void ConstantTestExpectedFail() {
//			CheckString cs = new CheckString();
//			assertEquals(cs.GuessAgain("I give up!"),false);
//		}
//		@Test
//		public void ConstantTestPass() {
//			CheckString cs = new CheckString();
//			assertEquals(cs.GuessAgain("You'll Never Guess!"),true);
//		}
//		
//		@Test
//		public void CompareTestExpectedFail() {
//			CheckString cs = new CheckString();
//			assertEquals(cs.Compare("Hello", "Hi"),false);
//		}
//		@Test
//		public void CompareTestPass() {
//			CheckString cs = new CheckString();
//			assertEquals(cs.Compare("Hello", "Hello"),true);
//		}
//	}