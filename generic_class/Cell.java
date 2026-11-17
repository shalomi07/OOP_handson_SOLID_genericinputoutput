package generic_class;

public class Cell<T> {
    private T data;
    public void setValue(T data){
        this.data = data;
    }
    public T getValue(){
        return data;
    }
    public void displayType(){
        if (data != null){
            System.out.println("Tipe data = " + data.getClass().getName());
        } else {
            System.out.println("Data masih kosong");
        }
    }

    public static void main(String[] args){
        Cell<Integer> cellInt = new Cell<>();
        cellInt.setValue(100);
        System.out.println("Nilai cellInt: " + cellInt.getValue());
        cellInt.displayType();

        System.out.println();

        Cell<String> cellStr = new Cell<>();
        cellStr.setValue("Generics");
        System.out.println("Nilai cellStr: " + cellStr.getValue());
        cellStr.displayType();

    }
}


