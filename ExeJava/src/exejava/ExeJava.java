
package exejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExeJava {

    List<Student> studentList;
    Function function;
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Nguyễn Mai Linh",2000,"0123456789","HTTT",0));
        studentList.add(new Student("Trần Mạnh Long",2000,"011111111","KTPM",0));
        studentList.add(new Student("Hoàng Xuân Chiến",2000,"012222222","KHMT",1));
        studentList.add(new Student("Đoàn Minh Hằng",2000,"013333333","CNTT",1));
        int choose = -1;
        Scanner sc = new Scanner(System.in);
        do{
            showMainMenu();
            System.out.println("\n Nhập lựa chọn: ");
            try {
                choose = sc.nextInt();
            }catch (Exception e) {
                System.out.println("Nhập sai!");
                sc.nextLine();
            }
            switch (choose) {
            case 0:
                    System.out.println("Thoát");
                    break;
            case 1:
                    manageStudent(studentList);
                    break;
            case 2:
                    Function.printStudentList(studentList);
                    break;
            case 3:
                    arrangeStudentList(studentList);
                    break;
            case 4:
                    filterStudentList(studentList);
                    break;
            case 5:
                    Function.findStudent(studentList);
                    break;
            default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }while(choose!=0);
        }
    
    private static void manageStudent(List<Student> studentList) {
        int choose = -1;
        Scanner in = new Scanner(System.in);
        do{
            showManageMenu();
            System.out.println("\n Nhập lựa chọn: ");
            try {
                choose = in.nextInt();
            }catch (Exception e) {
                System.out.println("Nhập sai!");
                in.nextLine();
            }
            switch (choose) {
            case 0:
                    break;
            case 1:
                    System.out.println("them");
                    Function.addStudent(studentList);
                    break;
            case 2:
                    System.out.println("sua");
                    Function.editStudent(studentList);
                    break;
            case 3:
                    System.out.println("Xoa");
                    Function.deleteStudent(studentList);
                    break;
            default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }while(choose!=0);
    }
    
    private static void printStudentList(List<Student> studentList) {
        Function.printStudentList(studentList);
    }

    private static void arrangeStudentList(List<Student> studentList) {
        int choose = -1;
        Scanner in = new Scanner(System.in);
        do{
            showArrangeMenu();
            System.out.println("\n Nhập lựa chọn: ");
            try {
                choose = in.nextInt();
            }catch (Exception e) {
                System.out.println("Nhập sai!");
                in.nextLine();
            }
            switch (choose) {
            case 0:
                    break;
            case 1:
                    Function.arangeStudentByName(studentList);
                    break;
            case 2:
                    Function.arangeStudentByYear(studentList);
                    break;
            case 3:
                    Function.arangeStudentByPhone(studentList);
                    break;
            default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }while(choose!=0);
    }

    private static void filterStudentList(List<Student> studentList) {
        int choose = -1;
        Scanner in = new Scanner(System.in);
        do{
            showFilterMenu();
            System.out.println("\n Nhập lựa chọn: ");
            try {
                choose = in.nextInt();
            }catch (Exception e) {
                System.out.println("Nhập sai!");
                in.nextLine();
            }
            switch (choose) {
            case 0:
                    break;
            case 1:
                    Function.filterStudent0(studentList);
                    break;
            case 2:
                    Function.filterStudent1(studentList);
                    break;
            default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }while(choose!=0);
    }

    private static void findStudent(List<Student> studentList) {
        Function.findStudent(studentList);
    }

    
    private static void showMainMenu() {
        
        System.out.println("\n\n Các chức năng");
        System.out.println("1. Quản lý sinh viên");
        System.out.println("2. In danh sách sinh viên");
        System.out.println("3. Sắp xếp danh sách sinh viên");
        System.out.println("4. Lọc danh sánh sinh viên");
        System.out.println("5. Tìm kiếm");
        System.out.println("0. Thoát");
    }
    
    private static void showManageMenu() {
        
        System.out.println("\n\n Các chức năng quản lý sinh viên");
        System.out.println("1. Thêm");
        System.out.println("2. Sửa");
        System.out.println("3. Xóa");
        System.out.println("0. Quay lại");
    }
    
    private static void showArrangeMenu() {
        
        System.out.println("\n\n Các chức năng sắp xếp");
        System.out.println("1. Sắp xếp theo tên");
        System.out.println("2. Sắp xếp theo năm sinh");
        System.out.println("3. Sắp xếp theo số điện thoại");
        System.out.println("0. Quay lại");
    }
    
    private static void showFilterMenu() {
        
        System.out.println("\n\n Các chức năng lọc");
        System.out.println("1. Lọc theo hệ Đại Học");
        System.out.println("2. Lọc theo hệ Cao Đẳng");
        System.out.println("0. Quay lại");
    }
    
}

