package assignment.monstercollection;

public class MonsterDTO {
    private int code;
    private String name;
    private String type;

    private int categoryCode;
    private String feature;

    public MonsterDTO() {
    }

    public MonsterDTO(int code, String name, String type, int categoryCode, String feature) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.categoryCode = categoryCode;
        this.feature = feature;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    @Override
    public String toString() {
        return "MonsterDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", categoryCode=" + categoryCode +
                ", feature='" + feature + '\'' +
                '}';
    }
}
