//Создать класс Pet (домашнее животное). В классе должны быть:
//•	enum Kind для вида животного (DOG, CAT, OTHER);
//•	поля:
//o	"вид животного" (тип Kind),
//o	"кличка" (тип String),
//o	"дата рождения" (тип String),
//o	вес (тип double);
//•	конструктор, сеттеры, геттеры;

public class Pet {
  private Kind kind;
  private String name;
  private String birth;
  public double weight;

  public Pet(String name, String birth, double weight) {
    this.name = name;
    this.birth = birth;
    this.weight = weight;
  }



  public double getWeight() {
    return weight;
  }

  public Kind getKind() {
    return kind;
  }

  public String getBirth() {
    return birth;
  }

  public String getName() {
    return name;
  }

  public void setBirth(String birth) {
    this.birth = birth;
  }

  public void setKind(Kind kind) {
    this.kind = kind;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  //•	статический метод для создания животного при прочтении данных из строки "dog,кличка",
// "cat,кличка,вес", "turtle,кличка,вес,дата рождения".
//Создать класс Main, в котором данные будут считываться с консоли и красиво выводиться на экран.
//Формат входных данных: количество строк с записями о домашних животных,
// затем сами записи в описанном формате.
  public static Pet createAnimal(Kind DOG, String name) {
    return new Pet();
  }
  public static Pet createAnimal(Kind CAT, String name, Double weight) {
    return new Pet();
  }
  public static Pet createAnimal(Kind Other, String name, Double weight, String birth) {
    return new Pet();
  }
}
