package assignment.monstercollection;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static assignment.monstercollection.Template.getSqlSession;

public class MonsterService {
    private MonsterMapper mapper;

    public List<MonsterDTO> selectAllMonster() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MonsterMapper.class);

        List<MonsterDTO> monsterList = mapper.selectAllMonster();

        sqlSession.close();

        return monsterList;
    }

    public MonsterDTO selectMonsterByCode(int code) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MonsterMapper.class);

        MonsterDTO monster = mapper.selectMonsterByCode(code);

        sqlSession.close();

        return monster;
    }

    public List<MonsterDTO> searchMonster(Map<String, Object> searchMonster) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MonsterMapper.class);

        List<MonsterDTO> monsterList = mapper.searchMonster(searchMonster);

        sqlSession.close();

        return monsterList;
    }

    public boolean registMonster(MonsterDTO monster) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MonsterMapper.class);

        int result = mapper.insertMonster(monster);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ;


    }

    public boolean updateMonster(MonsterDTO monster) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MonsterMapper.class);

        int result = mapper.updateMonster(monster);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ;
    }

    public boolean deleteMonster(int code) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MonsterMapper.class);

        int result = mapper.deleteMonster(code);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ;
    }
}
