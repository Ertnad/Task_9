package ru.vsu.sc.tretyakov_d_s;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import ru.vsu.sc.tretyakov_d_s.Utils.ArrayAndListUtils;
import ru.vsu.sc.tretyakov_d_s.Utils.JTableUtils;
import ru.vsu.sc.tretyakov_d_s.Utils.SwingUtils;

public class FrameMain extends JFrame {

  private JPanel panelMain;
  private JButton loadAnListFromButton;
  private JButton fillWithRandomNumbersButton;
  private JButton outputRepetitiveNumbersInButton;
  private JTextField textField1;
  private JButton saveTheListToButton;
  private JButton saveTheAnswerToButton;
  private JTable table1;
  private JTextField writeHereTheValueTextField;
  private JFileChooser fileChooserOpen;
  private JFileChooser fileChooserSave;
  private JMenuBar menuBarMain;

  public FrameMain() {
    this.setTitle("Task 9");
    this.setContentPane(panelMain);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();

    Solution solution = new Solution();

    JTableUtils.initJTableForArray(table1, 60, true, true, false, true, 25, 15);
    table1.setRowHeight(25);

    fileChooserOpen = new JFileChooser();
    fileChooserSave = new JFileChooser();
    fileChooserOpen.setCurrentDirectory(new File("."));
    fileChooserSave.setCurrentDirectory(new File("."));
    FileFilter filter = new FileNameExtensionFilter("Text files", "txt");
    fileChooserOpen.addChoosableFileFilter(filter);
    fileChooserSave.addChoosableFileFilter(filter);

    fileChooserSave.setAcceptAllFileFilterUsed(false);
    fileChooserSave.setDialogType(JFileChooser.SAVE_DIALOG);
    fileChooserSave.setApproveButtonText("Save");

    menuBarMain = new JMenuBar();
    setJMenuBar(menuBarMain);

    loadAnListFromButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        try {
          if (fileChooserOpen.showOpenDialog(panelMain) == JFileChooser.APPROVE_OPTION) {
            int[][] arr = ArrayAndListUtils.readIntArray2FromFile(fileChooserOpen.getSelectedFile().getPath());
            assert arr != null;
            JTableUtils.writeArrayToJTable(table1, arr, "%d");
          }
        } catch (Exception e) {
          SwingUtils.showErrorMessageBox(e);
        }
      }
    });
    fillWithRandomNumbersButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        try {
          int[][] matrix = ArrayAndListUtils.createRandomIntMatrix(
              table1.getRowCount(), table1.getColumnCount(), 0, 100);
          JTableUtils.writeArrayToJTable(table1, matrix, "%d");
        } catch (Exception e) {
          SwingUtils.showErrorMessageBox(e);
        }
      }
    });
    saveTheListToButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        try {
          if (fileChooserSave.showSaveDialog(panelMain) == JFileChooser.APPROVE_OPTION) {
            Integer[][] matrix = JTableUtils.readIntMatrixFromJTable(table1, Integer.class, Integer::parseInt, false, 0);
            String file = fileChooserSave.getSelectedFile().getPath();
            if (!file.toLowerCase().endsWith(".txt")) {
              file += ".txt";
            }
            ArrayAndListUtils.writeArrayToFile(file, matrix);
          }
        } catch (Exception e) {
          SwingUtils.showErrorMessageBox(e);
        }
      }
    });
    outputRepetitiveNumbersInButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        try {
          int[] array = JTableUtils.readIntArrayFromJTable(table1);
          List<Integer> list = ArrayAndListUtils.intArrayToList(array);
          double n = Double.parseDouble(writeHereTheValueTextField.getText());
          textField1.setText(String.valueOf(solution.createNewList(list, n)));
        } catch (Exception e) {
          SwingUtils.showErrorMessageBox(e);
        }
      }
    });
    saveTheAnswerToButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        try {
          if (fileChooserSave.showSaveDialog(panelMain) == JFileChooser.APPROVE_OPTION) {
            Integer[][] matrix = JTableUtils.readIntMatrixFromJTable(table1, Integer.class,
                Integer::parseInt, false, 0);
            String file = fileChooserSave.getSelectedFile().getPath();
            if (!file.toLowerCase().endsWith(".txt")) {
              file += ".txt";
            }
            ArrayAndListUtils.writeArrayToFile(file, matrix);
          }
        } catch (Exception e) {
          SwingUtils.showErrorMessageBox(e);
        }
      }
    });
  }
}
