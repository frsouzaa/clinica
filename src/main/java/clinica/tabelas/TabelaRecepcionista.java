package clinica.tabelas;
import javax.swing.table.AbstractTableModel;
import clinica.Recepcionista;
import java.util.List;

public class TabelaRecepcionista extends AbstractTableModel {
    private final List<Recepcionista> listaRecepcionistas;
    private final String[] colunas = {"Nome", "Telefone", "Senha", "CPF"};

    public TabelaRecepcionista(List<Recepcionista> listaRecepcionistas) {
        this.listaRecepcionistas = listaRecepcionistas;
    }

    @Override
    public int getRowCount() {
        return listaRecepcionistas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Recepcionista recepcionista = listaRecepcionistas.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> recepcionista.getNome();
            case 1 -> recepcionista.getTelefone();
            case 2 -> recepcionista.getSenha();
            case 3 -> recepcionista.getCpf();
            default -> null;
        };
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
}