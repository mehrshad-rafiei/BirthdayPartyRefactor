package scrap.heap.refactor;

import scrap.heap.refactor.domain.Balloon;
import scrap.heap.refactor.domain.Cake;
import scrap.heap.refactor.domain.Color;

public class App {

    public String getGreeting() {
        return "Hello world.";
    }

    public Order order() {

        Order order = new Order();
        addBalloons(order);
        addCakes(order);

        order.execute();
        return order;
    }

    private void addBalloons(Order order) {
        Balloon redBalloon = Balloon.Builder.newInstance()
                .setColor(Color.RED)
                .setMaterial(Balloon.Material.MYLAR)
                .build();

        Order.LineItem lineItem = new Order.LineItem(redBalloon, 4);
        order.addLineItem(lineItem);

        Balloon blueBaloon = Balloon.Builder.newInstance()
                .setColor(Color.BLUE)
                .setMaterial(Balloon.Material.LATEX)
                .build();

        lineItem = new Order.LineItem(blueBaloon, 7);
        order.addLineItem(lineItem);

        Balloon yellowBallon = Balloon.Builder.newInstance()
                .setColor(Color.YELLOW)
                .setMaterial(Balloon.Material.MYLAR)
                .build();

        lineItem = new Order.LineItem(yellowBallon, 4);
        order.addLineItem(lineItem);
    }

    private void addCakes(Order order) {
        Cake largeCake = Cake.Builder.newInstance()
                .setFlavor(Cake.Flavor.CHOCOLATE)
                .setFrostingFlavor(Cake.Flavor.CHOCOLATE)
                .setShape(Cake.Shape.CIRCLE)
                .setSize(Cake.Size.LARGE)
                .setColor(Color.BROWN)
                .build();

        Order.LineItem lineItem = new Order.LineItem(largeCake, 1);
        order.addLineItem(lineItem);


        Cake mediumCake = Cake.Builder.newInstance()
                .setFlavor(Cake.Flavor.VANILLA)
                .setFrostingFlavor(Cake.Flavor.CHOCOLATE)
                .setShape(Cake.Shape.SQUARE)
                .setSize(Cake.Size.MED)
                .setColor(Color.BROWN)
                .build();

        lineItem = new Order.LineItem(mediumCake, 1);
        order.addLineItem(lineItem);

        Cake smallCake = Cake.Builder.newInstance()
                .setFlavor(Cake.Flavor.VANILLA)
                .setFrostingFlavor(Cake.Flavor.VANILLA)
                .setShape(Cake.Shape.SQUARE)
                .setSize(Cake.Size.SMALL)
                .setColor(Color.YELLOW)
                .build();

        lineItem = new Order.LineItem(smallCake, 1);
        order.addLineItem(lineItem);
    }
}
