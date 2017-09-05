

public class BigBox<T, U> {

    private T typeOne;

    private U typeTwo;

    public BigBox(T typeOne, U typeTwo) {
        this.setTypeOne(typeOne);
        this.setTypeTwo(typeTwo);
    }

    @Override
    public String toString() {
        return String.format("BigBox{typeOne=%s, typeTwo=%s}", this.getTypeOne(), typeTwo);
    }

    public T getTypeOne() {
        return typeOne;
    }

    public void setTypeOne(T typeOne) {
        this.typeOne = typeOne;
    }

    public U getTypeTwo() {
        return typeTwo;
    }

    public void setTypeTwo(U typeTwo) {
        this.typeTwo = typeTwo;
    }
}
