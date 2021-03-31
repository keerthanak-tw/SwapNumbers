import java.util.ArrayList;

public class SwapNumber {

    private final ArrayList<Integer> array;

    public SwapNumber(ArrayList<Integer> array) {
        this.array = array;
    }


    public int SwapNumbers() {
        int swaps = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i+1) {
                swaps++;
                int temp = array.get(i);
                int index = array.indexOf(i+1);
                array.set(i, i+1);
                array.set(index, temp);
            }
        }
        return swaps;
    }
}
