package retry2.demo.config;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@AllArgsConstructor
public class retryabledatasource extends AbstractDataSource {

    private final DataSource dataSource;

    @Override
    @Retryable(maxAttempts = 5, backoff = @Backoff(multiplier = 1.3, maxDelay = 10000))
    public Connection getConnection() throws SQLException {
        System.out.print("getting connection ...");
        return dataSource.getConnection();
    }

    @Override
    @Retryable(maxAttempts = 5, backoff = @Backoff(multiplier = 1.3, maxDelay = 10000))
    public Connection getConnection(String username, String password) throws SQLException {
        System.out.print("getting connection by username and password ...");
        return dataSource.getConnection(username, password);
    }
}