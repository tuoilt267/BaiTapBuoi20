import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bài tập 1: Đếm số người theo từng quốc tịch in ra màn hình");
        System.out.println("Bài tập 2: Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình");
        System.out.println("Bài tập 3: Tính trung bình tuổi của người theo từng quốc gia");
        System.out.print("Nhập bài tập muốn kiểm tra: ");
        int bt= sc.nextInt();
        BaiTapBuoi20 bt20 = new BaiTapBuoi20();
        switch (bt){
            case 1: {
                bt20.countNation();
                break;
            }
            case 2: {
                bt20.arrageNamebyAge();
                break;
            }
            case 3: {
                bt20.averageAgebyCountry();
                break;
            }
            default: {
                System.out.println("Không có bài tập này!");
            }
        }
    }
}
