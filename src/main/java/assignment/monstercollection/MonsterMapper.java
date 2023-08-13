package assignment.monstercollection;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface MonsterMapper {
    List<MonsterDTO> selectAllMonster();
    MonsterDTO selectMonsterByCode(int code);
    List<MonsterDTO> searchMonster(Map<String, Object> search);

    int insertMonster(MonsterDTO monster);

    int updateMonster(MonsterDTO monster);

    int deleteMonster(int code);
}
