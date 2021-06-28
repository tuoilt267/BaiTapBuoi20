import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
public class BaiTapBuoi20 {
        ArrayList<Person> people = new ArrayList<>(List.of(
                new Person("Vinh", "Vietnam", 28),
                new Person("Lan", "Vietnam", 24),
                new Person("John", "USA", 27),
                new Person("Lee", "China", 67),
                new Person("Kim", "Korea", 22),
                new Person("Long", "Vietnam", 18),
                new Person("Jungho", "Korea", 19),
                new Person("Tian", "China", 20),
                new Person("Clara", "USA", 40),
                new Person("Mikura", "Japan", 27),
                new Person("Sony", "Japan", 29),
                new Person("Xiang", "China", 78),
                new Person("Peter", "France", 18),
                new Person("Haloy", "Malaysia", 20),
                new Person("Magie", "Malaysia", 32)
        ));
//    Đếm số người theo từng quốc tịch in ra màn hình
    public  void countNation () {
        HashMap<String, Integer> count = new HashMap<>();
        for (Person person : people) {
            if (count.get(person.getNationality()) == null) {
                count.put(person.getNationality(), 1);
            } else {
                count.put(person.getNationality(), count.get(person.getNationality()) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
//    Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình
    public  void arrageNamebyAge () {
        ArrayList <Person> listAgebyName = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() > 25) {
                listAgebyName.add(person);
            }
        }
        listAgebyName.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
    }

//       Tính trung bình tuổi của người theo từng quốc gia
    public void  averageAgebyCountry() {
        HashMap<String, Double> averageAgebyCountry = new HashMap<>();
        people.stream().forEach(
                person -> Collectors.groupingBy(Person::getNationality, Collectors.averagingInt(Person::getAge)));

        for (Map.Entry<String, Double> entry : averageAgebyCountry.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
//   In ra màn hình đánh giá tuổi mỗi người
    public void danhGiabyAge(){
        String danhgia = "";
        for (Person person: people){
            if (person.getAge()<20){
                danhgia = "nổi loạn";
            }
            else if (person.getAge()>=20&& person.getAge()<=30){
                danhgia = "việc làm";
            }
            else if (person.getAge()>=31 && person.getAge()<=40){
                danhgia = "sự nghiệp";
            }
            else danhgia = "hưởng thụ";
            System.out.println(person + " - " + danhgia);
        }
    }
}