package FactoryMethodPatternExample;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Word is opening\n");
    }

    @Override
    public void close() {
        System.out.println("Word is closing\n");
    }
}
