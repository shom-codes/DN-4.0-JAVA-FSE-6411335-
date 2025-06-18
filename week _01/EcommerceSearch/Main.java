package EcommerceSearch;

public class Main {
    public static void main(String[] args) {
        Product[] pdts = {
            new Product(1, "AC", "Appliances"),
            new Product(3, "Cards", "Toys"),
            new Product(2, "Deodrants", "Beauty"),            
            new Product(4, "Smart watch", "Gadgets")                    
        };
        System.out.println("Linear Search: ");
        Product pdt = LinearSearch.linSearch(pdts, 4);
        System.out.println(pdt);
        System.out.println();

        BubbleSort.sort(pdts);
        System.out.println("products list after sorting id:");
        BubbleSort.printArr(pdts);
        System.out.println();
        
        System.out.println("Binary Search: ");
        Product pdt2 = BinarySearch.binSearch(pdts, 3);
        System.out.println("found pdt: "+ pdt2);
    }
}
