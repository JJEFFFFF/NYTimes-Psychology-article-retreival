package Index;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import Classes.Path;

public class preProcessedCorpusReader {

    private BufferedReader br;
    private FileInputStream instream_collection;
    private InputStreamReader is;

    public preProcessedCorpusReader(String type) throws IOException {
        // This constructor should open the file in Path.DataTextDir
        // and also should make preparation for function nextDocument()
        // remember to close the file that you opened, when you do not use it any more
        instream_collection = new FileInputStream(Path.preprocessOutput);
        is = new InputStreamReader(instream_collection);
        br = new BufferedReader(is);
    }


    public Map<String, String> nextDocument() throws IOException {
        String docno=br.readLine();
        if(docno==null) {
            instream_collection.close();
            is.close();
            br.close();
            return null;
        }
        String content =br.readLine();
        Map<String, String> doc = new HashMap<String, String>();
        doc.put(docno, content);
        return doc;
    }
}

