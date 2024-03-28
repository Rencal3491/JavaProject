package quiz;

import java.util.Random;
import java.util.TreeSet;

public class Lotto {
    public static void main(String[] args) {
        TreeSet<Integer> lottoNumbers = new TreeSet<>();
        Random random = new Random();

        while (lottoNumbers.size() < 6) {
            int randomNumber = random.nextInt(45) + 1; // 1부터 45까지의 난수 생성
            lottoNumbers.add(randomNumber);
        }

        System.out.println("생성된 로또 번호: " + lottoNumbers);
    }
}