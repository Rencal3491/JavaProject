package quiz;

import java.util.ArrayList;
import java.util.List;

public class SetOperations {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        List<Integer> list2 = new ArrayList<>(List.of(4, 5, 6, 7, 8, 9));

        // 합집합
        List<Integer> union = new ArrayList<>(list1);
        union.addAll(list2);
        union = new ArrayList<>(union.stream().distinct().toList());
        System.out.println("합집합: " + union);

        // 교집합
        List<Integer> intersection = new ArrayList<>();
        for (Integer num : list1) {
            if (list2.contains(num)) {
                intersection.add(num);
            }
        }
        System.out.println("교집합: " + intersection);

        // 차집합
        List<Integer> difference1 = new ArrayList<>(list1);
        difference1.removeAll(list2);
        List<Integer> difference2 = new ArrayList<>(list2);
        difference2.removeAll(list1);
        System.out.println("차집합: " + difference1 + ", " + difference2);
    }
}