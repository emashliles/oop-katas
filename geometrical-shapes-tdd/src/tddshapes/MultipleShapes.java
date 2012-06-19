package tddshapes;

import java.util.List;

public class MultipleShapes {

    private List<HasArea> contains;

    public MultipleShapes(List<HasArea> contains) {
        this.contains = contains;
    }

    public double calculateTotalArea() {
        double total_area = 0;
        for (HasArea item : contains) {
            total_area += item.calculateArea();
        }

        return total_area;

    }
}
