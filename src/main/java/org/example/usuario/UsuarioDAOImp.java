package org.example.usuario;
import lombok.extern.java.Log;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
@Log
public class UsuarioDAOImp implements UsuarioDAO{

    private Connection connection;

    private static final String QUERY_LOAD = "SELECT * FROM usuario where id = ?";

    public UsuarioDAOImp(Connection conn){
        connection=conn;
    }

    @Override
    public Usuario load(Long id) {
        Usuario salida = null;

        try(var pst = connection.prepareStatement(QUERY_LOAD)) {
            log.info(QUERY_LOAD);
            log.info(id.toString());
            pst.setLong(1,id);
            var rs = pst.executeQuery();

            if(rs.next()){
                salida = new Usuario();
                salida.setId_usuario(rs.getLong("id"));
                salida.setNombre(rs.getString("nombre"));
                salida.setEmail(rs.getString("email"));
                salida.setPassword(rs.getString("password"));
                log.info(salida.toString());
            }else{
                log.warning("User not found");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return salida;
    }

    @Override
    public ArrayList<Usuario> loadAll() {
        return null;
    }

    @Override
    public Usuario save(Usuario t) {
        return null;
    }

    @Override
    public Usuario update(Usuario t) {
        return null;
    }

    @Override
    public void remove(Usuario t) {

    }
}
