package classes_conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class GenericDAO<T> {
	
	// Método abstrato para query de inserção
    protected abstract String getInsertQuery();

    // Método abstrato para query de atualização
    protected abstract String getUpdateQuery();

    // Método abstrato para query de deletar
    protected abstract String getDeleteQuery();

    // Método abstrato para query de busca
    protected abstract String getSelectQuery();

    // Define os parâmetros da query
    protected abstract void setParameters(PreparedStatement stmt, T entity) throws SQLException;

    // Define os parâmetros para buscar por chave única
    protected abstract T getEntityFromResultSet(ResultSet rs) throws SQLException;
	
	// Salvar um novo objeto no banco de dados
    public void salvar(T entity) {
        String sql = getInsertQuery();
        executeUpdate(sql, entity);
    }
    
 // Método genérico para executar inserts/updates
    private void executeUpdate(String sql, T entity) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DatabaseConnection.getConnection();
            stmt = conn.prepareStatement(sql);
            setParameters(stmt, entity);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeStatement(stmt);
            DatabaseConnection.closeConnection(conn);
        }
    }

}
