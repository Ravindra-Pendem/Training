package com.stackroute;
import java.util.Scanner;
public class newspr {
    int id;
    String title,content,category,editor;

    public void getter() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter news id:");
        id = sc.nextInt();
        System.out.println();

        System.out.print("Enter news title:");
        title = sc.next();
        System.out.println();

        System.out.print("Enter news content:");
        content = sc.next();
        System.out.println();

        System.out.print("Enter news Category:");
        category = sc.next();
        System.out.println();

        System.out.print("Enter news Editor:");
        editor = sc.next();
        System.out.println();

    }
    public void setter(){
        System.out.print("News id is : "+id);
        System.out.println();

        System.out.print("News title is : "+title);
        System.out.println();

        System.out.print("News content is : "+content);
        System.out.println();

        System.out.print("News category is : "+category);
        System.out.println();

        System.out.print("News editor is : "+editor);
        System.out.println();
    }

    public static void main(String args[]){
        newspr nw = new newspr();
        nw.getter();
        nw.setter();
    }
}
