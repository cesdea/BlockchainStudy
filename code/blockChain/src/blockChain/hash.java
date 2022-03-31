package blockChain;

import java.awt.print.Printable;
import java.sql.Timestamp;

public class hash {
	String myCode;
	String preCode;
	
	public static String hash(String my,String pre){
		String code=my+pre+String.valueOf(System.currentTimeMillis());
		return code;
	}
}
