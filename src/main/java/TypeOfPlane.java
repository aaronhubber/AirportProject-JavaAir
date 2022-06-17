public enum TypeOfPlane {

    BOEING_747(100, 1000),
    AIRBUS_A350(200, 1500),
    ATR_42 (50, 600),
    CESSNA(2, 100);

    public final int capacity;
    public final int weight;

    TypeOfPlane(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
