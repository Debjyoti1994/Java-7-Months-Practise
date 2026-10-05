public record Dog(String name,int Rank,Double cost) {
    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", Rank=" + Rank +
                ", cost=" + cost +
                '}';
    }
}
