/**This is object-oriented programming because
*programs are built around objects and their interactions.
*An object contains state and behavior.
 */

/**A class is the set of instructions that describe how an instance can behave and what information it contains.*/

//Definition of the class

public class MyStore {

    //Declaration of instances (adding a state)

    String productType;
    int inventoryCount;
    double inventoryPrice;

    //Definition of constructor
    public MyStore(String product, int count, double price) {

        productType = product;
        inventoryCount = count;
        inventoryPrice = price;


    }

    //Definition of main method

    public static void main(String[] args) {

        //Creating new object (instance)

        MyStore lemonadeStand = new MyStore("lemonade", 25,1.12);
        MyStore cookieShop = new MyStore("cookies",12,3.75);
        System.out.println("My store is selling: " + lemonadeStand.productType + " at price " + lemonadeStand.inventoryPrice + " and we have it " + lemonadeStand.inventoryCount + " pieces");
        System.out.println("We also selling " + cookieShop.productType + " at price " + cookieShop.inventoryPrice + " and we have it " + cookieShop.inventoryCount + " pieces");
    }

}
