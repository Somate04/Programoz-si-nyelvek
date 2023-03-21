
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
	TriangularNumbersStructureTest.class,
	TriangularNumbersTest.class
})
public class TriangularNumbersSuite {}
