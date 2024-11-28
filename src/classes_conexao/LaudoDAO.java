package classes_conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import seguro.Laudo;

public class LaudoDAO extends GenericDAO<Laudo> {

	@Override
	public Laudo buscarPorOS(int codigo_os) {
        String sql = getSelectQuery();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Laudo laudo = null;

        try {
            conn = DatabaseConnection.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, codigo_os);
            rs = stmt.executeQuery();

            if (rs.next()) {
                laudo = getEntityFromResultSet(rs);
                System.out.println(laudo);
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
        return laudo;
	}

	@Override
	protected String getInsertQuery() {
		return null;
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
		return "SELECT nome, cnpj, tecnico, empresa_tecnico, endereco, bairro, cidade, cep, data_acidente,\r\n"
				+ "hora_acidente, descricao, email, telefone, marca, modelo, numero_serie, quantia, tempo_uso,\r\n"
				+ "danos, empresa.codigo_os FROM empresa \r\n"
				+ "INNER JOIN equipamento\r\n"
				+ "ON empresa.codigo_os =\r\n"
				+ "equipamento.codigo_os WHERE empresa.codigo_os = ?";
	}

	@Override
	protected void setParameters(PreparedStatement stmt, Laudo laudo) throws SQLException {
		
		stmt.setString(1, laudo.getNome()); 
        stmt.setLong(2, laudo.getCnpj());
        stmt.setString(3, laudo.getResponsavelTecnico());
        stmt.setString(4, laudo.getEmpresaResponsavelTecnico());
        stmt.setString(5, laudo.getEndereco());
        stmt.setString(6, laudo.getBairro());
        stmt.setString(7, laudo.getCidade());
        stmt.setInt(8, laudo.getCep());
        stmt.setString(9, laudo.getDataAcidente());
        stmt.setString(10, laudo.getHoraAcidente());
        stmt.setString(11, laudo.getDescricao());
        stmt.setString(12, laudo.getTelefone());
        stmt.setString(13, laudo.getEmail());
        stmt.setString(14, laudo.getMarca()); 
        stmt.setString(15, laudo.getModelo());
        stmt.setString(16, laudo.getNumeroSerie());
        stmt.setString(17, laudo.getQuantia());
        stmt.setString(18, laudo.getTempoUso());
        stmt.setString(19, laudo.getDanos());
        stmt.setInt(20, laudo.getCodigoOS());;
	}

	@Override
	protected Laudo getEntityFromResultSet(ResultSet rs) throws SQLException {
		return new Laudo(
				
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
				rs.getString("telefone"),
				rs.getString("email"),
				rs.getString("marca"),
				rs.getString("modelo"),
				rs.getString("numero_serie"),
				rs.getString("quantia"),
				rs.getString("tempo_uso"),
				rs.getString("danos"),
				rs.getInt("codigo_os")
		);
		
	}
	

}
