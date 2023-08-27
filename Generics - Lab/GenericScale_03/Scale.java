package GenericsLab.GenericScale_03;

public class Scale <T extends Comparable<T>>{
    T leftElement;
    T rightElement;

    public Scale(T leftElement, T rightElement) {
        this.leftElement = leftElement;
        this.rightElement = rightElement;
    }

    public T getHeavier(){
        if (this.leftElement.compareTo(this.rightElement)>0){
            return this.leftElement;
        }
        if (this.leftElement.compareTo(this.rightElement)<0){
            return this.rightElement;
        }

        return null;
    }
}
