import org.junit.Test;
import static org.junit.Assert.*;

public class DelDuplicateTest {
	@Test
    public void delDuplicateTest() {
        String str1 = "baaabbc";
        assertEquals("babc", DelDuplicate.delDuplicate(str1));

        String str2 = "aaaaaa";
        assertEquals("a", DelDuplicate.delDuplicate(str2));

        String str3 = "";
        assertEquals("", DelDuplicate.delDuplicate(str3));

        String str4 = "bbaabbaabb";
        assertEquals("babab", DelDuplicate.delDuplicate(str4));
    }
	
    
}
