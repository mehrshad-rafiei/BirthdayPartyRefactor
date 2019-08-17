package scrap.heap.refactor;

import scrap.heap.refactor.domain.Orderable;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<LineItem> lineItems;

    public Order() {
        this.lineItems = new ArrayList<>();
    }

    public void addLineItem(LineItem lineItem) {
        this.lineItems.add(lineItem);
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void execute() {
        lineItems.forEach(l -> System.out.println("Line item ordered: " + l.toString()));
    }

    public static class LineItem {

        public LineItem(Orderable orderable, int number) {
            this.orderable = orderable;
            this.number = number;
        }

        private Orderable orderable;
        private int number;

        public Orderable getOrderable() {
            return orderable;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("LineItem{");
            sb.append(number).append(" X ");
            sb.append(orderable.toString());
            sb.append('}');
            return sb.toString();
        }
    }
}
