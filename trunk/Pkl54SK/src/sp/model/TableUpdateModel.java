package sp.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableUpdateModel extends AbstractTableModel {

    private List<B1> list = new ArrayList<>();

    public List<B1> getList() {
        return list;
    }

    // mengubah seluruh data
    public void setData(List<B1> list) {
        this.list = list;
        // memberi peringatan ke tabel bahwa data berubah
        fireTableDataChanged();
    }

    public void setRow(List<Object> list) {
        List<B1> data = new ArrayList<>();
        int count = list.size();
        for (int i = 0; i < count; i++) {
            data.add((B1) list.get(i));
        }
        this.list = data;
    }

    // menambah data blok1
    public void add(B1 blok1) {
        list.add(blok1);
        // memberi peringatan ke tabel bahwa data bertambah
        fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
    }

    // mengubah data blok1
    public void edit(int index, B1 blok1) {
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
    public B1 get(int row) {
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
                return list.get(rowIndex).getB1r7();
            case 1:
                return list.get(rowIndex).getB1r3();
            case 2:
                return list.get(rowIndex).getTimestamp();
            case 3:
                return list.get(rowIndex).getFlag();
            case 4:
                return list.get(rowIndex).getNks();
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
                return "Kelurahan";
            case 2:
                return "Waktu";
            case 3:
                return "Flag";
            case 4:
                return "nks";
            default:
                return null;
        }
    }
}
