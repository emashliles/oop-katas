//package tddshapes;
//
//import java.util.List;
//
//public class Toybox {
//    private List<Shapes> contents;
//    private double totalArea;
//
//    public Toybox(List<HasArea> contents) {
//
//        this.contents = contents;
//    }
//
//    public double calculateArea() {
//
//        for (Shapes content : contents) {
//
//            totalArea += content.calculateArea();
//        }
//        return totalArea;
//
//    }
//}
