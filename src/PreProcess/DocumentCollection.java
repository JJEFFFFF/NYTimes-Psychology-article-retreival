package PreProcess;

import java.io.IOException;
import java.util.Map;

/**
 * This is for INFSCI 2140 in 2018
 * 
 * DocumentCollection is an interface for reading individual document files from 
 * a collection file.
 */
public interface DocumentCollection {
	
	/**
	 * Try to read and return the next document stored in the collection.
	 * If it is the end of the collection file, return null.
	 * Each document should be stored as a Map, the key is the document number, while the value is document content
	 * so that you can get the document's number by calling doc.keySet().iterator().next()
	 * and document's content by map.get(document's number)
	 * 
	 * @return The next document stored in the collection; or null if it is the end of the collection file.
	 */
	public abstract Map<String, Map<Object, Map<Object, Object>>> nextDoc() throws IOException;
	
}
