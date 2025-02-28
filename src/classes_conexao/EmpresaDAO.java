package classes_conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import seguro.Empresa;
import seguro.Laudo;

public class EmpresaDAO extends GenericDAO<Empresa> {

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO empresa (nome, cnpj, tecnico, empresa_tecnico, endereco, bairro, cidade, cep, "
				+ "data_acidente, hora_acidente, descricao, email, telefone, codigo_os) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
		return "Select nome, cnpj, tecnico, empresa_tecnico, endereco, bairro, cidade, cep, data_acidente, hora_acidente, descricao, email, telefone, codigo_os"
				+ " FROM empresa WHERE codigo_os = ?";
	}

	@Override
	public Empresa buscarPorOS(int codigo_os) {
		String sql = getSelectQuery();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Empresa empresa = null;

        try {
            conn = DatabaseConnection.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, codigo_os);
            rs = stmt.executeQuery();

            if (rs.next()) {
                empresa = getEntityFromResultSet(rs);
            } else {
            	System.out.println("vai tomar no cu");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeResultSet(rs);
            DatabaseConnection.closeStatement(stmt);
            DatabaseConnection.closeConnection(conn);
        }
        return empresa;
	}


	@Override
	protected void setParameters(PreparedStatement stmt, Empresa empresa) throws SQLException {
		stmt.setString(1, empresa.getNome()); 
        stmt.setLong(2, empresa.getCnpj());
        stmt.setString(3, empresa.getResponsavelTecnico());
        stmt.setString(4, empresa.getEmpresaResponsavelTecnico());
        stmt.setString(5, empresa.getEndereco());
        stmt.setString(6, empresa.getBairro());
        stmt.setString(7, empresa.getCidade());
        stmt.setInt(8, empresa.getCep());
        stmt.setString(9, empresa.getDataAcidente());
        stmt.setString(10, empresa.getHoraAcidente());
        stmt.setString(11, empresa.getDescricao());
        stmt.setString(12, empresa.getEmail());
        stmt.setString(13, empresa.getTelefone());
        stmt.setInt(14, empresa.getCodigoOS());
    
	}

	@Override
	protected Empresa getEntityFromResultSet(ResultSet rs) throws SQLException {
		return new Empresa(
				rs.getString("nome"),
				rs.getLong("cnpj"),
				rs.getString("tecnico"),
				rs.getString("empresa_tecnico"),
				rs.getString("endereco"),
				rs.getString("bairro"),
				rs.getString("cidade"),
				rs.getInt("cep"),
				rs.getString("data_acidente"),
				rs.getString("hora_acidente"),
				rs.getString("descricao"),
				rs.getString("email"),
				rs.getString("telefone"),
				rs.getInt("codigo_os")
		);
	}

}
