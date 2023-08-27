package GenericsLab.GenericScale_03;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(6, 6);
        System.out.println(scale.getHeavier());
    }
}
