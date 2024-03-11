public class Java20240308 {
   private String name;
   private int age;
   private String address;

   private String personalNum;

    public Java20240308() { // 기본생성자 // 모든 생성자는 기본 생상자를 가지고 있다

    }

    public Java20240308(String name, int age, String address, String personalNum) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.personalNum = personalNum;
    }

    public String getPersonalNum() {
        return personalNum;
    }

    public void setPersonalNum(String personalNum) {
        this.personalNum = personalNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void displayAll() {
        System.out.println(this.name + " " + this.address + " " + this.age);
    }
}


//양의 정수 10개를 입력하고
배열에 담기

