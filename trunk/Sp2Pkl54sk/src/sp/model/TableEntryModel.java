package sp.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableEntryModel extends AbstractTableModel {

    private List<Dsartb4> list = new ArrayList<>();

    public TableEntryModel() {
        setData(list);
    }

    public List<Dsartb4> getList() {
        return list;
    }

    // mengubah seluruh data
    public void setData(List<Dsartb4> list) {
        this.list = list;
        // memberi peringatan ke tabel bahwa data berubah
        fireTableDataChanged();
    }

    public void setRow(List<Object> list) {
        List<Dsartb4> data = new ArrayList<>();
        int count = list.size();
        for (int i = 0; i < count; i++) {
            data.add((Dsartb4) list.get(i));
        }
        this.list = data;
    }

    // menambah data blok1
    public void add(Dsartb4 blok1) {
        list.add(blok1);
        // memberi peringatan ke tabel bahwa data bertambah
        fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
    }

    // mengubah data blok1
    public void edit(int index, Dsartb4 blok1) {
        list.set(index, blok1);
        // memberi peringatan ke tabel bahwa data berubah pada index ke-?
        fireTableRowsUpdated(index, index);
    }

    // menghapus data blok1
    public void delete(int index) {
        list.remove(index);
        // memberi peringatan ke tabel bahwa data dihapus pada index ke-?
        fireTableRowsDeleted(index, index);
    }

    // mendapatkan blok1 pada baris ke
    public Dsartb4 get(int row) {
        return list.get(row);
    }

    // mendapatkan total baris
    @Override
    public int getRowCount() {
        return list.size();
    }

    // mendapatkan total kolom
    @Override
    public int getColumnCount() {
        return 4;
    }

    // mendapatkan nilai pada baris ke-? dan kolom ke-?
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                return list.get(rowIndex).getB4r3();
            case 1:
                return list.get(rowIndex).getNuart();
            case 2:
                return list.get(rowIndex).getB4r4().getKeterangan();
            default:
                return null;
        }
    }

//    @Override
//    public Class getColumnClass(int columnIndex) {
//        if (columnIndex == 3) {
//            return Boolean.class;
//        } else {
//            return super.getColumnClass(columnIndex);
//        }
//    }
    @Override
    // mendapatkan nama kolom pada index ke-?
    public String getColumnName(int column) {
        switch (column) {

            case 0:
                return "Nama";
            case 1:
                return "No NKS";
            case 2:
                return "JK";
            case 3:
                return "Clean";
            default:
                return null;
        }
    }
}
