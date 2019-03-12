package ru.kpfu.itis.DataGenerator;

public interface Generator<T>{
    T generate();
    T generate(int range);
}
