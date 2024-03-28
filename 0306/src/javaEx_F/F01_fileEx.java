package javaEx_F;

import java.io.File;

public class F01_fileEx {
	static String env_path = "C:\\Program Files\\Amazon Corretto\\jdk17.0.10_7\\bin;C:\\Windows\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;C:\\Windows\\System32\\OpenSSH\\;C:\\Program Files (x86)\\NVIDIA Corporation\\PhysX\\Common;C:\\Program Files\\dotnet\\;C:\\Program Files\\Amazon Corretto\\jdk17.0.10_7\\bin;C:\\Program Files (x86)\\Windows Live\\Shared;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\WINDOWS\\System32\\Wbem;C:\\WINDOWS\\System32\\WindowsPowerShell\\v1.0\\;C:\\WINDOWS\\System32\\OpenSSH\\;C:\\Program Files\\Amazon Corretto\\jdk17.0.10_7\\bin;C:\\Program Files\\Docker\\Docker\\resources\\bin;C:\\tools\\Git\\cmd;C:\\Program Files\\nodejs\\;C:\\Users\\Rencal\\AppData\\Local\\Microsoft\\WindowsApps;C:\\Program Files\\Bandizip\\;C:\\Users\\Rencal\\AppData\\Local\\Microsoft\\WindowsApps;C:\\Users\\Rencal\\AppData\\Roaming\\npm";

	public static void main(String[] args) {
		//File 객체는 파일과 디렉토리 작업을 위해서 사용하는 객체
		File f = new File("D:/FileTest/a.txt");
		File dir = new File("./"); 				//현재 작업위치
		//1. exists() : 파일 혹은 디렉토리 존재 유무를 확인
		System.out.println("exists? : "+ f.exists());
		System.out.println("exists? : "+ dir.exists());
		System.out.println("==============================");
		//2. isDirectory() : 디렉토리 여부 확인 (파일이면 false)
		System.out.println("isDirectoty? : "+ f.isDirectory());
		System.out.println("isDirectoty? : "+ dir.isDirectory());
		System.out.println("==============================");
		//3. isAbsolute() : 해당 경로가 절대 경로인지 아닌지 확인
		System.out.println("isAbsolute? : "+ f.isAbsolute());
		System.out.println("isAbsolute? : "+ dir.isAbsolute());
		System.out.println("==============================");
		//4. canExcute, canRead, canWrite : 권한 확인
		System.out.println("canExcute? : "+ f.canExecute());
		System.out.println("canRead? : "+ f.canRead());
		System.out.println("canWrite? : "+ f.canWrite());
		System.out.println("==============================");
		System.out.println("canExcute? : "+ dir.canExecute());
		System.out.println("canRead? : "+ dir.canRead());
		System.out.println("canWrite? : "+ dir.canWrite());
		System.out.println("==============================");
		//5. getAbsolutePath : 절대 경로 반환 (상대 경로의 절대경로 찾기)
		System.out.println("./의 실제 위치 (절대경로) : " + dir.getAbsolutePath());
		System.out.println("==============================");
		//6. 부모 폴더의 문자열 반환
		System.out.println(f.getParent());	//문자열
		System.out.println("==============================");
		//7. 부모 폴더를 File 객체로 반환
		File f_parent = f.getParentFile();	//파일 객체 
		System.out.println(f_parent);
		System.out.println("==============================");
		//8. static 값들
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println("==============================");
		// 환경변수
		String[] path = env_path.split(File.pathSeparator);
		for(String p : path) {
			System.out.println(p);
		}
		// 파일에 대한 생성/수정/삭제
		File test = new File("D:\\FileTest\\temp\\abc");
		// mkdir : 해당 경로에 폴더를 만듭니다, 단. 경로상 없는 폴더가 없어야 함
		// mkdirs : 존재하지 않는 상위 경로 폴더까지 모두 포함하여 만듬
		if(!test.exists()) { //파일 디렉토리가 존재하지 않는 경우
			test.mkdirs();
		}
		test = new File("D:/FileTest/temp/a.txt");
		try {
			test.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 생성 중 에러가 발생했습니다");
		}
		//delete : 파일 혹은 폴더를 삭제한다, 단. 폴더가 비어있지 않으면 삭제 불가능
		test = new File("D:/FileTest/temp/abc");
		test.delete();
////		test = new File("D:/FileTest/temp/a.txt");
////		test.delete();s
////		test = new File("D:/FileTest/temp");
////		test.delete();
//		//renameTo : 파일이나 폴더의 이름 및 경로를 변경
		test = new File("D:/FileTest/temp");
		File dst = new File("D:/FileTest/temp222");
		test.renameTo(dst);
	
	}
}
