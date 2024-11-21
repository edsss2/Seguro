package classes_conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import seguro.Empresa;

public class EmpresaDAO extends GenericDAO<Empresa> {

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO empresa (nome, cnpj) VALUES (?, ?)";
	}

	@Override
	protected String getUpdateQuery() {
		return null;
	}

	@Override
	protected String getDeleteQuery() {
		return "DELETE FROM empresa WHERE nome = ?";
	}

	@Override
	protected String getSelectQuery() {
		return "SELECT * FROM empresa WHERE nome = ?";
	}

	@Override
	protected void setParameters(PreparedStatement stmt, Empresa empresa) throws SQLException {
		stmt.setString(1, empresa.getNome()); 
        stmt.setString(2, empresa.getCnpj());
    
	}

	@Override
	protected Empresa getEntityFromResultSet(ResultSet rs) throws SQLException {
		return new Empresa(
				rs.getString("nome"),
				rs.getString("cnpj")
		);
	}

}
