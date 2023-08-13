package assignment.monstercollection;

import java.util.List;

public class PrintResult {
    public void printMonsterList(List<MonsterDTO> monsterList) {
        monsterList.forEach(System.out::println);
    }
    public void printMonster(MonsterDTO monster) {
        System.out.println(monster);
    }
    public void searchMonster(List<MonsterDTO> monsterList) {
        monsterList.forEach(System.out::println);
    }


    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "메뉴 전체 조회에 실패하였습니다."; break;
            case "selectOne" : errorMessage = "코드 조회에 실패하였습니다."; break;
            case "searchMonster" : errorMessage = "검색 결과가 존재하지 않습니다."; break;
            case "insert" : errorMessage = "등록에 실패하였습니다."; break;
            case "update" : errorMessage = "수정에 실패하였습니다."; break;
            case "delete" : errorMessage = "삭제에 실패하였습니다."; break;
        }
        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "insert" : successMessage = "등록 완료 !"; break;
            case "update" : successMessage = "수정이 완료 되었습니다."; break;
            case "delete" : successMessage = "삭제가 완료 되었습니다."; break;
        }
        System.out.println(successMessage);
    }
}
