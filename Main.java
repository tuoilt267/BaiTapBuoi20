import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bài tập 1: Đếm số người theo từng quốc tịch in ra màn hình");
        System.out.println("Bài tập 2: Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình");
        System.out.println("Bài tập 3: Tính trung bình tuổi của người theo từng quốc gia");
        System.out.println("Bài tập 4: In ra màn hình đánh giá tuổi mỗi người");
        System.out.print("Nhập bài tập muốn kiểm tra: ");
        int bt= sc.nextInt();
        BaiTapBuoi20 bt20 = new BaiTapBuoi20();
        switch (bt){
            case 1: {
                bt20.countNation();
//                System.out.println("\nCách 2: \n");
//                bt20.countNation1();
                break;
            }
            case 2: {
                bt20.arrageNamebyAge();
//                System.out.println("\nCách 2: \n");
//                bt20.arrageNamebyAge1();
                break;
            }
            case 3: {
                bt20.averageAgebyCountry();
                break;
            }
            case 4: {
                bt20.danhGiabyAge();
                break;
            }
            default: {
                System.out.println("Không có bài tập này!");
            }
        }
    }
}
