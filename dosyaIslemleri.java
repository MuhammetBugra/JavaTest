package helloworld;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class dosyaIslemleri {
	public static void main(String[] args) throws IOException {
	File file=new File("kod.txt");
	if(!file.exists()) {
	file.createNewFile(); }
	String val="kodlama";
	FileWriter fwriter= new FileWriter(file,false);
	BufferedWriter bwriter= new BufferedWriter(fwriter);
	bwriter.write(val);
	bwriter.close();
	FileReader fReader=new FileReader(file);
	String line;
	BufferedReader bReader= new BufferedReader(fReader);
	while((line=bReader.readLine())!=null) {
		System.out.println(line);
	}
} }
