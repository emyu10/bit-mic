package pos.saam.user;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class UserTableModel implements TableModel {
    private ArrayList<User> users = new ArrayList<>();

    public void addUser(User user) {
        this.users.add(user);
    }
    @Override
    public int getRowCount() {
        return this.users.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int i) {
        String[] columnNames = {"ID", "Username", "Full Name", "Password", "Active", "Admin", "Added Date"};
        return columnNames[i];
    }

    @Override
    public Class<?> getColumnClass(int i) {
        Class[] columnClasses = {Integer.class, String.class, String.class, String.class, Boolean.class, Boolean.class, LocalDateTime.class};
        return columnClasses[i];
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        return null;
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {

    }

    @Override
    public void addTableModelListener(TableModelListener tableModelListener) {

    }

    @Override
    public void removeTableModelListener(TableModelListener tableModelListener) {

    }
}
