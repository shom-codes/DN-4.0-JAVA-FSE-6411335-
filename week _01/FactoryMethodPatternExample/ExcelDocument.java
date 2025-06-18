package FactoryMethodPatternExample;

public class ExcelDocument implements Document{
    @Override
    public void open() {
        System.out.println("Excel is opening\n");
    }

    @Override
    public void close() {
        System.out.println("Excel is closing\n");
    }
}
