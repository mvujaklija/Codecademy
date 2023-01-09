public class Store1 {

    //Definition of instances

    String productType;

    //Definition of constructor

    public Store1(String product) {

        productType = product;

    }

    //Definition of advertise method

    public void advertise() {

        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");

    }


    //Main method

    public static void main(String[] args) {

        Store1 lemonadeStand = new Store1("Lemonade");
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();
    }
}
