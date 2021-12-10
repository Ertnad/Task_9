package ru.vsu.sc.tretyakov_d_s;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;
import ru.vsu.sc.tretyakov_d_s.CmdArgs.CmdParams;
import ru.vsu.sc.tretyakov_d_s.Utils.ArrayAndListUtils;

public class ConsoleMain {

  public static void main(String[] args) throws Exception {

    CmdArgs.CmdParams params = CmdArgs.parseArgs(args);

    if (params.help) {
      printHelp(params.error);
      System.exit(params.error ? 1 : 0);
    } else if (params.window) {
      GuiMain.main(args);
    } else {
      printResult(params);
    }
  }

  private static void printHelp(boolean error) {
    PrintStream out = error ? System.err : System.out;
    out.println("Usage: ");
    out.println("  <cmd> args <n> <input-file> (<output-file>)");
    out.println("  <cmd> --help");
    out.println("  <cmd> --window  // show window");
  }

  private static List<Integer> executeCheck(CmdParams params) {
    List<Integer> list = ArrayAndListUtils.readListFromFile(params.inputFile);

    if (list == null) {
      System.err.printf("Can't read list from \"%s\"%n", params.inputFile);
      System.exit(2);
    }

    Solution solution = new Solution();
    return solution.createNewList(list, params.n);
  }

  private static void printResult(CmdArgs.CmdParams params)
      throws FileNotFoundException {
    PrintStream out = (params.outputFile != null) ? new PrintStream(params.outputFile) : System.out;
    out.println(executeCheck(params));
    out.close();
  }
}
