package interpreter;

import java.io.FileReader;
import java.io.StringReader;
import java.util.Scanner;

import parser.FProlog;
import parser.ast.FPProg;

public class Main {

  public static void main(String[] args) {
    try(Scanner s = new Scanner(new FileReader(args[0]));) {

      StringBuilder sb = new StringBuilder();
      while (s.hasNext()) {
        sb.append(s.next());
      }
      String str = sb.toString();

      FPProg ast = new FProlog(new StringReader(str)).P();

      System.out.println(ast.toString());

      // TODO: interpret the ast.

    } catch (Exception e) {
      System.err.println(e.toString());
    }
  }
}