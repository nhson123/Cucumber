package Steps.tutor.pageFactory;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUtil {

    //Read file content into string with - Files.lines(Path path, Charset cs)

    public static String readLineByLineJava8(String filePath) throws FileNotFoundException {
        String text = "";
        File datei = new File(filePath);
        Scanner sc = new Scanner(datei);
        while (sc.hasNextLine()) {
            text = text + sc.nextLine()+"\n";
        }
        sc.close();
        return text;
    }

    public static List<String> stringToList(String text) throws IOException {
        List<String> a =IOUtils.readLines(new StringReader(text));
        return a;
    }

    public static List<String> listCompare(List<String> a, List<String>b){
        if(a.size()>b.size()){
            a.removeIf(b::contains);
            return a;
        }else {
            b.removeIf(a::contains);
            return b;
        }
    }

    public static void printList(List<String> list){
        for(String a:list){
            System.out.println(a);
        }
    }

    public static List<String> listTrimm(List<String> list){
        List<String> ids = Stream.of("").collect(Collectors.toList());
        for (String s :list){
            if(s.contains("stairid"))
                ids.add(s.substring(24,60));
        }
        return ids;
    }

    public static void main(String[] args) throws IOException {
        String a = "/Users/hnguyen/Desktop/a.txt";
        String b = "/Users/hnguyen/Desktop/b.txt";

        //printList(listCompare(stringToList(readLineByLineJava8(a)),stringToList(readLineByLineJava8(b))));

       List<String> list_a = stringToList(readLineByLineJava8(a));
       List<String> list_b = stringToList(readLineByLineJava8(b));
      List<String> list_c = listCompare(listTrimm(list_a), list_b);
        //printList(list_b);
        //System.out.println("List_a: "+ listTrimm(list_a).size() +" -  List-b: "+list_b.size() +" = "+list_c.size());
       printList(list_c);
/*
        System.out.println(readLineByLineJava8(filePath));
        List<String> lines = IOUtils.readLines(new StringReader(readLineByLineJava8(a)));
        for (String :lines){
            if(s.contains("stairid"))
            System.out.println(a.substring(24,60));
        }
        */


    }
}