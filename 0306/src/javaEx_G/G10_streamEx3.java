package javaEx_G;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import javax.naming.directory.BasicAttribute;

public class G10_streamEx3 {
	/*
	 * 파일에서 스트림 생성하기
	 * Files.find(Path,int,BiPredicate,FileVisitOperation)
	 *  Files.list(Path)
	 *  반환 타입은 Stream<Path>
	 * 
	 * Files.lines(Path, Charset), BufferedReader.lines()
	 * 반환 타입ㅇ : Stream<String>
	 */
	public static void main(String[] args) {
		try {
			Path path = Paths.get("src/java_0326/G09_streamEx2.java");
			Stream<String> stream = Files.lines(path,Charset.defaultCharset());
			stream.forEach(s-> System.out.println(s));
			stream.close();
			System.out.println("\n\n");
			//BufferedReader 의 lines()사용
			File file = path.toFile();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.lines().forEach(s-> System.out.println(s));
			
			System.out.println();
			System.out.println("디렉터리 내용을 읽어서 처리");
			System.out.println("list 메소드를 이용하여 Stream 생성하기");
			path = Paths.get("src");
			System.out.println("\n\n");
			//src경로의 모든 디렉터리와 파일을 Stream 객체로 생성
			Stream<Path> sr1 = Files.list(path);
			sr1.forEach(p->System.out.println(p.getFileName()));
			System.out.println();
			System.out.println("find() 메소드를 이용하여 스트림 생성");
			//src 디렉터리를 시작해서 10단계까지 디렉터리 깊이까지 탐색
			Stream<Path> sr2 = Files.find(path, 10, 
					(p,BasicAttributes) ->{
						File file1 = p.toFile();
						//디렉터리가 아니고, 파일 이름에 Stream이 포함된 파일명0
						return !file1.isDirectory() && file1.getName().contains("Ex");
					});
			
			
			sr2.forEach(p->System.out.println(p.getFileName()));
	
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} 
			
		

	}

}
