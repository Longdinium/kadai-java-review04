package animal;

public class Human extends Animal implements Thinkable {
    // フィールド
    private String hobby; // 趣味

    // getterとsetter
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    // 引数ありのコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age); // スーパークラス(Character)のコンストラクタを呼び出し
        this.hobby = hobby;
    }

    // Thinkableで定義したThinkメソッドのオーバーライド
    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
    }

}
