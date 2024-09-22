/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author TechCare
 */
public class Processor {
    public static void main(String[] args) {
        StudentList studentList = new StudentList;
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Cap nhat sinh vien theo ID");
            System.out.println("3. Xoa sinh vien theo ID");
            System.out.println("4. Hien thi tat ca sinh vien");
            System.out.println("5. Tim sinh vien co GPA cao nhat");
            System.out.println("6. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    studentList.addStudent();
                    break;
                case 2:
                    studentList.updateStudentById();
                    break;
                case 3:
                    studentList.deleteStudentById();
                    break;
                case 4:
                    studentList.displayAllStudents();
                    break;
                case 5:
                    studentList.findTopStudent();
                    break;
                case 6:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 6);
    }

    
}
