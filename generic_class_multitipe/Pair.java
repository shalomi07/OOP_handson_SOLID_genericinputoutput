package generic_class_multitipe;

public class Pair<T1,T2>{
    private T1 first;
    private T2 second;
    public Pair(T1 first, T2 second){
        this.first = first;
        this.second = second;
    }
    public void showTypes(){
        System.out.println(first.getClass().getName() + " & " + second.getClass().getName());
    }

    public Pair<T2, T1> swap() {
        return new Pair<>(second, first);
    }

    public T1 getFirst(){
        return first;
    }

    public T2 getSecond(){
        return second;
    }

    public static void main(String[] args){
        Pair<Integer, String> pair_intstr = new Pair<>(1, "A");
        pair_intstr.showTypes();

        Pair<Double, Boolean> pair_dblbool = new Pair<>(0.5, true);
        pair_dblbool.showTypes();

        Pair<String, String> pair_swappable = new Pair<>("Awal", "Akhir");
        System.out.println("Sebelum Swap: first = " + pair_swappable.getFirst() + "second = " + pair_swappable.getSecond());

        pair_swappable.swap();
        System.out.println("Sesudah Swap: first = " + pair_swappable.getFirst() + "second = " + pair_swappable.getSecond());

    }
}
