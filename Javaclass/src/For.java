public class For {
    public static void main(String[] args) {
        Java20240308 tom = new Java20240308("Tom", 18, "Dajeon","123456");
        Java20240308 steve = new Java20240308("Steve", 25, "Seoul", "123450");
        Java20240308 paul = new Java20240308();


        tom.displayAll();
        steve.displayAll();
        paul.displayAll();
        paul.setAddress("Incheon");
        paul.setAge(22);
        paul.setName("Paul");

        System.out.println(tom.getPersonalNum());


        // 메소드 호출
        int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
        int[] numberList1 = {123,345,235,7898,467};
        getSumAvg(numberList);
        getSumAvg(numberList1);







             }


        static void getSumAvg(int[] numberList) {

            // 7. 아래 배열의 총합과 평균을 출력

            int sum = 0;
            for (int i = 0; i < numberList.length; i++) {
                sum = sum + numberList[i];
            }
            int average = sum / numberList.length;
            System.out.println(sum + " " + average);

        }
    }
