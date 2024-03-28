package javaEx_F;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {
   public static void main(String[] args) {
       // 1) 파일 및 디렉터리 확인
       String filePath = "C:/fileTest4/윤동주.txt"; // 확인할 파일 경로
       File file = new File(filePath);
       if (file.exists()) { // 파일이 존재하는지 확인
           if (file.isFile()) { // 파일인지 디렉터리인지 확인
               System.out.println("파일이 존재합니다.");
           } else {
               System.out.println("디렉터리입니다.");
               return; // 디렉터리일 경우 프로그램 종료
           }
       } else {
           System.out.println("파일이 존재하지 않습니다.");
           return; // 파일이 없을 경우 프로그램 종료
       }
       
       // 2) 파일 이동
       String testDir = "C:/FileTest/testFile/temp"; // 파일을 이동할 디렉터리 경로
       File DirFile = new File(testDir);
       if (!DirFile.exists()) { // 디렉터리가 존재하지 않으면
           DirFile.mkdirs(); // 디렉터리 생성
       } 
       File moveFile = new File(testDir, file.getName()); // 이동할 파일 경로 (디렉터리 + 파일명)
       boolean moved = file.renameTo(moveFile); // 파일 이동
       if (moved) {
           System.out.println("파일이 성공적으로 이동되었습니다.");
       } else {
           System.out.println("파일 이동에 실패했습니다.");
           return; // 파일 이동에 실패할 경우 프로그램 종료
       }

       // 3) 파일 내용 읽기
       try (BufferedReader br = new BufferedReader(new FileReader(moveFile))) {
           String line;
           while ((line = br.readLine()) != null) { // 파일에서 한 줄씩 읽기
               System.out.println(line); // 콘솔에 출력
           }
       } catch (IOException e) {
           System.out.println("파일 읽기 중 오류가 발생했습니다: " + e.getMessage());
       } 
   }
}