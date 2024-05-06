import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        // random 객체 생성 및 초기화
        Random random = new Random();

        // 정수형 변수 randomNum 변수 선언
        int randomNum;

        // 변수 randomNum을 정수타입 랜덤함수로 초기화
        // 랜덤의 범위를 5까지로 설정.
        // random으로 나온 0,1,2,3,4 값에 + 1을 해준다.
        randomNum = random.nextInt(5) + 1;

        // randomNum 출력
        System.out.println(randomNum);

    }
}
