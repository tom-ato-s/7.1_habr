//прогорамма из коллекции с неуникальтыми значениями переводт в коллекцию с уникальными
//https://habr.com/ru/post/440436/



import java.util.Collection;
import java.util.HashSet;

public class Set {

 public static <T> Collection<T> remuveDublicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
