import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;


public class Java20240307 {
    public static void main(String[] args) {
        //6. 아래 배열에서 입력 받은 값보다 큰 수만 출력하시오
        int[] intList = {1,2,3,4,5,6,7,8,9,10};
        Scanner scan = new Scanner(System.in);
        System.out.print("0~10까지 숫자를 입력해주세요 : ");
        int num = scan.nextInt();
        for (int i = 0; i < intList.length ; i--) {
//          //  if(i
//
//
//
//            // 새로운 배열에 담기 : Arraylist 사용하기
//           // ArrayList<Integer>
//
//
//
//         //7. 아래 배열의 총합과 평균을 출력하시오
//         int[] numberlist = {12,34,56,32,84,99,73,69};
//            //for (int i = 0; i < intList.length; i++)
//               // if (i)
//
//         //8. 사용자로부터 문자열을 입력 받아서 입력 받은 문자열을 거꾸로 출력
//         // 예) hello를 입력하며 olleh를 출력
//                    String[] word = ("hello");
//
//
//
//         // 난수생성법, Random 숫자 만드는 법
//         Random rd = new Random();
//         int randNum = rd.nextInt(10)+1; // 0부터 입력한 정수값 -1 범위에서 랜덤
//         System.out.println(randNum);
//
//
//         // 9. 1~45까지 랜덤한 정수를 length가 6인 배열에 넣으시오.
            Random rd1 = new Random();
            int randNum = rd1.nextInt(45) + 1;


            //1부터 100까지 중에서 2의 배수만 뽑아

            for (i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }


        }
        }
    }

