package classes_conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import seguro.Equipamento;

public class EquipamentoDAO extends GenericDAO<Equipamento> {

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO equipamento (marca, modelo, numero_serie, quantia, tempo_uso, danos, codigo_os) VALUES (?, ?, ?, ?, ?, ?, ?)";
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setParameters(PreparedStatement stmt, Equipamento equipamento) throws SQLException {
		stmt.setString(1, equipamento.getMarca()); 
        stmt.setString(2, equipamento.getModelo());
        stmt.setString(3, equipamento.getNumeroSerie());
        stmt.setString(4, equipamento.getQuantia());
        stmt.setString(5, equipamento.getTempoUso());
        stmt.setString(6, equipamento.getDanos());
        stmt.setInt(7, equipamento.getCodigoOS());
		
	}

	@Override
	protected Equipamento getEntityFromResultSet(ResultSet rs) throws SQLException {
		return new Equipamento(
				rs.getString("marca"),
				rs.getString("modelo"),
				rs.getString("numeroSerie"),
				rs.getString("quantia"),
				rs.getString("tempoUso"),
				rs.getString("danos"),
				rs.getInt("codigoOS")
		);
	
	}
	
	

}
