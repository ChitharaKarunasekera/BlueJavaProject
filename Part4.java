
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
public class Part4 {
    URLResource file = new  URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
    
    for (String item : file.words()) {
        String itemLower = item.toLowerCase();
       	int pos = itemLower.indexOf("youtube.com");
       	if (pos != -1) {
       	    MISSING CODE;
        }
    }
}
