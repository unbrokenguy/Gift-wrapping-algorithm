package ru.kpfu.itis.DataParser;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface Parser<T>{
    Parser data(InputStream cin) throws FileNotFoundException;
    T next();
    void save(String string) throws IOException;
}
