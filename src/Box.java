

public class Box <T extends Comparable<>{

    private T value;


    //NO GOOD no argument constructor with null val fucker
//    public box(){
//        this.value = null;
//    }

    public Box(T value){
        this.setValue(value);;
    }

    public T getvalue(){
        return this.value;
    }

    public void setValue (T value){
        this.value = value;
    }

    @Override
    public String toString(){
        return String.format("Value=('%s')", this.value.toString());
    }
}
