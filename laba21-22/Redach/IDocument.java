package laba21-22;

import java.io.FileWriter;
import java.io.IOException;

public interface IDocument {
    FileWriter fw = null;
    void save() throws IOException;
    void create() throws IOException;
    void open() throws IOException;
    void close() throws IOException;
}
