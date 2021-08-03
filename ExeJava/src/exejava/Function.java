
package exejava;

import java.util.List;
import java.util.Scanner;

public class Function {
    
    public static void addStudent(List<Student> studentList){
        Scanner sc = new Scanner(System.in);
        String name="";
        int birthyear=0;
        String phonenumber="";
        String major="";
        int type = 0;
        
        System.out.println("Họ tên: ");
        name = sc.nextLine();
        do{
            System.out.println("Năm sinh: ");
            try {
                birthyear = sc.nextInt();
            } catch (Exception e) {
            }
            sc.nextLine();
        }while(birthyear==0);
        boolean checkPhone = true;
        do{
            System.out.println("Số điện thoại: ");
            phonenumber = sc.nextLine();
            checkPhone = isExistPhone(studentList, phonenumber);
            if(checkPhone)
                System.out.println("Số điện thoại đã tồn tại!");
        }while(checkPhone);
        
        System.out.println("Chuyên ngành");
        major = sc.nextLine();
        System.out.print("Chọn hệ đào tạo: ");
        System.out.print("0 - Hệ cao đẳng\t\t1 - Hệ đại học\n");
        do{
            System.out.print("Nhập lựa chọn: ");
            try {
                type = sc.nextInt();
            }catch (Exception e) {
                System.out.println("Nhập sai!");
                sc.nextLine();
            }
        }while(type!=1 && type!=0);
        studentList.add(new Student(name,birthyear,phonenumber,major,type));
    }

    private static boolean isExistPhone(List<Student> studentList, String phonenumber) {
        for (Student student : studentList) {
            if(student.getPhonenumber().equalsIgnoreCase(phonenumber))
                return true;
        }
        return false;
    }
    public static void editStudent(List<Student> studentList){
        String phonenumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập sđt sinh viên cần sửa:");
        phonenumber = sc.nextLine();
        int existPhone = 0;
        for (Student student1 : studentList) {
            if(student1.getPhonenumber().equalsIgnoreCase(phonenumber)){
                existPhone=1;
                System.out.println("Thông tin sinh viên: ");
                System.out.println(student1.fullInforString());
                System.out.println("Cập nhật thông tin sinh viên:");
                String name="";
                int birthyear=0;
                String major="";
                int type = 0;
                System.out.println("Họ tên: ");
                name = sc.nextLine();
                student1.setName(name);
                do{
                    System.out.println("Năm sinh: ");
                    try {
                        birthyear = sc.nextInt();
                    } catch (Exception e) {
                    }
                    sc.nextLine();
                }while(birthyear==0);
                student1.setBirthyear(birthyear);

                System.out.println("Chuyên ngành");
                major = sc.nextLine();
                student1.setMajor(major);
                System.out.print("Chọn hệ đào tạo: ");
                System.out.print("0 - Hệ Đại học\t\t1 - Hệ Cao đẳng\n");
                do{
                    System.out.print("Nhập lựa chọn: ");
                    try {
                        type = sc.nextInt();
                    }catch (Exception e) {
                        System.out.println("Nhập sai!");
                        sc.nextLine();
                    }
                }while(type!=1 && type!=0);
                student1.setType(type);

                System.out.print("Thông tin sinh viên sau khi sửa: ");
                System.out.println(student1.fullInforString());
            }
            if(existPhone==0)
                System.out.println("Không có số điện thoại này!");
        }
    }
    public static void deleteStudent(List<Student> studentList){
        String phonenumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập sđt sinh viên cần xóa:");
        phonenumber = sc.nextLine();
        if(isExistPhone(studentList, phonenumber)){
            for (Student student1 : studentList) {
                if(student1.getPhonenumber().equalsIgnoreCase(phonenumber)){
                    System.out.println("Thông tin sinh viên: ");
                    System.out.println(student1.fullInforString());
                    int select = 0;
                    System.out.print("Bạn chắc chắn muốn xóa? ");
                    System.out.print("0 - Hủy\t\t1 - Xóa\n");
                    do{
                        System.out.print("Nhập lựa chọn: ");
                        try {
                            select = sc.nextInt();
                        }catch (Exception e) {
                            System.out.println("Nhập sai!");
                            sc.nextLine();
                        }
                    }while(select!=1 && select!=0);
                    if(select==1)
                        studentList.remove(studentList.indexOf(student1));
                }
            }
        }
        else{
            System.out.println("Không có số điện thoại này!");
        }
    }
    public static void printStudentList(List<Student> studentList){
        System.out.println("Danh sách sinh viên");
        for (Student student : studentList) {
            System.out.println(student.inforString());
        }
    }
    public static void arangeStudentByName(List<Student> studentList){
        studentList.sort((s1,s2) -> s2.getName().compareToIgnoreCase(s1.getName()));
        System.out.println("Danh sách sau khi sắp xếp: ");
        for (Student student : studentList) {
            System.out.println(student.fullInforString());
        }
    }
    public static void arangeStudentByYear(List<Student> studentList){
        studentList.sort((s1,s2) -> s1.getBirthyear()-s2.getBirthyear());
        System.out.println("Danh sách sau khi sắp xếp: ");
        for (Student student : studentList) {
            System.out.println(student.fullInforString());
        }
    }
    public static void arangeStudentByPhone(List<Student> studentList){
        studentList.sort((s1,s2) -> s1.getPhonenumber().compareToIgnoreCase(s2.getPhonenumber()));
        System.out.println("Danh sách sau khi sắp xếp: ");
        for (Student student : studentList) {
            System.out.println(student.fullInforString());
        }
    }
    
    public static void filterStudent0(List<Student> studentList){
        System.out.println("Danh sách các sinh viên hệ Đại học: ");
        for (Student student : studentList) {
            if(student.getType()==0)
                System.out.println(student.fullInforString());
        }
    }
    public static void filterStudent1(List<Student> studentList){
        System.out.println("Danh sách các sinh viên hệ Cao đẳng: ");
        for (Student student : studentList) {
            if(student.getType()==1)
                System.out.println(student.fullInforString());
        }
        
    }
    public static void findStudent(List<Student> studentList){
        String searchString;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin cần tìm:");
        searchString = sc.nextLine();
        
        searchString = searchString.toLowerCase();
        
        int i = 0;
        for (Student student : studentList) {
            String type="";
            if(student.getType()==0)
                type = "Đại học";
            else type = "Cao đẳng";
            if(student.getName().toLowerCase().contains(searchString)
            || (student.getBirthyear()+"").toLowerCase().contains(searchString)
            || student.getPhonenumber().toLowerCase().contains(searchString)
            || student.getMajor().toLowerCase().contains(searchString)
            || type.toLowerCase().contains(searchString))
            {
                i++;
                System.out.println(student.fullInforString());
            }
        }
        if(i==0)
            System.out.println("Không tìm thấy kết quả nào!");
        else
            System.out.println("Tìm thấy "+i+" kết quả!");
    }

}
