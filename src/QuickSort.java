
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSort {

    public static List<Integer> quicksort(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return numbers;
        }
         Integer pivot = numbers.get(0);
         List<Integer> lower = new ArrayList<>();
         List<Integer> higher = new ArrayList<>();
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < pivot) {
                lower.add(numbers.get(i));
            } else {
                higher.add(numbers.get(i));

            }
        }
        List<Integer> sorted = quicksort(lower);
        sorted.add(pivot);
        sorted.addAll(quicksort(higher));
        return sorted;
    }

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++){
            list.add(random.nextInt(100));
        }

        System.out.println(list.toString());

        System.out.println(QuickSort.quicksort(list).toString());
    }
}
