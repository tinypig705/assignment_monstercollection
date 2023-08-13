package assignment.monstercollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MonsterController monsterController = new MonsterController();

        do{
            System.out.println("========== 몬스터 컬렉션 ==========");
            System.out.println("1. 몬스터 전체 조회");
            System.out.println("2. 몬스터 코드로 몬스터 조회");
            System.out.println("3. 검색으로 조회");
            System.out.println("4. 몬스터 신규추가 / 수정 / 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 번호 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : monsterController.selectAllMonster(); break;
                case 2 : monsterController.selectMonsterByCode(inputMonsterCode()); break;
                case 3 : monsterController.SearchMonster(inputSearchMonster()); break;
                case 4 : subMonsterMenu(); break;
                case 9 : return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }while(true);
    }



    private static Map<String, String> inputMonsterCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("몬스터 코드 입력 : ");
        String code = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("code",code);

        return parameter;
    }
    private static Map<String,Object> inputSearchMonster() {
        Scanner sc = new Scanner(System.in);

        System.out.print("검색 기준 입력(name / category) : ");
        String condition = sc.nextLine();

        Map<String, Object> search = new HashMap<>();
        if("category".equals(condition)){
            System.out.println("======= 코드 번호로 입력하세요. =======");
            System.out.println("1.포켓몬 2.디지몬 3.메이플스토리 4.기타");
            System.out.print("코드 입력 : ");
            int categoryValue = sc.nextInt();
            search.put("categoryValue",categoryValue);

        } else if ("name".equals(condition)) {
            System.out.print("검색할 이름 입력 : ");
            String nameValue = sc.nextLine();
            search.put("nameValue", nameValue);

        }
        return search;
    }
    private static void subMonsterMenu() {
        Scanner sc = new Scanner(System.in);
        MonsterController monsterController = new MonsterController();

        do{
            System.out.println("====== 서브 메뉴창 ======");
            System.out.println("1. 신규 몬스터추가");
            System.out.println("2. 몬스터정보 수정");
            System.out.println("3. 몬스터 삭제");
            System.out.println("9. 이전으로");
            System.out.print("메뉴 번호 입력 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : monsterController.registMonster(inputMonster()); break;
                case 2 : monsterController.updateMonster(inputModifyMonster()); break;
                case 3 : monsterController.deleteMonster(inputMonsterCode()); break;
                case 9 : return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        } while (true);


    }


    private static Map<String, String> inputMonster() {

        Scanner sc = new Scanner(System.in);
        System.out.println("1.포켓몬 / 2.디지몬 / 3.메이플스토리 / 4.기타");
        System.out.print("카테고리 번호 선택 : ");
        String category = sc.nextLine();
        System.out.print("몬스터 이름 입력 : ");
        String name = sc.nextLine();
        System.out.print("몬스터 타입(속성) 입력 : ");
        String type = sc.nextLine();
        System.out.print("몬스터 특징 입력 : ");
        String feature = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("category",category);
        parameter.put("name",name);
        parameter.put("type",type);
        parameter.put("feature", feature);


        return parameter;
    }

    private static Map<String, String> inputModifyMonster() {
        Scanner sc = new Scanner(System.in);
        System.out.print("몬스터 코드로 수정을 시작합니다 : ");
        String code = sc.nextLine();
        System.out.print("수정할 몬스터 이름 : ");
        String name = sc.nextLine();
        System.out.print("수정할 몬스터타입(속성) : ");
        String type = sc.nextLine();
        System.out.print("수정할 몬스터특징 : ");
        String feature = sc.nextLine();
        System.out.println("1.포켓몬 / 2.디지몬 / 3.메이플스토리 / 4.기타");
        System.out.print("수정할 카테고리 코드 :");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("type", type);
        parameter.put("feature", feature);
        parameter.put("categoryCode", categoryCode);

        return parameter;
    }



}
