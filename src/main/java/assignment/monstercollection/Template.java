package assignment.monstercollection;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class Template {
    private static String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static String USER = "C##MONSTERCOLLECTION";
    private static String PASSWORD = "MONSTERCOLLECTION";

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {

        if(sqlSessionFactory == null) {
            Environment environment = new Environment("dev"
                    ,new JdbcTransactionFactory()
                    ,new PooledDataSource(DRIVER,URL,USER,PASSWORD));
            Configuration configuration = new Configuration(environment);

            configuration.addMapper(MonsterMapper.class);

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        }
        SqlSession sqlSession = sqlSessionFactory.openSession(false);


        return sqlSession;
    }
}
