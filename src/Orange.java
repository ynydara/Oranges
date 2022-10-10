public class Orange implements Comparable<Orange>{
    private double weight;
    private double diameter;
    private int ripeLevel;

    public Orange(double weight, double diameter, int ripeLevel) {
        if (weight > 0){
            this.weight = weight;
        }else this.weight= 1;

        if (diameter > 0 ){
            this.diameter = diameter;
        }else this.diameter = 1;

        if (ripeLevel > 0){
            this.ripeLevel = ripeLevel;
        }else this.ripeLevel = 1;

    }
    public String toString(){
        return " Orange(weight: " + weight + ", " + " diameter: " + diameter + " ripeLevel: " + ripeLevel +")";
    }

    @Override
    public int compareTo(Orange other) {

        if (this.weight < other.weight){
            return -1;
        } else if (this.weight == other.weight){
            return 0;
        }else return 1;


    }
}
