package sp.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableErrorModel extends AbstractTableModel {

    private List<Error> list = new ArrayList<>();

    // mengubah seluruh data
    public void setData(List<Error> list) {
        this.list = list;
        // memberi peringatan ke tabel bahwa data berubah
        fireTableDataChanged();
    }

    public void setRow(List<Object> list) {
        List<Error> data = new ArrayList<>();
        int count = list.size();
        for (int i = 0; i < count; i++) {
            data.add((Error) list.get(i));
        }
        this.list = data;
    }

    // menambah data error
    public void add(Error error) {
        list.add(error);
        // memberi peringatan ke tabel bahwa data bertambah
        fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
    }

    // mengubah data error
    public void edit(int index, Error error) {
        list.set(index, error);
        // memberi peringatan ke tabel bahwa data berubah pada index ke-?
        fireTableRowsUpdated(index, index);
    }

    // menghapus data error
    public void delete(int index) {
        list.remove(index);
        // memberi peringatan ke tabel bahwa data dihapus pada index ke-?
        fireTableRowsDeleted(index, index);
    }

    // mendapatkan error pada baris ke
    public Error get(int row) {
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
        return 3;
    }

    // mendapatkan nilai pada baris ke-? dan kolom ke-?
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getKode();
            case 1:
                return list.get(rowIndex).getDeserror();
            case 2:
                return list.get(rowIndex).getHalaman();
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
                return "Kode Eror";
            case 1:
                return "Deskripsi";
            case 2:
                return "Halaman";
            default:
                return null;
        }
    }
}
