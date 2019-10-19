package swingexample;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Table Example");
        String[][] data = {
                {"101", "Amit", "670000"}, {"102"},
                {"102", "Jai", "780000"},
                {"101", "Sachin", "700000"}
        };
        String[] column = {"ID", "NAME", "SALARY"};
        final JTable jt = new JTable(data, column);
        jt.setCellSelectionEnabled(true);
        ListSelectionModel select = jt.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                String data = null;
                int[] rows = jt.getSelectedRows();
                int[] columns = jt.getSelectedColumns();
                for (int row : rows) {
                    for (int col : columns) {
                        data = (String) jt.getValueAt(row, col);
                    }
                }
                System.out.println("Table element selected is: " + data);
            }
        });
        JScrollPane sp = new JScrollPane(jt);
        jt.setBounds(10, 10, 200, 200);
        f.add(sp);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
