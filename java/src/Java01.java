public class Java01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] fr = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
                fr[j] = visited; // 비지티드에서는 볼 수 없어야 함
                //배열 안에 모든 데이터 타입이 같아야 한다
                //배열은 반드시 0이상의 양의 정수다 없으며 골치 아프다
                //같은 곳에다가 비지티드를 표시한다
                //0000000 -1
                System.out.println();
            }
        }
    }
}

