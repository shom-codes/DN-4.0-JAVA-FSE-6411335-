package FactoryMethodPatternExample;

public class PdfDocument implements Document{
    @Override
    public void open() {
        System.out.println("Pdf is opening\n");
    }

    @Override
    public void close() {
        System.out.println("Pdf is closing\n");
    }
}
