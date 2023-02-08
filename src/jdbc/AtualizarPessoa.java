package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizarPessoa {
    public static void main(String[] args) throws SQLException  {
        Scanner entrada = new Scanner(System.in);

        Connection conexao = FabricaConexao.getConexao();
        String sql = "UPDATE pessoas SET nome = ? where codigo = ?";

        System.out.print("Informe o id: ");
        String codigo = entrada.nextLine();

        System.out.print("Informe o novo nome: ");
        String nome = entrada.nextLine();

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, codigo);
        stmt.execute();

        stmt.close();
        conexao.close();

        entrada.close();
    }
}
