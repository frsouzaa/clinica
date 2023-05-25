package clinica.tabelas;

import clinica.Medico;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class TabelaMedico extends AbstractTableModel {
    private final List<Medico> listaMedicos;
    private final String[] colunas = {"Nome", "CRM", "Telefone", "Especialidade", "Senha"};

    public TabelaMedico(List<Medico> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }

    @Override
    public int getRowCount() {
        return listaMedicos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Medico medico = listaMedicos.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> medico.getNome();
            case 1 -> medico.getCrm();
            case 2 -> medico.getTelefone();
            case 3 -> medico.getEspecialidade();
            case 4 -> medico.getSenha();
            default -> null;
        };
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
}