package classes_conexao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import seguro.Equipamento;

public class EquipamentoDAO extends GenericDAO<Equipamento> {
	
	private ArrayList<Equipamento> equipamentos = new ArrayList<>();

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO equipamento (marca, modelo, numero_serie, quantia, tempo_uso, danos, foto, codigo_os) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	}

	@Override
	protected String getUpdateQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getDeleteQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getSelectQuery() {
		return "SELECT marca, modelo, numero_serie, quantia, tempo_uso, danos, foto, codigo_os FROM equipamento WHERE codigo_os = ?";
	}
	
	public ArrayList<Equipamento> buscarEquipamentosPorOS(int codigo_os) {
		String sql = getSelectQuery();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DatabaseConnection.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, codigo_os);
            rs = stmt.executeQuery();

            while (rs.next()) { // Itera sobre o ResultSet
                Equipamento equipamento = getEntityFromResultSet(rs); // Cria o objeto Equipamento
                equipamentos.add(equipamento); // Adiciona o objeto à lista
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeResultSet(rs);
            DatabaseConnection.closeStatement(stmt);
            DatabaseConnection.closeConnection(conn);
        }
        return equipamentos;
	}

	@Override
	protected void setParameters(PreparedStatement stmt, Equipamento equipamento) throws SQLException {
		stmt.setString(1, equipamento.getMarca()); 
        stmt.setString(2, equipamento.getModelo());
        stmt.setString(3, equipamento.getNumeroSerie());
        stmt.setString(4, equipamento.getQuantia());
        stmt.setString(5, equipamento.getTempoUso());
        stmt.setString(6, equipamento.getDanos());
        stmt.setBlob(7, equipamento.getFis(), equipamento.getTamanho());
        stmt.setInt(8, equipamento.getCodigoOS());
		
	}

	@Override
	protected Equipamento getEntityFromResultSet(ResultSet rs) throws SQLException {
		// Obtém o Blob da coluna "foto"
	    Blob fotoBlob = rs.getBlob("foto");
	    byte[] foto = null;

	    // Converte o Blob para byte[]
	    if (fotoBlob != null) {
	        foto = fotoBlob.getBytes(1, (int) fotoBlob.length());
	    }
		return new Equipamento(
				rs.getString("marca"),
				rs.getString("modelo"),
				rs.getString("numero_serie"),
				rs.getString("quantia"),
				rs.getString("tempo_uso"),
				rs.getString("danos"),
				foto,
				rs.getInt("codigo_os")
		);
	
	}
	
	

}
