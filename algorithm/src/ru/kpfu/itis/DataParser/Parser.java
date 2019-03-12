package ru.kpfu.itis.DataParser;

import java.io.FileNotFoundException;
import java.io.InputStream;

public interface Parser<T>{
    Parser data(InputStream cin) throws FileNotFoundException;
    T next();
}
