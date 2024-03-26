package JavaComLoianeGroner.Aulas.aula46.dominio;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {

    void abrirConexao();
    void fecharConexao();
}
