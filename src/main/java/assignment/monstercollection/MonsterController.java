package assignment.monstercollection;

import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MonsterController {

    private final MonsterService monsterService;
    private final PrintResult printResult;

    public MonsterController() {
        monsterService = new MonsterService();
        printResult = new PrintResult();
    }

    public void selectAllMonster() {

        List<MonsterDTO> monsterList = monsterService.selectAllMonster();

        if(monsterList != null) {
            printResult.printMonsterList(monsterList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }


    public void selectMonsterByCode(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        MonsterDTO monster = monsterService.selectMonsterByCode(code);

        if (monster != null) {
            printResult.printMonster(monster);
        } else {
            printResult.printErrorMessage("selectOne");

    }
}


    public void SearchMonster(Map<String, Object> searchMonster) {

        List<MonsterDTO> monsterList = monsterService.searchMonster(searchMonster);

        if(monsterList != null && monsterList.size() > 0) {
            printResult.searchMonster(monsterList);
        } else {
            printResult.printErrorMessage("searchMonster");
        }
    }

    public void registMonster(Map<String, String> parameter) {

        int categoryCode = Integer.parseInt(parameter.get("category"));
        String name = parameter.get("name");
        String type = parameter.get("type");
        String feature = parameter.get("feature");

        MonsterDTO monster = new MonsterDTO();
        monster.setCategoryCode(categoryCode);
        monster.setName(name);
        monster.setType(type);
        monster.setFeature(feature);

        if (monsterService.registMonster(monster)){
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    public void updateMonster(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));
        String name = parameter.get("name");
        String type = parameter.get("type");
        String feature = parameter.get("feature");

        MonsterDTO monster = new MonsterDTO();
        monster.setCode(code);
        monster.setCategoryCode(categoryCode);
        monster.setName(name);
        monster.setType(type);
        monster.setFeature(feature);

        if (monsterService.updateMonster(monster)){
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }


    }

    public void deleteMonster(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        if (monsterService.deleteMonster(code)){
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }
}

